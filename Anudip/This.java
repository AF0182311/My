	// this keyword is a reference variable that refer to current class object
	// purpose
	// this keyword cannot be used in static method 
	// this keyword is used to access current class instance variable (static variable)
	// this keyword is used to call current class instance method
	// this() is used to invoke current class constructor
	// this keyword is used to return current class object
	// this keyword is used to pass as an argument in method
	// this keyword is used to pass as an argument in constructor block
	// In constructor only this() or super() can be used but it should be at line number 1 in
	// in constructor block
	// if didn't add any thing in constructor block then compiler is responsible to add super() at 
	// line number 1 automatically and it will call parent class
	
	// this is keyword and this() is a constructor
	// super is keyword and super() is a constructor
	    
	// super keyword is a reference variable that refer to parent class object
	// purpose
	// super keyword cannot be used in static method
	// super keyword is used to access parent class instance variable (static variable)
	// super keyword is used to invoke parent class method
	// super keyword is used to invoke parent class constructor
	
	
	
	// this keyword is used to access current class instance variable (static variable)
package com.rajneesh;

/*public class This 
{
    int a;
    static int b;
    public void hello(int a,int b)
    {
    	this.a=a;
    	this.b=b;
    	System.out.println(a+" "+b);
    }
	public static void main(String[] args)
	{
	This obj=new This();	
    obj.hello(10,20);
    }
    }*/

// this keyword is used to call current class instance method
/*public class This 
{
   public void add(int a,int b)
   {
	   System.out.println("Addition of two number:"+(a+b));
	   this.sub(20,10);
	   
   }
	public void sub(int i, int j) 
	{
	System.out.println("Subtraction of two number:"+(i-j));
	}
	public static void main(String[] args)
	{
		This obj=new This();
		obj.add(30,40);
	}
}*/

// this() is used to invoke current class constructor
/*public class This 
{
	This(int a,int b)
	{
		this(a);  
		System.out.println("Multiplication of two number:"+(a*b));
	}
	This(int side)
	{
		this(45,5,6);
		System.out.println("Area of square is:"+(side*side));
	}
	This(int a,int b,int c)
	{
		System.out.println("Addition of three number:"+(a+b+c));
	}
	public static void main(String[] args)
	{
		This obj=new This(10,20);
		System.out.println("Hello Shivani");
	}
}*/

// this keyword is used to return current class object
/*public class This 
{
	public This hello()
	{
		System.out.println("hello Shivani");
		return this;
	}
	public static void main(String[] args)
	{
	This obj=new This();
	This obj1=obj.hello();
	System.out.println(obj.hashCode());
	System.out.println(obj1.hashCode());
	}
	}*/

// this keyword is used to pass as an argument in method 
/*public class This 
{
	public void m2(This t)
	{
		System.out.println(t.hashCode());
	}
	public void m1()
	{
		m2(this);
	}
	public static void main(String[] args)
	{
		This obj=new This();
	}
}*/

// this keyword is used to pass as an argument in constructor block
/*public class This 
{
   This(int a,int b)
   {
	   m1(this);
	 System.out.println("Area of triangle:"+(0.5)*a*b);  
   }
	public void m1(This this1) 
	{
	System.out.println("Hashcode is"+this1.hashCode());
	}
	public static void main(String[] args)
	{
		This obj=new This(10,20);
	}
}*/
