package Abstracts;

import Entities.Customer;
import Interfaces.CustomerService;

public abstract class BaseCustomerManager implements CustomerService{

	@Override
	public  void save(Customer customer) {
		
			System.out.println("Veritabanưna kaydedildi. : " + customer.getFirstname());
		
	}

}
