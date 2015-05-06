package project.controller.actions;


import project.model.Product;
import project.model.ProductFacade;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

//controller/prodcut.list
public class ListProduct implements Action {

	public String perform(HttpServletRequest request) {
		
		ProductFacade facade = new ProductFacade();
		List<Product> products = facade.getAllProducts();
		request.setAttribute("products", products);	
		return "/products.jsp";
	}
}
