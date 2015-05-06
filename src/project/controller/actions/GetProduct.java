package project.controller.actions;

import project.controller.helper.HelperProductId;
import project.model.Product;
import project.model.ProductFacade;

import javax.servlet.http.HttpServletRequest;

public class GetProduct implements Action {

	public String perform(HttpServletRequest request) {
		
		HelperProductId helper = new HelperProductId();
		
		if (helper.isValid(request)) {
			Long id = Long.parseLong(request.getParameter("id"));
			
			ProductFacade facade = new ProductFacade();
			Product product = facade.getProduct(id);
			request.setAttribute("product", product);
			
			return "/product.jsp";
		} else
			return "/invalid.jsp";
	}
}
