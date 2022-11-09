package Task1;

public class Person {
    private String surname;
    private String name;
    private int age;

    /*public String printInfo(){
        return "Человек " + surname + " " + name + ", возраст: " + age;
    }*/

    public String getSurname(){
        return surname;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

}
