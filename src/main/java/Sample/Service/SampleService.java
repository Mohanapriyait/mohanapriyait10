package Sample.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Sample.Entity.Employee;
import Sample.Repository.SampleRepository;

@Service
public class SampleService {
	@Autowired
	private SampleRepository rep;
	
	/*public Employee saveEmp(Employee emp) {
		return rep.save(emp);
	}*/
	

}
