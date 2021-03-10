/**
 * 
 */

 'user strict'

 angular.module('myApp').factory('LoginService', ['$http', 'q', function($http, $q)
{
var REST_SERVICE_URI = 'http://localhost:8080/task1/login/';

var factory = {
	login: login
};

return factory;

function login(){
	var deferred = $q.defer();
	$http.get(REST_SERVICE_URI+username, password)//Calls spring mvc controller with /login/+ username and password
	.then(
		function (response){
			deferred.resolve(response.data);
		},
		function(errResponse){
			console.error('Error loging user into app');
			deferred.reject(errResponse);

		}
	);
}

}]);