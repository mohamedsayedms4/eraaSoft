public class Coordinates {

    public static void opreation(double numx, double numy)
    {
        if (numx==0 && numy==0)
        {
            System.out.println("Origem");
        }else if (numx==0 && numy!=0)
        {
            System.out.println("Eixo Y");
        }
        else if(numy==0 && numx!=0)
        {
            System.out.println("Eixo X");
        }
        else
        {

            if(numx > 0 && numy > 0)
            {
                System.out.println("Q1");
            }
            else if(numx < 0 && numy > 0)
            {
                System.out.println("Q2");
            }
            else if(numx < 0 && numy < 0)
            {
                System.out.println("Q3");
            }
            else
            {
                System.out.println("Q4");
            }
        }
    }

}
