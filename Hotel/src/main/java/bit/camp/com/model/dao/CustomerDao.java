package bit.camp.com.model.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import bit.camp.com.model.VO.mybatis.Customer;

@Service
public interface CustomerDao {

	//void insertCustomer();
	List<Customer> selectAllCustomer();//회원목록조회
	
	void signUp(Customer customer);//회원가입
	void checkId(String customerId);//아이디중복체크
	void checkSSNumber(String SSNumber);//주민등록번호 중복체크
	String searchId(Customer customer);//아이디찾기
	String searchPw(Customer customer);//비번찾기
	void deleteCustomer(Customer customer);//탈퇴
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	//회원 마이페이지
	public void customerMypage(Customer customerVo) throws Exception;
	
	//회원정보 수정
	public void customerModify(Customer customerVo) throws Exception ;

	
}
