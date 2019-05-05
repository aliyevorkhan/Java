
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="UserCtrl")
@SessionScoped
public class UserController {
    private List<Employee> employees=null;
    private Employee selectedEmployee = null;
    
    @PostConstruct
    public void init(){
        employees = new ArrayList<Employee>();
        employees.add(new Employee("Emp_N0", "Emp_SN0", 0)); 
        employees.add(new Employee("Emp_N1", "Emp_SN1", 1));
        employees.add(new Employee("Emp_N2", "Emp_SN2", 2));
        
        selectedEmployee = new Employee();
    }
    
    public void select(Employee e){
        selectedEmployee = e;
    }
    
    public void update(){
        selectedEmployee = new Employee();
    }
    
    public void delete(){
        employees.remove(selectedEmployee);
        selectedEmployee = new Employee();
    }
    
    public void add(){
        employees.add(selectedEmployee);
        selectedEmployee = new Employee();
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public Employee getSelectedEmployee() {
        return selectedEmployee;
    }

    public void setSelectedEmployee(Employee selectedEmployee) {
        this.selectedEmployee = selectedEmployee;
    }   
    
}
