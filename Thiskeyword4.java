package com.pack1;

public class Thiskeyword4 
{
void meth1()
{
	System.out.println("meth1() called");
}
Thiskeyword4()
{
	this(100);
	this.meth1();
	System.out.println("Default Constructor called");
}
Thiskeyword4(int a)
{
	System.out.println("parameterized constructor called:"+a);
}
public static void main(String[] args) 
{
new Thiskeyword4().meth1();	
}
}
