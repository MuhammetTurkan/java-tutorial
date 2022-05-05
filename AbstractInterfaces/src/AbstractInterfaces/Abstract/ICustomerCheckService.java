package AbstractInterfaces.Abstract;

import AbstractInterfaces.Entities.Customer;

public interface ICustomerCheckService {
	boolean checkIfRealPerson(Customer customer);
}
