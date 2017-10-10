

class Machine{

    public void start (){
        System.out.println("Maching starting");
    }

}


public class Application {

    public static void main(String[] args) {

        // ANONYMOUS CLASSES
        Machine m1 = new Machine(){
            @Override public void start(){
                System.out.println("Camara starting");
            }
        };

        m1.start();

    }

}
