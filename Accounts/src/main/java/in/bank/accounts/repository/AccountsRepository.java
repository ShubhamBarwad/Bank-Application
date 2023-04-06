package in.bank.accounts.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.bank.accounts.model.AccountsModel;

@Repository
public interface AccountsRepository extends CrudRepository<AccountsModel, Long>{
	AccountsModel findByCustomerId(int customerId);
}
