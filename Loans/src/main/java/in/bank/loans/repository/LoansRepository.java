package in.bank.loans.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.bank.loans.model.LoansModel;

@Repository
public interface LoansRepository extends CrudRepository<LoansModel, Long>{
	List <LoansModel> findByCustomerId(int customerId);

}
