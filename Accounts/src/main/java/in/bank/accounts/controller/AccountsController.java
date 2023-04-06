package in.bank.accounts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.bank.accounts.model.AccountsModel;
import in.bank.accounts.model.CustomerModel;
import in.bank.accounts.repository.AccountsRepository;

@RestController
public class AccountsController {
	@Autowired
	private AccountsRepository accountsRepository;
	@PostMapping("/accounts")
	public AccountsModel getAccountDetails(@RequestBody CustomerModel customer) {
		
		AccountsModel accounts = accountsRepository.findByCustomerId(customer.getCustomerId());
		return accounts;
	}

}
