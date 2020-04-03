package bit.camp.com.model.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import bit.camp.com.model.VO.mybatis.Customer;

public class CustomerDaoImpl implements CustomerDao {
	
	

	@Override
	public List<Customer> selectAllCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void signUp(Customer customer) {
		// TODO Auto-generated method stub 회원가입
		
	}

	@Override
	public void checkId(String customerId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkSSNumber(String SSNumber) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String searchId(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String searchPw(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCustomer(Customer customer) {
		// TODO Auto-generated method stub
		
	}
	
	///////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	@Autowired SqlSession sql; 
	@Override
	public void customerMypage(Customer customerVo) throws Exception {
	
		sql.selectList("CustomerMapper.CustomerMypage", customerVo );
		
	}
	
	
	@Override
	public void customerModify(Customer customerVo) throws Exception {
		// VO에 담긴 파라피터를 CustomerMapper.xml의 customerModify의 쿼리에 넣어줌
		sql.update("CustomerMapper.CustomerModify", customerVo);
		
	}
	
	

}
