package springmvc.controller;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping("/home")
public String home(Model model) {
		model.addAttribute("name","Jacob T Thomas");
		model.addAttribute("id",7647);
	System.out.println("Hi Bimlesh This is Your first code");
	List<String> friends=new ArrayList<String>();
	friends.add("Jacob");
	friends.add("Akhil");
	friends.add("Harry");
	model.addAttribute("f",friends);
	return "index";
	}
	@RequestMapping("/about")
	public String about() {
		
		System.out.println("Hi Bimlesh This is Your second code");
		return "index";
	}
		@RequestMapping("/help")
		public ModelAndView help() {
			ModelAndView modelAndView=new ModelAndView();
			modelAndView.addObject("name","Harry");
			modelAndView.addObject("RollNumber",85);
			LocalDateTime now=LocalDateTime.now();
			modelAndView.addObject("time",now);
			modelAndView.setViewName("help");
			
			return modelAndView;
			
		}

}
