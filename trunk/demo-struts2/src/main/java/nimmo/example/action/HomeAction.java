package nimmo.example.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

@SuppressWarnings("serial")
public class HomeAction extends AbstractAction {
	
	@Action(value = "/home", results = { @Result(name = SUCCESS, location = "home.jsp") })
	public String init() throws Exception {
		return SUCCESS;
	}

}
