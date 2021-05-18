package teste.array;
import java.util.Scanner;

class App {
    public static void main(String[] args) {

        String[] arrayString = new String[25];
        Scanner myObj = new Scanner(System.in);
        int i;

        try {
            
            for (i = 0; i < arrayString.length; i++) {
                System.out.println("Enter username");         
                arrayString[i] = myObj.nextLine();
                System.out.println("Username ["+i+"]: " + arrayString[i]);
            }
            
        } finally {

            myObj.close();

        }
        
    }

}

