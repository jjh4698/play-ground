package controller.calendar;

import com.playground.domain.application.calendar.CalendarService;
import com.playground.domain.application.calendar.dto.DiaryDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by coupang on 2017. 12. 18..
 */
@Controller
@RequestMapping(value = "/calendar")
public class CalendarController {
	@Autowired
	private CalendarService calendarService;


	@RequestMapping(value = "/diary/{year}/{month}")
	@ResponseBody
	public List<DiaryDto> findDaiaryByYearAndMonth(@PathVariable Integer year, @PathVariable Integer month) {
		return calendarService.findDiaryByYearAndMonth(year, month);
	}
}
