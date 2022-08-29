package org.example;


public class SoftwareDeveloper extends Employee implements ISoftwareDeveloper{
    private Manager supervisor;
    private String skills;
    private int experience;

    public SoftwareDeveloper(int Id,String FirstName,String LastName,int Age,double Salary,String Department,Manager Supervisor,String Skills,int Experience){
        super(Id,FirstName,LastName,Age,Salary,Department);
        this.supervisor=Supervisor;
        this.skills=Skills;
        this.experience=Experience;
    }
    /
    public Manager getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Manager supervisor) {
        this.supervisor = supervisor;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

// ============================   implemented methods ====================

    @Override
    public void writeCode() {
        System.out.println("written by: "+this.getFirstName()+" "+this.getLastName());
    }

    @Override
    public void testCode() {
        System.out.println("tested by: "+this.getFirstName()+" "+this.getLastName());
    }

    @Override
    public void pushChanges() {
        System.out.println("pushed by: "+this.getFirstName()+" "+this.getLastName());
    }
}
