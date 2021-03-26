import java.util.Scanner;
class NotAligible extends RuntimeException
{
	NotAligible(String s)
	{
		super(s); //Passing to default handler if nobody wil catch this exception
	}
}

class Admission
{
    String name;
    int age;
    int level;
    int[] rollArr = new int[5];
    int intRoll;
    Admission(String name,int age,int level,int roll)
    {
        this.name=name;
        this.age=age;
        this.level=level;
        this.intRoll=roll;
    }
    void intToarr()
    {
        int i=0;
        while(intRoll>0)
        {
            rollArr[i]=intRoll%10;
            intRoll=intRoll/10;
            i++;
        }
    }
    
}
public class Main 
{ 
    public static int flag;
    //staic int flag=0;
    public static void main(String arg[])
    {
        //int flag;
        String name;
        int age ;
        int level;
        int introll;
  //The rol which we assing will we reversed version of student entered:policy
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your name: ");
        name = sc.next();
        System.out.println("Enter your age: ");
        age = sc.nextInt();
        System.out.println("Enter the level: ");
        level=sc.nextInt();
        System.out.println("Enter RollNumber: ");
        introll=sc.nextInt();
        Admission A = new Admission(name,age,level,introll);
      //multiple try catch
        try
        {
            if(level>age+5) 
            { 
                flag=1;
                throw new NotAligible("You're under age");  //its like passing to Constructor of exception class
               
            }
            age = (age/age)*age;
            A.intToarr(); //perameter already passed
            try //nested try catch
            {
                level=(level/level)*level;
            }
            catch(ArithmeticException levE)
            {
                flag=1;
                System.out.println("Leven can not be 0");
            }
            //nested try catch end;
        }
        catch (ArithmeticException ageE)
        {
            flag=1;
            System.out.println("You can not put age as 0");
        }
        catch (ArrayIndexOutOfBoundsException rAe)
        {
            flag=1;
            System.out.println("You have to enter roll number length of 5");
        }
       //multiple try catch end  
       finally
       {
             if(flag==1)
             {
               System.out.println("Admission is not successful");
             }
             else
             {
                 System.out.println("Admission is successful");
             }
       }
    }
    
 
}