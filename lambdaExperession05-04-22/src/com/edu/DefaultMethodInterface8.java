package com.edu;

interface Calulations{
	void add(int a, int b);
	 default void mult(int a, int b) {
		int m=a*b;
		System.out.println("product="+m);
		
	}
	 static void sub(int a, int b) {
		 int ans=a-b;
		 System.out.println("Difference="+ans);
		 
	 }
}

public class DefaultMethodInterface8 implements Calulations {
	@Override
	public void add(int a, int b) {
		int s=a+b;
		System.out.println("sum="+s);
		
	}

	public static void main(String[] args) {
		DefaultMethodInterface8 ob=new DefaultMethodInterface8();
		ob.add(4, 6);
		ob.mult(8, 6);
		Calulations.sub(8,2);

	}

	

}
