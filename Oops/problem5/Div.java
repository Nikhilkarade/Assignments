package com.yash.oops.problem5;

public class Div extends Mul{

	@Override
	void div(int a, int b) {
		int c=a/b;
		System.out.println("div: "+c);
		
	}
	public static void main(String[] args) {
		CalcAbs c = new Div();
		c.sum(23, 7);
		c.sub(30, 15);
		c.mul(8, 10);
		c.div(100, 2);
	}

}
