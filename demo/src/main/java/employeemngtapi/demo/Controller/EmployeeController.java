package employeemngtapi.demo.Controller;

import employeemngtapi.demo.Entity.Employ;
import employeemngtapi.demo.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/addEmployee")
    public Employ postDetails(@RequestBody Employ employ){
        return employeeService.saveDetails(employ);
    }

    @GetMapping("/addEmployee")
    public List<Employ> getDetails(){
        return employeeService.getAllDetails();
    }

    @GetMapping("/printAllEmployees")
    public void printAllEmployees(){
        employeeService.printAllDetailsToConsole();
    }
}
