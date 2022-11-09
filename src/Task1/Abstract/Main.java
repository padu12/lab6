package Task1.Abstract;

public class Main {
    public static void main(String[] args) {
        Person s1 = new Student("Казямир", "Богдан", 18, "АД-212", 12345);
        Person s2 = new Student("Аврамова", "Татьяна", 20, "АИ-211", 121222);
        Person s3 = new Student("Казямир", "Виталий", 18, "АД-214", 412566);
        Person l1 = new Lecturer("Иванов", "Дмитрий", 29, "ИКС", 200);

        Person[] arr = new Person[4];
        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;
        arr[3] = l1;

        for(int i = 0; i<4; i++){
            System.out.print(arr[i].printInfo() + "\n");
        }
    }
}