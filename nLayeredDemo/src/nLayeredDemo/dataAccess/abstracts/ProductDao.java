package nLayeredDemo.dataAccess.abstracts;

import java.util.List;

import nLayeredDemo.entities.concrete.Product;

public interface ProductDao {
	void add(Product product);
	void delete(Product product);
	void update(Product product);
	
	Product get(int id);
	List<Product> getAll();
}
