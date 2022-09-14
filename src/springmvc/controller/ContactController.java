package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import spring.mvc.selenium.express.User;

@Controller
public class ContactController {
	@RequestMapping("/contact")
	public String showForm() {
		return "contact";
	}
	@RequestMapping(value="/processform",method=RequestMethod.POST)
	public String handleForm(@ModelAttribute User user,Model model ) {
//		public String handleForm(@RequestParam("email") String UserEmail,
//				@RequestParam("userName") String UserName,
//				@RequestParam("userpassword") String UserPassword,Model model ) {

//		System.out.println("User Email:"+user.getEmail());
//		System.out.println("User Password:"+user.getUserpassword());
//	    System.out.println("User Name:"+user.getUserName());
//		
//		System.out.println("User Email:"+ UserEmail);
//		System.out.println("User Password:"+ UserName);
//	    System.out.println("User Name:"+ UserPassword);
//		
	
    if(user.getUserpassword().isEmpty()) {
    	return"redirect:/contact";
    }
		
		System.out.println(user);
//		model.addAttribute("email",UserEmail);
//		model.addAttribute("userpassword",UserPassword);
//		model.addAttribute("userName",UserName);
//		
		//model.addAttribute("userInfo", user);
		return "sucess";
	}

}
