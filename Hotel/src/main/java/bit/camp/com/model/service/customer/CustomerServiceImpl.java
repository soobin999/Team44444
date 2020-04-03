package bit.camp.com.model.service.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bit.camp.com.model.VO.mybatis.Customer;
import bit.camp.com.model.dao.CustomerDao;


@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao customerDao;

	// 회원목록조회
	public List<Customer> selectAllCustomer() {
		return customerDao.selectAllCustomer();
	}// 관리자

	// 회원가입
	public void signUp(Customer customer) {
		customerDao.signUp(customer);
	}

	// 아이디찾기
	public String searchId(Customer customer) {
		customerDao.searchId(customer);
		return "";
	}

	// 비밀번호찾기
	public String searchPw(Customer customer) {
		customerDao.searchPw(customer);
		return "";
	}

	// 회원탈퇴
	public void deleteCustomer(Customer customer) {
		customerDao.deleteCustomer(customer);

	}

	@Override
	public void signUp() {
		// TODO Auto-generated method stub

	}

	@Override
	public String searchId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String searchPw() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCustomer() {
		// TODO Auto-generated method stub

	}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// 회원정보
	@Override
	public void CustomerModifyUpdate(Customer customerVo) throws Exception {

		// 받은 VO를 DAO로 보냄
		customerDao.CustomerModify(customerVo);

	}

	// 회원정보수정
	@Override
	public void CustomerModify(Customer customerVo) throws Exception {

		// 받은 VO를 DAO로 보냄
		customerDao.CustomerModify(customerVo);

	}

}
