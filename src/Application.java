
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application {

    public static void main(String[] args){

        File file = new File ("/Users/joseluisclares/Documents/EXAMPLE.txtd");
        FileReader fr = null;

        try {
            fr = new FileReader(file);
            String str = fr.read();
            System.out.println(str);
        } catch (FileNotFoundException e) {
            System.out.println("Error open the file: " + file.toString());
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error reading file "+ file.toString());
            e.printStackTrace();
        }

        try {
            fr.close();
        } catch (IOException e) {
            System.out.println("Error closing file: " + file.toString());
            e.printStackTrace();
        } catch (NullPointerException e){
            System.out.println("Error, file not exist: " + file.toString());
        }
    }
}
