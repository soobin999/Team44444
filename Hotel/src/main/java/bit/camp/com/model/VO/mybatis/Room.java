package bit.camp.com.model.VO.mybatis;

import org.apache.ibatis.type.Alias;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Data
@Alias("room")
@Configuration
public class Room {
	
	@Bean("roomVO")
	public Room getRoom() {
		return new Room();
	}
	
	private int roomCount;
	private int roomNumber, roomPrice, roomPerson;
	private String roomPicture,roomInformation;
	private boolean reservationState;

	public Room() {
		super();
	}
	
	public Room(int roomCount,int roomNumber,int roomPrice,int roomPerson,String roomPicture,String roomInformation,boolean reservationState,RoomTypeTable roomTypeTable) {
		super();
		this.roomCount=roomCount;
		this.roomNumber=roomNumber;
		this.roomPrice=roomPrice;
		this.roomPerson=roomPerson;
		this.roomPicture=roomPicture;
		this.reservationState=reservationState;
		this.roomInformation=roomInformation;
		this.roomTypeTable=roomTypeTable;
	}
	@Autowired(required = false)
	private RoomTypeTable roomTypeTable;
	
}
