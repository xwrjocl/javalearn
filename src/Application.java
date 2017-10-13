import java.io.*;

public class Application {

    public static void main(String[] args){

        try (BufferedWriter br = new BufferedWriter(new FileWriter(new File("/Users/joseluisclares/Documents/EXAMPLE.txtd")))) {
            br.write("testing writing file");
            br.newLine();
            br.write("using try with resources");
            br.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
