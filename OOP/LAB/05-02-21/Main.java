import java.lang.*;
//Program to categorize different type of categorize
class Envi
{
  String envName;
  String food;
  Envi(String E,String F) //Created a perameterized costructor
  {
    envName=E;
    food=F;
   }
 void printall()
   {
    System.out.println("*Environment*");
    System.out.println("Environment name: "+envName+"\nFood "+food);
   }

}
class BodyParts
{
  int legs=0;
  int fins=0;
  int wings=0;
  String tail;

 BodyParts(int l,int f,int w,String t) //Perameterized costructor
 {
  legs=l;
  fins=f;
  wings=w;
  tail=t;
  }


BodyParts(int l,String t) //Perameterized costructor No wings and fings
 {
  legs=l;
  tail=t;
  }
void printall()
   {
    System.out.println("*BodyParts*");
    System.out.println("Legs: "+legs+"\nfins: "+fins+"\nwings: "+wings+"\nTail: "+tail);
   }
}
class Creatures
{
  String name;
  Envi E;
  BodyParts B;
  Creatures(String n1,Envi e1,BodyParts b1)
  {
    name=n1;
    E=e1;
    B=b1;
  }
   
}
class PrintCreatures
{
 Creatures C1,C2,C3;
 void Printall(Creatures x1,Creatures x2,Creatures x3)
   {
     C1=x1;
     C2=x2;
     C3=x3;

 System.out.println("\n<-----For Land Predators----->\n");
  C1.E.printall();
  C1.B.printall();
 
  System.out.println("\n<-----For Birs----->/n");
   C3.E.printall();
   C3.B.printall();    
  
 System.out.println("\n<-----fish----->/n");
   C2.E.printall();
   C2.B.printall();   

  }
 void Printall(Creatures x1,Creatures x2)
   {
     C1=x1;
     C2=x2;

  System.out.println("\n<-----For Land Predators----->\n");
  C1.E.printall();
  C1.B.printall();
 
  System.out.println("\n<-----For Birs----->/n");
   C3.E.printall();
   C3.B.printall();
   
  }
     

public class Main
{
 public static void main(String arg[])
 {

  Envi E1=new Envi("Water","Other fishes or sea food"); //for fish
  Envi E2=new Envi("Land","Meat"); //For predator animals
  Envi E3=new Envi("Air","insects"); //For birds 
                               //Declared Environment 

  BodyParts BP1=new BodyParts(0,2,0,"Yes"); //For Fish
  BodyParts BP2=new BodyParts(4,"Yes"); //For predator animals
  BodyParts BP3=new BodyParts(2,0,2,"Yes");//For birds 
                                                     //Declared BodyParts

  Creatures C1=new Creatures("Land Predators",E2,BP2); //For land predators
  Creatures C2=new Creatures("Fish",E1,BP1);  //For fish
  Creatures C3=new Creatures("Birds",E3,BP3);  //for birds 
  

  /*System.out.println("\n<-----For Land Predators----->\n");
  C1.E.printall();
  C1.B.printall();
 
  System.out.println("\n<-----For Birs----->/n");
   C3.E.printall();
   C3.B.printall();    
  
 System.out.println("\n<-----fish----->/n");
   C2.E.printall();
   C2.B.printall(); */
  

}
  

}  









