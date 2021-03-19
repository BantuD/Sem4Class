package mypack1;
import java.lang.*;
import mypack1.inner.*;

class MyClass1
{
  public static void main(String arg[])
  {
    MyClass3 M3 = new MyClass3();
    M3.display();
   }
}
//Run this first
//Classes of inner package can not access the classes of outer package