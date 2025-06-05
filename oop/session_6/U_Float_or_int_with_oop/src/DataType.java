public class DataType {
    public static void checkIntOrFloat(double number) {
        int numberInt =(int) number ;
        double res = number - (double)numberInt ;
        if(res == 0)
        {
            System.out.println("int "+numberInt);
        }
        else
        {
            System.out.printf("float %d %.3f",numberInt,res);
        }
    }
}
