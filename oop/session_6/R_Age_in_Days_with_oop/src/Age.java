public class Age {
    public static void calcAge(int date) {

        int year = date / 365 ;

        date -= 365 * year ;
        int months = date / 30 ;
        date -= months * 30 ;
        System.out.println(year +" years");
        System.out.println(months+" months");
        System.out.print(date+" days");
    }
}
