import java.util.Scanner;

public class Application {

    public static void main(String[] args){

        int myInt = 22;
        float myFloat = 32.4f;
        double myDouble = 21.24;
        boolean myBool = true;
        char myChar = 'y';

        System.out.println(myInt);
        System.out.println(myFloat);
        System.out.println(myDouble);
        System.out.println(myBool);
        System.out.println(myChar);


        String text = "hello";
        System.out.println(text);


        int value = 0;
        while (value < 10){
            System.out.println("hello : " + value);
            value++;
        }

        for (int i = 0; i < 10; i++){
            System.out.printf("value i is: %d \n",i);
        }
/*
        Scanner imput = new Scanner(System.in);
        System.out.println("type option: ");
        String typing = imput.nextLine();
        System.out.println("you type: " + typing);
        switch (typing){
            case "A":
                System.out.println("Option A");
                break;
            case "B":
                System.out.println("Option B");
                break;
            default:
                System.out.println("Option Default");
        }
*/
    // int[] arrayInt1;
    // arrayInt1 = new int[3];
    int[] arrayInt1 = {11,22,33};
    // arrayInt1[0]=10;
    // arrayInt1[1]=20;
    // arrayInt1[2]=30;
    for (int i=0;i<arrayInt1.length;i++){
        System.out.printf("array[%d]: %d\n",i,arrayInt1[i]);
    }

    String[] arrayStr1;
    arrayStr1 = new String[3];
    arrayStr1[0] = "hola";
    arrayStr1[1] = "pepe";
    arrayStr1[2] = "paco";
    for (String arrayPost: arrayStr1){
        System.out.println(arrayPost);
    }

    int[][] arrayInt2 = {
            {1,2},
            {3,4}
    };
    for (int row=0;row<arrayInt2.length;row++){
        System.out.printf("[ ");
        for (int col=0;col<arrayInt2[row].length;col++){
            System.out.printf(" %d ",arrayInt2[row][col]);
        }
        System.out.printf(" ]\n");

    }
    String[][] arrayStr2 = {
            {"pera","platano"},
            {"paco", "pepe"}
    };
    for (String[] strRow: arrayStr2){
        System.out.printf("[ ");
        for (String strCol: strRow){
            System.out.printf("%s ",strCol);
        }
        System.out.printf(" ]\n");
    }
    }

}
