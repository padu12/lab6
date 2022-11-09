package Task1.Interface;

public class Student implements Person1 {
    private String surname;
    private String name;
    private int age;
    private String group;
    private int num;

    Student (String surname, String name, int age, String group, int num){
        this.surname = surname;
        this.name = name;
        this.age = age;
        this.group = group;
        this.num = num;
    }

    @Override
    public String printInfo(){
        return "Студент группы " + group +" "+ surname +" "+ name + ", возраст: "+ age+". Номер " +
                "студенческого " +
                "билета: " + num;
    }

    public String getGroup(){
        return group;
    }
    public void setGroup(String group){
        this.group = group;
    }
    public int getNum(){
        return num;
    }
    public void setNum(int num){
        this.num = num;
    }
}
