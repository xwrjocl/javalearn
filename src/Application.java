class Person{

    // DATA
    int age;
    String name;

    // SUBROUTINES
    public Person (String name){
        this(name, 0);
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "I am "+name+" and I am "+age+" years old";
    }

    String who(){
        return  "I am "+name+" and I am "+age+" years old";
    }

    // GETTERS
    int getAge(){
        return age;
    }

    String getName(){
        return name;
    }

    // SETTERS
    void setAge(int age){
        this.age = age;
    }
    void setName(String name){
        this.name = name;
    }
}

public class Application {



    public static void main(String[] args) {

        Person p1 = new Person("paco", 40);
        //p1.age = 35;
        //p1.name = "Pepe";

        System.out.println(p1.name);
        System.out.println(p1.age);
        System.out.println(p1.who());

        p1.setAge(99);
        p1.setName("perico");
        System.out.println(p1.who());

        Person p2 = new Person ("Pepito");
        System.out.println(p2.who());

    }
}
