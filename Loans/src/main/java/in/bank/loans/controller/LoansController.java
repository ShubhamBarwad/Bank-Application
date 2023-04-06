package in.bank.loans.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.bank.loans.model.CustomerModel;
import in.bank.loans.model.LoansModel;
import in.bank.loans.repository.LoansRepository;

@RestController
public class LoansController {
	@Autowired
	private LoansRepository loansRepository;
	@PostMapping("/loans")
	public List<LoansModel> getLoanDetails(@RequestBody CustomerModel customer) {
		List<LoansModel> loans = loansRepository.findByCustomerId(customer.getCustomerId());
		return loans;
	}
}
