import java.time.LocalDate;
import Abstracts.BaseCustomerManager;
import Entities.Customer;
import Interfaces.CustomerCheckService;
import Services.NeroCustomerManager;
import Services.StarbucksCustomerManager;
import tr.gov.nvi.tckimlik.WS.MernisServiceAdapter;

public class Main {

	public static void main(String[] args) {
		
		
		
//		BaseCustomerManager customerManager = new NeroCustomerManager();
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1,"TUFAN", "CEVÝK",LocalDate.of(1993, 4, 18),"1111111111"));
		
		
			
		
	}



}
