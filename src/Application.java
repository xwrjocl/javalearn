import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) throws FileNotFoundException {

        // READ FILES
        String fileName = "/Users/joseluisclares/Documents/EXAMPLE.txt";
        int count =0;
        File file = new File(fileName);

        Scanner readFile = new Scanner(file);
        count++;
        System.out.println(count+ ": "+readFile.nextInt());
        readFile.nextLine();
        count++;

        while (readFile.hasNextLine()){
            System.out.println(count+ ": "+readFile.nextLine());
            count++;
        }

        readFile.close();
    }

}
