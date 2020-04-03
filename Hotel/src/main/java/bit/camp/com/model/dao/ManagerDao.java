package bit.camp.com.model.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import bit.camp.com.model.VO.mybatis.Reservation;

@Service
public interface ManagerDao {

	List<Reservation> getAllReservation();
	
}
