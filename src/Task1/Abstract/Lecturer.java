package Task1.Abstract;

public class Lecturer extends Person {
    public String department;
    public double salary;

    Lecturer (String surname, String name, int age, String department, double salary){
        setSurname(surname);
        setName(name);
        setAge(age);
        this.department = department;
        this.salary = salary;
    }

    public String printInfo(){
        return "Преподаватель кафедры " + department +" "+ getSurname() +" "+ getName() + ", возраст: " + getAge() + ". " +
                "Зарплата: " + getSalary();
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
