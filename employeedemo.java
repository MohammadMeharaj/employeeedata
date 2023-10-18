class Employee {
    private String name;
    private int empId;
    public Employee(String name, int empId) {
        this.name = name;
        this.empId = empId;
    }
    public String getName() {
        return name;
    }
    public int getEmpId() {
        return empId;
    }
    public void work() {
        System.out.println("Employee " + name + " is working.");
    }
}
class Manager extends Employee {
    private String department;

    public Manager(String name, int empId, String department) {
        super(name, empId);
        this.department = department;
    }


    public void work() {
        System.out.println("Manager " + getName() + " is managing the " + department + " department.");
    }
}
class Developer extends Employee {
    private String programmingLang;
    public Developer(String name, int empId, String programmingLanguage) {
        super(name, empId);
        this.programmingLang = programmingLang;
    }
    public void work() {
        System.out.println("Developer " +getName() + " is coding  in "+programmingLang + ".");
    }
}
class Salesperson extends Employee {
    private int pdtsale;
    public Salesperson(String name, int empId, int pdtsale) {
        super(name, empId);
        this.pdtsale = pdtsale;
    }
    public void work() {
        System.out.println("Salesperson " + getName() + " is trying to meet a sales target of " + pdtsale + ".");
    }
}

public class employeedemo{
    public static void main(String[]args)
    {
        Employee[]employees={new Manager("RAM",101,"Computereng"),
        new Developer("john",102,"JAVA"),
        new Salesperson("rosy",103,30)};
        for (Employee employee : employees) {
            employee.work();
        }
    }
    
}
    
