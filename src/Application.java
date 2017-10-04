class Person{
    int age;
    String name;
}

public class Application {



    public static void main(String[] args) {

        Person p1 = new Person();
        p1.age = 35;
        p1.name = "Pepe";

        System.out.println(p1.name);
        System.out.println(p1.age);

    }
}
