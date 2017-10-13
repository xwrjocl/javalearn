import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application {

    public static void main(String[] args){

        File file = new File ("/Users/joseluisclares/Documents/EXAMPLE.txtd");

        try (FileReader fr = new FileReader(file)){
            System.out.println("File open");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
