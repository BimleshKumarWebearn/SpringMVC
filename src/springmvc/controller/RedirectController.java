  package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RedirectController {
	@RequestMapping("/one")
public String one() {
	System.out.println("This is one controller");
	
	return"redirect:/enjoy";
}
	@RequestMapping("enjoy")
public String Two() {
	System.out.println("This is our second controller");
	
	return"contact";
}
	@RequestMapping("Three")
	public RedirectView Three() {
		RedirectView redirectView=new RedirectView();
		redirectView.setUrl("https://www.google.com");
		return redirectView;
	}
}
