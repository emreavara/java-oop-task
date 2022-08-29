package org.example;

public interface IManager {
    // A Manager can increaseSalary, hireEmployee, fireEmployee, and getNumberOfEmployeesSupervised
    // Please implement these methods
    // Bir Yönetici, Maaş'ı artırabilir,Employee'yi işe alabilir, fireEmployee'yi ve getNumberOfEmployeesSupervised'i alabilir
    // Lütfen bu yöntemleri uygulayın

    public void increaseSalary(SoftwareDeveloper softwareDeveloper,int salary);
    public void hireEmployee(Employee employee);
    public void hireEmployee(SoftwareDeveloper softwareDeveloper);
    public void fireEmployee(Employee employee);
    public void getNumberOfEmployeesSupervised();

}
 
