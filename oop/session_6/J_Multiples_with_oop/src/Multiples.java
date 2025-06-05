public class Multiples {

    public static void  checkMultiples(int number1 , int number2) {
        if((number1%number2 == 0)||(number2%number1 == 0))
        {
            System.out.println("Multiples");
        }
        else
        {
            System.out.println("No Multiples");
        }
    }
}
