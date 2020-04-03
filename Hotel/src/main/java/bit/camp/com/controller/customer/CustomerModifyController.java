package bit.camp.com.controller.customer;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import bit.camp.com.model.VO.mybatis.Customer;
import bit.camp.com.model.service.customer.CustomerService;



@Controller
public class CustomerModifyController {
	
	@Autowired
	private CustomerService service;
	
	@RequestMapping(value="/customermodify", method = RequestMethod.GET)
	public String custoemrModify() throws Exception {
		
		return "customer/customerModify";
	}

	@RequestMapping(value="/customermodifyupdate", method = RequestMethod.POST)
	public String custoemrModifyUpdate(Customer customerVo, HttpSession session) throws Exception{
		
		service.CustomerModifyUpdate(customerVo);
		
		session.invalidate();
		
		return "redirect:/";
	}

}
