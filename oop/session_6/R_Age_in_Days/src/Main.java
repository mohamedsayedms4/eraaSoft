import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int date = scanner.nextInt();

        int year = date / 365 ;

        date -= 365 * year ;
//        System.out.println(date);
        int months = date / 30 ;
        date -= months * 30 ;
        System.out.println(year +" years");
        System.out.println(months+" months");
        System.out.print(date+" days");
    }
}