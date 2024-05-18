package employeemngtapi.demo.Service;

import employeemngtapi.demo.Entity.Employ;
import employeemngtapi.demo.Repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    public Employ saveDetails(Employ employ){
        return employeeRepo.save(employ);
    }

    public List<Employ> getAllDetails(){
        return employeeRepo.findAll();
    }

    public void printAllDetailsToConsole(){
        List<Employ> employees = getAllDetails();
        for(Employ employ: employees){
            System.out.println("Employee ID: " + employ.getId());
            System.out.println("Name: " + employ.getName());
            System.out.println("Department: " + employ.getDepartment());
            System.out.println("Post: " + employ.getPost());
            System.out.println("Address: " + employ.getAddress());
            System.out.println("Contact: " + employ.getContact());
            System.out.println("Email: " + employ.getEmail());
            System.out.println("--------------------------------------");
        }
    }
}
