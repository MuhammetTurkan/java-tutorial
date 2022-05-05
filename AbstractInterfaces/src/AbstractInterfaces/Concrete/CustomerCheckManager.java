package AbstractInterfaces.Concrete;

import AbstractInterfaces.Abstract.ICustomerCheckService;
import AbstractInterfaces.Entities.Customer;

public class CustomerCheckManager implements ICustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		return true;
	}
	
}
