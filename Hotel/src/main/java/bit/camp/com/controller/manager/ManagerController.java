package bit.camp.com.controller.manager;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import bit.camp.com.model.service.manager.ManagerService;

@Controller
public class ManagerController {
	
	@Autowired
	private ManagerService ManagerService;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
	
	@RequestMapping(value="/manager", method=RequestMethod.GET)
	public String getManager(Model model ) {
		model.addAttribute("manager");
		return "/manager";
	}
}