package org.example;

public class Manager extends Employee implements IManager{
    private int numberOfEmployeesSupervised;
    @Override
    public void increaseSalary(SoftwareDeveloper softwareDeveloper,int salary) {
        System.out.println(softwareDeveloper.getFirstName() +" increase " +salary);
    }

    @Override
    public void hireEmployee(SoftwareDeveloper softwareDeveloper) {
        System.out.println(softwareDeveloper.getFirstName() + "hire ");


    } @Override
    public void hireEmployee(Employee employee) {
        System.out.println(employee.getFirstName() + "hired ");
    }

    @Override
    public void fireEmployee(Employee employee) {

        System.out.println(employee.getFirstName() + "fired");

    }

    @Override
    public void getNumberOfEmployeesSupervised() {
        System.out.println(" has supervised " + this.numberOfEmployeesSupervised);

    }

    public void setNumberOfEmployeesSupervised(int numberOfEmployeesSupervised) {
        this.numberOfEmployeesSupervised = numberOfEmployeesSupervised;
    }

    public Manager(int id, String firstName, String lastName, int age, double salary, String department, int numberOfEmployeesSupervised) {
        super(id, firstName, lastName, age, salary, department);
        this.numberOfEmployeesSupervised = numberOfEmployeesSupervised;
    }
// A Manager has numberOfEmployeesSupervised attribute additionally.
    // Please implement necessary methods to get and set these attributes of Manager
    // Bir Yönetici ayrıca numberOfEmployeesSupervised özniteliğine sahiptir.
    // Lütfen Manager'ın bu özniteliklerini almak ve ayarlamak için gerekli yöntemleri uygulayın
}
