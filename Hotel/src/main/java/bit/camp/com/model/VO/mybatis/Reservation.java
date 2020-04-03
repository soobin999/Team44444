package bit.camp.com.model.VO.mybatis;

import java.sql.Date;

import org.apache.ibatis.type.Alias;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.Builder;
import lombok.Data;

@Data
@Alias("reservation")
@Configuration
public class Reservation {
	
	@Bean("reservationVO")
	public Reservation getReservation() {
		return new Reservation();
	}
	
	private Date reservationStartDate,reservationFinishDate;
	private int totalAmount, editRoute,editCode;

	public Reservation() {}
	public Reservation(Date reservationStartDate,Date reservationFinishDate,int totalAmount,int editRoute,int editCode) {
		super();
		this.reservationStartDate=reservationStartDate;
		this.reservationFinishDate=reservationFinishDate;
		this.totalAmount=totalAmount;
		this.editRoute=editRoute;
		this.editCode=editCode;
	}
	@Autowired(required = false)
	private Customer customer;
	@Autowired(required = false)
	private Room room;
	
	@Builder
	public Reservation(Customer customer,Room room) {
		this.customer=customer;
		this.room=room;
	}
	

}
