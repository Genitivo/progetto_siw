package project.controller.actions;

import project.controller.helper.HelperOrder;
import project.model.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Michele on 05/05/15.
 */
public class CreateOrder implements Action {

    public String perform(HttpServletRequest request){
        HelperOrder helper = new HelperOrder();

        if(helper.isValid(request)){
            ProductFacade facade = new ProductFacade();
            Order o;
            Product p = (Product)request.getAttribute("product");
            OrderLine ol = new OrderLine(p.getPrice(), p.getQuantity(), p);

            if(request.getAttribute("order")!=null) {
                o = (Order) request.getAttribute("order");
                o.getOrderLines().add(ol);
            }
            else {
                List<OrderLine> lol = new LinkedList<OrderLine>();
                lol.add(ol);
                o = new Order(new Date(),(Customer)request.getAttribute("customer"), lol);
                o.setOrderLine(lol);
            }

            request.setAttribute("order",o);

            return "/basket.jsp";
        }

        return "/invalid.jsp";
    }
}
