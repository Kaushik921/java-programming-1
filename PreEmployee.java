package com.company;
import java.util.ArrayList;

class Employee{
    private String name;
    private String yearOfJoining;
    private String address;

    public Employee(){
        this("XXX", "XXXX", "XXXXXX");
    }

    public Employee(String name, String yearOfJoining, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getYearOfJoining() {
        return yearOfJoining;
    }

    public String getAddress() {
        return address;
    }
}

public class PreEmployee {

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Robert", "1994", "64C-WallStreet"));
        employees.add(new Employee("Sam", "1992", "65C-WallStreet"));
        employees.add(new Employee("John", "1999", "66C-WallStreet"));
        showEmployees(employees);
    }

    public static void showEmployees(ArrayList<Employee> employees){
        System.out.println(String.format("%-10s\t%-20s\t%-15s","Name", "Year of Joining", "Address"));
        for(Employee e : employees){
            System.out.println(String.format("%-10s\t%-20s\t%-15s",e.getName(), e.getYearOfJoining(), e.getAddress()));
        }
    }

}
