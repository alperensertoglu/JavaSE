package com.AlperenSertoglu.hafta01.gun02;

import java.util.Scanner;

public class Teori01_ImportOrnegi {

	public static void main(String... arg) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("ilk sayiyi giriniz");
		int sayi1 = input.nextInt();
		System.out.print("Ikinci sayiyi giriniz");
		int sayi2 = input.nextInt();
		String toplama = "";
		char cikartma = '-';
		char carpma = '*';
		char bolme = '/';
		
		System.out.println("Yapılmasını istediğiniz işlemin operatörünü giriniz!(+,-,*,/)");	
		String karakter = input.next();
		if(karakter=="+") {
			System.out.println(sayi1+sayi2);
		}
		else if(karakter=="-") {
			System.out.println(sayi1-sayi2);
		}
		else if(karakter=="*") {
			System.out.println(sayi1*sayi2);
		}
		else if(karakter=="/"){
			System.out.println(sayi1/sayi2);
		}
		
		
		
	
		
		
		
		
		
		
	}
}
