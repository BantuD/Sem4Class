import java.lang.*;
class Calcus
{
int val;
 Calcus()
 {
     //Default constructor
 }
     
 Calcus(int x)
 { 
     val=x;
  //System.out.println("Constructor call");   
 }
 
/* # Robj R = new Robj(val); -> if you declare like this then value if "val" will be passed 0 
 Because Robj R = new Robj(val); will be called first before even perameterized constructor 
 So you need to put it in a function to call it after constructor.
*/

/* R.call() -> This operation can't be done outside of a method or directly in the class 
   You have to make a method to call it from it.
*/

  Robj returnObj()
  {

      Robj R = new Robj(val); //This will get called after constructor
      R.call(); //This is a valid statement because its inside a method          
   return R;  
  }
}
class Robj
{
    int y,val;
    Robj(int x)
    {
        val=x;
    }
    int fabo(int x)
    {
        if(x==0)
        {
            return 0;
        }
        if(x==1)
        {
            return 1;
        }
        return fabo(x-1)+fabo(x-2);
    }
    void call()
    {
        y=fabo(val);
    }
    
}
public class Main
{
public  static void main (String[] args) {
    Calcus C1 = new Calcus(3); //Here you provide Step of Fabonacci Series exp: 3
    Robj R2;
    R2=C1.returnObj();        //Calling Object returning method of Calcus class 
    System.out.println(R2.y);  
    
}
}