import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {

        // GENERICS
        ArrayList <String> strList = new ArrayList<>();
        strList.add("cat");
        strList.add("dog");
        String animal = strList.get(1);
        System.out.println(animal);

    }
}
