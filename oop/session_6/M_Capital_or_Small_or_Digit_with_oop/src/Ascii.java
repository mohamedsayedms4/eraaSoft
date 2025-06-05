public class Ascii {

    public static void checkCaptialOrSmallOrDigit(char input) {

        if(input>=65 && input <=90)
        {
            System.out.println("ALPHA\nIS CAPITAL");
        }
        else if(input>=97&&input<=122)
        {
            System.out.println("ALPHA\nIS SMALL");

        }
        else
        {
            System.out.println("IS DIGIT");

        }
    }
}
