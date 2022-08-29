package org.example;

public class Employee implements IEmployee{
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private double salary;
    private  String department;



    public Employee(int Id,String FirstName,String LastName,int Age,double Salary,String Department){
        this.id=Id;
        this.firstName=FirstName;
        this.lastName=LastName;
        this.age=Age;
        this.salary=Salary;
        this.department=Department;
    }

    //Getters & Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double Salary) {
        this.salary = this.salary+Salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    //implemented methods
    @Override
    public void getSalaryPayment() {
        System.out.println(this.firstName+" "+this.lastName+" got "+this.salary+"CHF salary payment!");

    }

    @Override
    public void takeABreak() {
        System.out.println(this.firstName+" took a break");

    }
}
