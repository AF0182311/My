package com.rajneesh;
// super keyword is used to invoke parent class method
class Ritika
{
	public void hello()
	{
		System.out.println("Iam ritika beauty queen");
	}
}
public class Shivani extends Ritika
{
public void hello()
{
	System.out.println("Iam shivani");
}
 public void call()
 {
	
	hello();
	super.hello();
}

public static void main(String[] args)
{
	Shivani obj=new Shivani();
	obj.call();
	
}
}
