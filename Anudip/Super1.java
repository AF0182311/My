package com.rajneesh;
// super keyword is used to access parent class instance variable (static variable)
class Super
{
	// static int a=20;
	int a=20;
}
public class Super1 extends Super {
   int a=10;
   public void hello()
   {
	  // int a=50;
	 System.out.println(a);
	 System.out.println(super.a);
   }
   public static void main(String[] args)
   {
	   Super1 obj=new Super1();
	   obj.hello();
   }
}
