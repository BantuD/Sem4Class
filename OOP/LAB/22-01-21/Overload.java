import java.lang.*;
class Sum  //Sum class 
{
  int a=0,b=0,c=0,d=0;
  Sum(int x,int y)
    {
     a=x; b=y;
    }
  Sum(int x,int y,int z)
    {
      a=x; b=y; c=z;
    }
  Sum(int x, int y, int z,int k)
   {
     a=x; b=y; c=z; d=k;
   }
  
  double TotalSum() //This function will return the sum as double 
         {
           return (a+b+c+d);
         }
}


public class Overload  //Main Class
{
  public static void main(String arg[])
      {
        double ReturnSum;
           Sum MySum2 = new Sum(2,5);  //Passing 2,5 to Sum(int ,int) constructor
           Sum MySum3 = new Sum(3,2,5);  // to Sum(int ,int int)
           Sum MySum4 = new Sum (3,0,2,5); // to Sum(int ,int ,int ,int)
           
            ReturnSum = MySum2.TotalSum();   //Calling Sum(int,int) Constructor
            System.out.println("Sum of 2 and 5 is: "+ ReturnSum); 
            
            ReturnSum = MySum3.TotalSum();
            System.out.println("Sum of 3,2 and 5 is: "+ ReturnSum);
           
            ReturnSum = MySum4.TotalSum();
            System.out.println("Sum of 3,0,2 and 5 is: "+ ReturnSum);
        }
}