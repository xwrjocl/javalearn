

public class Application {

    public static void main(String[] args){

        Animal animal = Animal.DOG;

        switch (animal){
            case DOG:
                System.out.println(animal.name() + " " + animal.getName());
                break;
            case CAT:
                System.out.println("Cat");
                break;
        }

    }
}
