package Task1.Abstract;

public class Student extends Person {
    private String group;
    private int num;

    Student (String surname, String name, int age, String group, int num){
        setSurname(surname);
        setName(name);
        setAge(age);
        this.group = group;
        this.num = num;
    }

    @Override
    public String printInfo(){
        return "Студент группы " + group +" "+ getSurname() +" "+ getName() + ", возраст: "+ getAge()+". Номер " +
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
