package com.rajneesh;
//super keyword is used to invoke parent class constructor
class Swill
{
	Swill()
	{
		//super();
		System.out.println("Iam athletes");
	}
}
class Delvin extends Swill
{
	Delvin()
	{
		//super();
		System.out.println("Iam cricketer");
	}
}
class Ayushi extends Delvin
{
	Ayushi()
	{
		//super();
		System.out.println("I love fried rice");
	}
}
public class Jyoti extends Ayushi {
    
	Jyoti()
	{
		//super();
		System.out.println("I love chicken tikka");
	}
	public static void main(String[] args) {
		Jyoti obj=new Jyoti();
		

	}

}
