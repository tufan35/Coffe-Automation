package tr.gov.nvi.tckimlik.WS;
import java.rmi.RemoteException;
import Entities.Customer;
import Interfaces.CustomerCheckService;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		  boolean result=true;
	        try{
		
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
		result = kpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),
																	customer.getFirstname(),
																	 customer.getLastname(),
																	 customer.getDateOftBirth().getYear());

		
	        }catch (RemoteException e) {
            e.printStackTrace();
        }

        if(result){
            return true;
        }else {
            return false;
        }
			
	        
		
	}
}
