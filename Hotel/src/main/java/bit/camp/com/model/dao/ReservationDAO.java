package bit.camp.com.model.dao;

import java.sql.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ReservationDAO {

	int getReservationsStandart(@Param("reservationStartDate") Date reservationStartDate, @Param("reservationFinishDate") Date reservationFinishDate);

	int getReservationsDouble(@Param("reservationStartDate") Date reservationStartDate, @Param("reservationFinishDate") Date reservationFinishDate);

	int getReservationsPremium(@Param("reservationStartDate") Date reservationStartDate, @Param("reservationFinishDate") Date reservationFinishDate);

	int getReservationsFamily(@Param("reservationStartDate") Date reservationStartDate, @Param("reservationFinishDate") Date reservationFinishDate);

	int getReservationsSuite(@Param("reservationStartDate") Date reservationStartDate, @Param("reservationFinishDate") Date reservationFinishDate);
}
