package project.controller.actions;

import javax.servlet.http.HttpServletRequest;

public interface Action {

	public String perform(HttpServletRequest request);

}
