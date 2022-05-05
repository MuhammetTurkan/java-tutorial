package AbstractInterfaces.Abstract;

import AbstractInterfaces.Entities.Customer;

public abstract class BaseCustomerManager implements ICustomerService{

	@Override
	public  void save(Customer customer) {
		System.out.println("Save to db. "+ customer.firstName);
		
	}

}