package demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeCtrl {
	@RequestMapping("/")
	public String index() {
		return "index.html";
	}
	
}
