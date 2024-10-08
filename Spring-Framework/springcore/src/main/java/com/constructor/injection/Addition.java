package com.constructor.injection;

public class Addition {
	private int a;
	private int b;

	public Addition(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		System.out.println("Constructor : int, int");
	}

	public Addition(double a, double b) {
		super();
		this.a = (int) a;
		this.b = (int) b;
		System.out.println("Constructor : double, double");
	}

	public Addition(String a, String b) {
		super();
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		System.out.println("Constructor : String, String");
	}

	public void sum() {
		System.out.println("sum is = " + (this.a + this.b));
	}

}
