package teste.array;
import java.util.Scanner;

class App {
    public static void main(String[] args) {

        String[] arrayString = new String[25];
        Scanner myObj = new Scanner(System.in);
        int i;

        for (i = 0; i < arrayString.length; i++) {
            System.out.println("Enter username");
            arrayString[i] = myObj.nextLine();
            System.out.println(i + "Username ["+i+"]: " + arrayString[i]);
        }

        myObj.close();
        
    }

}

