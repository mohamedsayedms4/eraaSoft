public class Ascii {

    public static void convert(char input) {
        if(input >= 'A' && input <= 'Z') {
            // Convert to lowercase by adding 32 to ASCII value of uppercase letter
            char converted = (char) (input + 32);
            System.out.println(converted);


        }else{
            char converted = (char) (input - 32);
            System.out.println(converted);
        }
    }
}
