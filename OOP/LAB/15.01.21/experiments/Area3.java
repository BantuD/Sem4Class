import java.lang.*;
public class Area
{
  public static void main(String arg[])
  {
   int b=Integer.parseInt(arg[0]);
   int h=Integer.parseInt(arg[1]);
   double T=triArea(b,h);
   int S=square(h);
   double C=circle(b);
   System.out.println("Area of Square is "+S);
   System.out.println("Area of Triangle is "+T);
   System.out.println("Area of Circle with Radius "+b+" is "+C);
   }
   static double triArea(int b,int h)
         {
           return (b*h)/2;
         }
   static int square(int h)
          {
            return (h*h);
          }
    static double  circle(int b)
         {
           return (3.14*b);
          }
}    