
import java.io.IOException;

class Test {

    public void run()throws IOException{
        int code = 0;

        if (code != 0){
            throw new IOException("Error in Test class");
        }
        System.out.println("ok");
    }


}




public class Application {

    public static void main(String[] args){

        Test t1 = new Test();

        try {
            t1.run();
        } catch (IOException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }


    }

}
