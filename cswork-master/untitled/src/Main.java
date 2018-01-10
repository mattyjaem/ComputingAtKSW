import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;
public class Main {
        public static int var = 1;
        public static String array[] = new String [10]; //creates global arra
    public static void main(String[] args) {

        displaymenu();
    }
    private static void displaymenu(){
        int x;
        int choice;
        Scanner scanInput = new Scanner(System.in);
        System.out.print("1. Add name " + '\n' +"2.Display name " + '\n' +"3. Quit" + '\n'); //menu
        System.out.print("Enter your choice");
        choice = scanInput.nextInt();

        if (choice <1 || choice >3 ){
            System.out.print("Invalid choice - please re-enter");
        }
        if(choice ==1){       //chooses which method to call based on input
            addname();
        }
        if (choice ==2){
            displaylist();
        }§
        if (choice ==3){
            quit();
        }
    }
    private static void addname(){ //addname function
            String name;
            int choice;
            int position;
            Scanner scanInput = new Scanner(System.in);
            System.out.print("Enter a name to be added to the list");
            name = scanInput.nextLine();
            System.out.print("Enter a position in the list to add the name");
            position = scanInput.nextInt();
            if (position < 1 || position > 10) {
                System.out.print("Error, please re-enter the position"); //error message
                position = scanInput.nextInt();
            }

            while (position >= 1 && position <= 10 && var <2) {
                array[position - 1] = name;
                System.out.print("Would you like to insert another name?" + '\n' + "1. Yes" + '\n' + "2.No"); //asks if user wants to add another name
                choice = scanInput.nextInt();
                if (choice == 1) {
                    addname();
                }
                if (choice == 2) {
                    try
                    {
                        Thread.sleep(500);
                    }
                    catch(InterruptedException ex)
                    {
                        Thread.currentThread().interrupt();
                    }
                    System.out.print("Returning to menu" + "\n");
                    try
                    {
                        Thread.sleep(500);
                    }
                    catch(InterruptedException ex)
                    {
                        Thread.currentThread().interrupt();
                    }
                    displaymenu();
                    var++;
                }
            }
    }
    private static void displaylist(){ //displaylist function
        System.out.println(Arrays.toString(array));
        displaymenu();
    }
    private static void quit(){    //quit function
        System.out.print("Program terminating");

    }
}
//this code is now FINISHED.