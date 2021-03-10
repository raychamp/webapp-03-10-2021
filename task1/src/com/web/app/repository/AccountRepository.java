package com.web.app.repository;

import com.web.app.model.Account;

public interface AccountRepository {

    Account findByUsername(String username);

    Account findById(long id);

    Account save(Account account);

}
