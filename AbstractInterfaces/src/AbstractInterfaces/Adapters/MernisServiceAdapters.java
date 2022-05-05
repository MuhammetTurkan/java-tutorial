package AbstractInterfaces.Adapters;

import AbstractInterfaces.Abstract.ICustomerCheckService;
import AbstractInterfaces.Entities.Customer;

public class MernisServiceAdapters implements ICustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		return false;
	}

}
