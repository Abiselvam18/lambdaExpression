//java 8 feature default and static method in interface
package com.edu1;

interface Calulations{
	void add(int a, int b);
	 default void mult(int a, int b) {
		int m=a*b;
		System.out.println("Calulations product="+m);
		
	}
	 static void sub(int a, int b) {
		 int ans=a-b;
		 System.out.println("Difference="+ans);
		 
	 }
}

interface MyUpdateCalulations{
	default void mult(int a, int b) {
		int m=a*b;
		System.out.println("MyUpdateCalulations product="+m);
		
	}
	void myfunct();
}

public class DefaultMethodinterface8 implements Calulations,MyUpdateCalulations {
	@Override
	public void add(int a, int b) {
		int s=a+b;
		System.out.println("sum="+s);
		
	}
	@Override
	public void myfunct() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mult(int a, int b) {
		Calulations.super.mult(a, b);
		MyUpdateCalulations.super.mult(7, 8);
	}
	public static void main(String[] args) {
		DefaultMethodinterface8 ob=new DefaultMethodinterface8();
		ob.add(2, 6);
		ob.mult(4, 8);
		Calulations.sub(8,2);
}
	
}
