package AbstractInterfaces;

import AbstractInterfaces.Abstract.BaseCustomerManager;
import AbstractInterfaces.Concrete.NeroCustomerManager;
import AbstractInterfaces.Concrete.StarbucksCustomerManger;
import AbstractInterfaces.Entities.Customer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseCustomerManager customerManager = new NeroCustomerManager();
		Customer customer = new Customer();
		customerManager.save(customer);
		BaseCustomerManager customerManager2 = new StarbucksCustomerManger(null);
		Customer customer2 = new Customer();
		customerManager2.save(customer2);
	}
		
}
