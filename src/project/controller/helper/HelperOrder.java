package project.controller.helper;

import project.model.ProductFacade;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Michele on 05/05/15.
 */
public class HelperOrder {
    public boolean isValid(HttpServletRequest request){
        ProductFacade facade = new ProductFacade();
        String id = request.getParameter("customer");
        String quantity = request.getParameter("quantity");
        String product = request.getParameter("product");
        String price = request.getParameter("price");
        boolean valid = true;

        Integer qty = facade.getProduct(Long.valueOf(id)).getQuantity();

        if(Integer.valueOf("quantity") > qty){
            request.setAttribute("quantityErr","Non presenti più di "+qty+" unità in magazzino");
            valid = false;
        }
        if ( id == null || id.equals("")){
            request.setAttribute("idErr","LogIn non autentificato!");
            valid = false;
        }
        if ( price == null || product.equals("")){
            request.setAttribute("priceErr","prezzo no");
            valid = false;
        }
        return valid;
    }
}
