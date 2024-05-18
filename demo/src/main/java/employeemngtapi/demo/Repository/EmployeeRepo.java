package employeemngtapi.demo.Repository;

import employeemngtapi.demo.Entity.Employ;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository <Employ, Integer> {
}
