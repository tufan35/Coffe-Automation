package Services;

import Abstracts.BaseCustomerManager;
import Entities.Customer;
import Interfaces.CustomerCheckService;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
		
	private	CustomerCheckService customerCheckService;
		
		public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
			this.customerCheckService = customerCheckService;
		}
		
		
		@Override
		public void save(Customer customer) {
			if (customerCheckService.CheckIfRealPerson(customer)) {
				
				System.out.println("Veritaban�na Kay�t Edildi" + customer.getFirstname() +  " "  + customer.getLastname());
				
			} else {
					
				System.out.println("Veritaban�na kay�t Yap�lamad�.");
			}
		}

}
