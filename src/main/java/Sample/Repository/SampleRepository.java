package Sample.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Sample.Entity.Employee;

public interface SampleRepository extends JpaRepository<Employee,Integer> {

}
