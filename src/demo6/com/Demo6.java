package demo6.com;
 
public class Demo6 {     //Public class
	public static void main(String[]args) // main method   // class loading
	{ 
		AA a=new AA ();   //OBJECT CREATED
		}
}

class AA {
int a;         //instance variable declaration
static int b;   // static variable declaration

void m1()                        // instance method
{
	int c;                       // local variable
	 System.out.println(" instnce met aaaa===="+a);  // no need to create object because variable is instance and field/method is also instance in same class
	  System.out.println(" instance met bbbb===="+b);
	  
 }
 
 static void m2() 
 {                              // static method
	  AA a1=new AA();    // for access instance variable in static field need to create object in static field.
	  System.out.println("static met a===="+a1.a);
	  System.out.println("static met b===="+b);
 }
 
 { //Instance block
	 System.out.println("instance a+++===="+a);
	  System.out.println("instance b++===="+b);
 }
 
 static
 {                             // static block
	  AA a1=new AA();          // call instance field after creation of object
	  System.out.println("static a===="+a1.a);
	  System.out.println("static b===="+b);
	  a1.m1();                       // call m1 field with help of object because we can not direct call in static method i.e.m1 is instance method and we are trying to access in static method.
      a1.m2();
 }
 


}

	
	

