package bit.camp.com.model.dao;

/*import java.util.Date;*/
import java.sql.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import bit.camp.com.model.VO.mybatis.Room;

public interface RoomDAO {

	List<Room> getAllRooms();

	List<Room> getAvailableStandart();

	List<Room> getAvailableDouble();

	List<Room> getAvailablePremium();

	List<Room> getAvailableFamily();

	List<Room> getAvailableSuite();

}
