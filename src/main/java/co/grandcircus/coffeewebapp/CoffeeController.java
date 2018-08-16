package co.grandcircus.coffeewebapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


	
	@Controller
	public class CoffeeController {
		@RequestMapping("/")
		public ModelAndView indexPage( ) {
			return new ModelAndView("index", "test", "");
		}

	    @RequestMapping("/teststuff")
	    public String testPage() {
	    	return "test"; //string methods in the controller class return the view
	    	
	    }
	    @RequestMapping("username")
	    public ModelAndView formData(@RequestParam("firstName") String fName) {
	    	return new ModelAndView("", "personName", fName);
	    	
	    }
	    }


