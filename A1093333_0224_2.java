public class A1093333_0224_2{

    public static double FarentoCelsius(double num){


        return ((num-32)*5)/9;

    }

    public static double CelsiustoFaren(double num){


        return ((num*9)/5)+32;

    }

    public static void main(String[]args){

        double faren=98.6;
        double celsius=37;
        double n=FarentoCelsius(faren);
        double m=CelsiustoFaren(celsius);

        System.out.println("Farenheit= "+ faren+ " Celsius= "+ n );
        System.out.println("Celsius= "+ celsius+ " Farenheit= "+ m );


    }
}
