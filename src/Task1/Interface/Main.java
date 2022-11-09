package Task1.Interface;

public class Main {
    public static void main(String[] args) {
        Person1 s1 = new Student("Казямир", "Богдан", 18, "АД-212", 12345);
        Person1 s2 = new Student("Аврамова", "Татьяна", 20, "АИ-211", 121222);
        Person1 s3 = new Student("Казямир", "Виталий", 18, "АД-214", 412566);
        Person1 l1 = new Lecturer("Иванов", "Дмитрий", 29, "ИКС", 200);

        Person1[] arr = new Person1[4];
        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;
        arr[3] = l1;

        for(int i = 0; i<4; i++){
            System.out.print(arr[i].printInfo() + "\n");
        }
    }
}