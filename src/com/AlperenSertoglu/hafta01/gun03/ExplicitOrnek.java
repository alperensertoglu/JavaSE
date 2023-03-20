package com.AlperenSertoglu.hafta01.gun03;

public class ExplicitOrnek {

	public static void main(String[] args) {

		byte b;
		int i = 257;
		double d = 323.142;
		System.out.println("int >>>> byte");
		b = (byte)i;
		System.out.println("i = "+ i + " b ="+b);
		System.out.println("double >>> int dönüşümü");
		i = (int)d;
		System.out.println("d: " +d+"i: "+i );
		b = (byte)d;

	}

}
