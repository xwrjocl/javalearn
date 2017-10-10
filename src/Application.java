import javafx.scene.Camera;

import java.util.ArrayList;

class Machine{
    public String toString() {
        return "I am a machine";
    }
    public void start (){
        System.out.println("Maching starting");
    }

}

class Camara extends Machine {
    public String toString() {
        return "I am a camara";
    }
    public void snap(){
        System.out.println("snap");
    }
}

public class Application {

    public static void main(String[] args) {

        // GENERICS
        ArrayList <Machine> list1 = new ArrayList<>();
        list1.add(new Machine());
        list1.add(new Machine());
        show(list1);

        ArrayList <Camara> list2 = new ArrayList<>();
        list2.add(new Camara());
        list2.add(new Camara());
        show(list2);

    }

    private static void show(ArrayList<? super Camera> list) {
        for (Object value: list){
            System.out.println(value);
        }
    }
}
