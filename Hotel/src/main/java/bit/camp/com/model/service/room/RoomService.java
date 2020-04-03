package bit.camp.com.model.service.room;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bit.camp.com.model.VO.mybatis.Room;
import bit.camp.com.model.VO.room.RoomDTO;
import bit.camp.com.model.dao.ReservationDAO;
import bit.camp.com.model.dao.RoomDAO;

@Service
public class RoomService {
	
	@Autowired
	private RoomDAO roomDao;

	@Autowired
	private ReservationDAO ReservationDao;

	public List<RoomDTO> getAllRooms() {
		return roomDao.getAllRooms();
	}

	public List<RoomDTO> getAvailable(@Param("reservationStartDate") Date reservationStartDate, @Param("reservationFinishDate") Date reservationFinishDate, @Param("roomPerson") int roomPerson) {
		List<RoomDTO> AvailableRooms = new ArrayList<RoomDTO>();
		int countReservationsS = ReservationDao.getReservationsStandart(reservationStartDate, reservationFinishDate);
		int countReservationsD = ReservationDao.getReservationsDouble(reservationStartDate, reservationFinishDate);
		int countReservationsP = ReservationDao.getReservationsPremium(reservationStartDate, reservationFinishDate);
		int countReservationsF = ReservationDao.getReservationsFamily(reservationStartDate, reservationFinishDate);
		int countReservationsSt = ReservationDao.getReservationsSuite(reservationStartDate, reservationFinishDate);
		
		if (countReservationsS < 10 && roomPerson <= 2) {
			AvailableRooms.addAll(roomDao.getAvailableStandart());
		}
		if (countReservationsD < 10 && roomPerson <= 3) {
			AvailableRooms.addAll(roomDao.getAvailableDouble());
		}
		if (countReservationsP < 10 && roomPerson <= 4) {
			AvailableRooms.addAll(roomDao.getAvailablePremium());
		}
		if (countReservationsF < 3 && roomPerson <= 6) {
			AvailableRooms.addAll(roomDao.getAvailableFamily());
		}
		if (countReservationsSt < 2 && roomPerson <= 10) {
			AvailableRooms.addAll(roomDao.getAvailableSuite());
		}

		return AvailableRooms;
	}

}
