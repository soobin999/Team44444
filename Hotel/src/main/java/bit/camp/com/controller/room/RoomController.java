package bit.camp.com.controller.room;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import bit.camp.com.model.VO.room.RoomDTO;
import bit.camp.com.model.service.room.RoomService;

@Controller
public class RoomController {
	@Autowired
	private RoomService roomService;
	
	@RequestMapping("/")
	public String home(Model model) {
		List<RoomDTO> room = roomService.getAllRooms();
		model.addAttribute("room", room);
		return "hotel/index";
	}
	
	@RequestMapping(value = "/search")
	public String searchRoom(@RequestParam Date reservationStartDate, @RequestParam Date reservationFinishDate, @RequestParam int roomPerson, Model model) {
		List<RoomDTO> roomSearch = roomService.getAvailable(reservationStartDate, reservationFinishDate, roomPerson);
		model.addAttribute("search", roomSearch);
		return "room/roomReservation";
	}

}
