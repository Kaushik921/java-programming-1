import java.util.List;
import java.util.*;

public class Employee {
    public Employee(Integer empId,String empName,String empDesignation,Integer empSalary,
                    String empLocation) {
        this.empId=empId;
        this.empName= empName;
        this.empDesignation=empDesignation;
        this.empSalary=empSalary;
        this.empLocation=empLocation;

    }
    private Integer empId;
    private String empName;
    private String empDesignation;
    private Integer empSalary;
    private String empLocation;
    public Integer getEmpId() {
        return empId;
    }
    public void setEmpId(Integer empId) {
        this.empId = empId;
    }
    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public String getEmpDesignation() {
        return empDesignation;
    }
    public void setEmpDesignation(String empDesignation) {
        this.empDesignation = empDesignation;
    }
    public Integer getEmpSalary() {
        return empSalary;
    }
    public void setEmpSalary(Integer empSalary) {
        this.empSalary = empSalary;
    }
    public String getEmpLocation() {
        return empLocation;
    }
    public void setEmpLocation(String empLocation) {
        this.empLocation = empLocation;
    }
    public String toString(){
        return empId+" "+empName+" "+empDesignation+" "+empSalary+" "+empLocation;

}
public static void main(String[] args){
        ArrayList<Employee> employe=new ArrayList<>();
        employe.add(new Employee(1,"A","Abce",23000,"Masd"));
        employe.add(new Employee(2,"B","Abcd",79000,"Waad"));
        employe.add(new Employee(3,"C","Abed",60000,"Mssd"));
    employe.add(new Employee(4,"D","Shge",87000,"Aswe"));
    employe.add(new Employee(5,"E","Asdw",30000,"Quhn"));
    employe.add(new Employee(6,"F","Wrte",40000,"Nugd"));
    employe.add(new Employee(7,"G","UERD",65000,"Mars"));
    employe.add(new Employee(8,"H","ITBe",75000,"Mnas"));
    employe.add(new Employee(9,"I","Ytvr",20000,"Qeoj"));
    employe.add(new Employee(10,"J","Onue",80000,"Midj"));




    System.out.println("All the names of EMployees");
    employe.forEach(employee -> System.out.println(employee.getEmpName()));
    System.out.println("Location starts with M");
    employe.stream().filter(employee -> employee.getEmpLocation().startsWith("M")).forEach(employee -> System.out.println(employee.getEmpLocation()));
    System.out.println("Designation Ending With e");
    employe.stream().filter(employee -> employee.getEmpDesignation().endsWith("e")).forEach(employee -> System.out.println(employee.getEmpDesignation()));
    System.out.println("Employee whose salary greater than 50000");
    employe.stream().filter(employee -> employee.getEmpSalary()>50000).forEach(employee -> System.out.println(employee.getEmpSalary()));
}
}
