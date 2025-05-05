package com.rays.oop;

public final class Immutable {

	private final int no;

	public Immutable(int no) {
		this.no = no;

	}

	public int getNo() {
		return no;

	}

	public static void main(String[] args) {
		Immutable ob = new Immutable(20);
		
		System.out.println(ob.getNo());
	}
}
