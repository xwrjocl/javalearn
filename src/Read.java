import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Read {

    public static void main(String arg[]) {

        Person person1;
        Person person2;

        try (FileInputStream fi = new FileInputStream("/Users/joseluisclares/Documents/PEOPLE.bin")) {
            ObjectInputStream oi = new ObjectInputStream(fi);

            person1 = (Person) oi.readObject();
            person2 = (Person) oi.readObject();

            System.out.println(person1.toString());
            System.out.println(person2.toString());

            oi.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}