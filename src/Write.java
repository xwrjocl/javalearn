import java.io.*;

public class Write {

    public static void main (String arg[]){

        Person person1 = new Person("Paco", 1);
        Person person2 = new Person("Manolo", 22);

        System.out.println(person1.toString());
        System.out.println(person2.toString());

        try (FileOutputStream fs = new FileOutputStream("/Users/joseluisclares/Documents/PEOPLE.bin")) {
            ObjectOutputStream oi = new ObjectOutputStream(fs);
            oi.writeObject(person1);
            oi.writeObject(person2);
            oi.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
