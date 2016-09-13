package cn.com.esrichina.product;

import java.util.List;

public interface ProductDao {

	public void save(Product p);
	
	public List<Product> searchAll();
}
