package demo;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloCtrl {
	@RequestMapping(value="/hello")
	public String hello() {
		return "Hello World!";
	}
	
}
