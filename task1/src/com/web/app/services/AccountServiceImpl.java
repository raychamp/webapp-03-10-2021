package com.web.app.services;

import javax.naming.AuthenticationException;

import org.springframework.beans.factory.annotation.Autowired;
import com.web.app.model.Account;
import com.web.app.repository.AccountRepository;

//@Service
//@Transactional(readOnly = true)
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountRepository accountRepository;

//	@Override
//	@Transactional(readOnly = false)
	public Account save(Account account) {
		return this.accountRepository.save(account);
	}

	@Override
	public Account login(String username, String password) throws AuthenticationException {
		Account account = this.accountRepository.findByUsername(username);
		if (account != null) {
			String pwd = password ;
			if (!account.getPassword().equalsIgnoreCase(pwd)) {
				throw new AuthenticationException("Wrong username/password combination.");
			}
		} else {
			throw new AuthenticationException("Wrong username/password combination.");
		}

		return account;
	}

	@Override
	public Account getAccount(String username) {
		return this.accountRepository.findByUsername(username);
	}
}