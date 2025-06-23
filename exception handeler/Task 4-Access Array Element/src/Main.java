import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    //        Create an array of 5 elements. Ask user to enter an index and print the value.
    //        Handle ArrayIndexOutOfBoundsException.


        Scanner in = new Scanner(System.in);
        int [] array ={10, 20, 30, 40, 50};

        try {
            System.out.print("Enter an index (0 to 4): ");
            int index = in.nextInt();
            System.out.println("Value at index " + index + ": " + array[index]);

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index out of bounds");
        }
    }
}