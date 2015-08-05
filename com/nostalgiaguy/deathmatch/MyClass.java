package com.nostalgiaguy.deathmatch;

public class MyClass {

	private String name;
	
	public static void main(String[] args) {
		
		MyClass m1=new MyClass();
		MyClass m2=new MyClass();
		
		m1.name=m2.name="M1";
		callMe(m1,m2);
		System.out.println(m1+" & "+m2);
		
	}
	
	public static void callMe(MyClass... m){
		m[0]=m[1];
		m[1].name="NEW NAME";
	}

/*	@Override
	public String toString() {
		return "MyClass [name=" + name + "]";
		//return name;
	}
	*/
	
}
