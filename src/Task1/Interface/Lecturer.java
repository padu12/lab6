package Task1.Interface;

public class Lecturer implements Person1 {
    private String surname;
    private String name;
    private int age;
    public String department;
    public double salary;

    Lecturer (String surname, String name, int age, String department, double salary){
        this.surname = surname;
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
    }

    public String printInfo(){
        return "Преподаватель кафедры " + department +" "+ surname +" "+ name + ", возраст: " + age + ". " +
                "Зарплата: " + salary;
    }

    public String getDepartment(){
        return department;
    }
    public void setDepartment(String department){
        this.department = department;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
}
