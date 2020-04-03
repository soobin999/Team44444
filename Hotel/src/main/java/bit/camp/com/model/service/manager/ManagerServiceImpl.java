package bit.camp.com.model.service.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bit.camp.com.model.VO.mybatis.Reservation;
import bit.camp.com.model.dao.ManagerDao;

@Service("ManagerService")
public class ManagerServiceImpl implements ManagerService{
	
	@Autowired
	private ManagerDao ManagerDao;

	@Override
	public List<Reservation> getAll() {
		// TODO Auto-generated method stub
		return ManagerDao.getAllReservation();
	}

	@Override
	public Reservation selectReservation() {
		// TODO Auto-generated method stub
		return null;
	}

}
