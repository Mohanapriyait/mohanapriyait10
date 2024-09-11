package Sample.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Sample.Entity.Employee;
import Sample.Service.SampleService;
@RestController
@RequestMapping("api")
public class SampleController {
	@Autowired
	private SampleService ser;
	
	/*@PostMapping("/saveemp")
	public Employee saveEmp(@RequestBody Employee emp) {
		
		return ser.saveEmp(emp);
	}*/
	@GetMapping("/hello")
	public String getString() {
		return "hello";
	}
	

}
