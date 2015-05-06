package project.model;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ProductFacade {
	
	private Map<Long, Product> products;
	
	public ProductFacade()  {
		this.products = new HashMap<Long, Product>();
		Product product = new Product("PRIMO", new Float(12.1), "description of PRIMO", "AA-00-11",50);
		product.setId(new Long(1));
		this.products.put(product.getId(), product);
		
		product = new Product("SECONDO", new Float(10.0), "description of SECONDO", "BB-11-22", 50);
		product.setId(new Long(2));
		this.products.put(product.getId(), product);

		product = new Product("TERZO", new Float(20.5), "description of TERZO", "CC-22-33", 50);
		product.setId(new Long(3));
		this.products.put(product.getId(), product);
	}

	public Product createProduct(String name, Float price, String description, String code, Integer quantity) {
		// TODO Auto-generated method stub
		Product product = new Product(name, price, description, code, quantity);
		this.products.put(new Long(products.size()), product);
		//TO COMPLETE should call a JPA persist method
		return product;
	}
	
	public Product getProduct(Long id) {
		// TODO
		return products.get(id);
	}
	
	public List<Product> getAllProducts() {
		//TODO
		return new LinkedList<Product>(products.values());
	}

	public void updateProduct(Product product) {
		//TODO
		products.put(product.getId(), product);
	}

	public void deleteProduct(Long id) {
		//TODO
		products.remove(id);
	}


}