package bit.camp.com.controller.customer;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import bit.camp.com.model.VO.mybatis.Customer;
import bit.camp.com.model.dao.CustomerDao;

@Controller
@SessionAttributes("customer")
public class CustomerMypageController {
	
	@Autowired 
	private CustomerDao customerDao;
	
	@RequestMapping(value = "/myPage", method=RequestMethod.GET)
	public String mypage(Model model, HttpServletRequest session) {
		
		
		
		Customer customer = (Customer) session.getAttribute("customerId"); 
		

		//1.customer.userID 값으로 회원정보를 DB로 부터 가져온다 
		
		return "/myPage";
	
	
	}
	
	
	
}
