'use strict'

angular.module('myApp').controller('LoginController', ['$scope', 'LoginService', function($scope, LoginService){

var self = this;
	self.user={id:null,firstName:'',lastName:'',username:'',password:'',address:'',email:''};
	self.users=[];

	self.submit = submit;

	login();

	function login(){
		LoginService.login(username, password)
		.then(
			function(d){
				self.users = d;
			},
			function(errResponse){
				console.error('Error loging into service');
			}
		)
	};

}]);