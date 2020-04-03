package bit.camp.com.model.service.manager;

import java.util.List;

import bit.camp.com.model.VO.mybatis.Reservation;

public interface ManagerService {
	List<Reservation> getAll();
	Reservation selectReservation();
}
