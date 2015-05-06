package project.controller.actions;

import project.controller.helper.HelperProduct;
import project.model.*;

import javax.servlet.http.HttpServletRequest;

public class CreateProduct implements Action {

	public String perform(HttpServletRequest request) {
		
		HelperProduct helper = new HelperProduct();
		
		if (helper.isValid(request)) {
			String name = request.getParameter("name");
			String code = request.getParameter("code");
			Float price = Float.parseFloat(request.getParameter("price"));
			String description = request.getParameter("description");
            Integer quantity = Integer.valueOf(request.getParameter("quantity"));
			
			ProductFacade facade = new ProductFacade();
			Product product = facade.createProduct(name, price, description, code, quantity);
			request.setAttribute("product", product);
			
			return "/product.jsp";
		} else
			return "/newProduct.jsp";
	}
}
