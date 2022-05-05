package AbstractInterfaces.Concrete;

import AbstractInterfaces.Abstract.BaseCustomerManager;
import AbstractInterfaces.Abstract.ICustomerCheckService;
import AbstractInterfaces.Entities.Customer;

public class StarbucksCustomerManger extends BaseCustomerManager{
	
	public ICustomerCheckService customerCheckServise;

	public StarbucksCustomerManger(ICustomerCheckService customerCheckServise) {
		
		this.customerCheckServise = customerCheckServise;
	}
	
	public void save (Customer customer) {
		if (this.customerCheckServise.checkIfRealPerson(customer)) {
			super.save(customer);
		}
		else {
			System.out.println("Not a valid person.");
		}
	}
}
