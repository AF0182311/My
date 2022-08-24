package com.rajneesh;
// can we overload main method yes it is possible to overload main method but jvm always call only that
// main method which take only string argument
public class MainMethodOverloading 
   {
  public static void main(String[] args) 
	{
		System.out.println("String argument");
		int[] a= {56,77};
		char[] b= {'a','b'};
		float[] c= {5.6f,6.7f};
		main(a);
		main(b);
		main(c);
    }
   public static void main(int[] args) 
   {
	   System.out.println("Int argument");
   }
   public static void main(char[] args) 
   {
	   System.out.println("Char argument");
   }
   public static void main(float[] args) 
   {
	   System.out.println("Float argument");
   }


}
