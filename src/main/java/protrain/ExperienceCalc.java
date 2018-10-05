package protrain;

public class ExperienceCalc {


    public static double calc(double b, double lvl,double pkm, double wlvl ){


        double a = 1;
        double xb = 0;
        double xs = 0;
        double gx = 0;
        double gl = 0;
        double ms = 0;


        double resultA = (a*b*lvl)/(5*pkm);
        System.out.println(resultA);
        double resultB = Math.pow(((2*lvl)+10),2.5)/Math.pow((lvl+wlvl+10),2.5);
        System.out.println(resultB);
        double resultAB = (resultA*resultB)+1;


        double resultC = 1+ms+xb+xs+gx+gl;
        System.out.println(resultC);
        double resultD = lvl/2;

        System.out.println("******");

        return resultAB*resultC*resultD;
    }
}
