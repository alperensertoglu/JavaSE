package com.AlperenSertoglu.hafta01.gun01.algoritma;

import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class Soru1 {
// Bir kenarı girilen karenin alanını hesaplama
	public static void main(String[] args) {
	int kenar,sonuç;
	Scanner input = new Scanner(System.in);
		kenar = input.nextInt();
		sonuç = kenar*kenar;
		System.out.println(sonuç);
		
		if(kenar <= 15)
			System.out.println("a");
	
		
		
		

	}

}
