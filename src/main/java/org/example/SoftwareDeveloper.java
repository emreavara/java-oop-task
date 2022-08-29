package org.example;


public class SoftwareDeveloper extends Employee implements ISoftwareDeveloper{
    private int experience;
    private Manager supervisor;
    private String skilss;

    public SoftwareDeveloper(int id, String firstName, String lastName, int age, double salary, String department,Manager supervisor, String skilss,int experience) {
        super(id, firstName, lastName, age, salary, department);
        this.supervisor = supervisor;
        this.experience = experience;
        this.skilss = skilss;

    }
    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public Manager getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Manager supervisor) {
        this.supervisor = supervisor;
    }


    @Override
    public void writeCode() {
        System.out.println(this.getFirstName() + "developer write code");

    }

    @Override
    public void testCode() {
        System.out.println(this.getFirstName() + "developer test code");
    }

    @Override
    public void pushChanges() {
        System.out.println(this.getFirstName() + "push code");
    }

    public String getSkills() {
        return skilss;
    }

    public void setSkills(String skills) {
        this.skilss = skills;
    }



// A Manager has Supervisor, skills, experience attribute additionally.
    // Please implement necessary methods to get and set these attributes of Manager
    // Bir Yönetici ayrıca Süpervizör, beceriler, deneyim özelliğine sahiptir.
    // Lütfen Manager'ın bu özniteliklerini almak ve ayarlamak için gerekli yöntemleri uygulayın
}
 
