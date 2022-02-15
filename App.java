/*
* File: App.java
* Author: Sánta Renáta Diána
* Copyright: 2022, Sánta Renáta Diána
* Group: Szoft I N
* Date: 2022-02-15
* Github: https://github.com/santarenata/
* Licenc: GNU GPL
*/

import java.util.Scanner;

class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Santa Renata Diana, 2022-02-15");
		System.out.println("Feladat 0301");
		System.out.println("Kor alapu kup terfogata");
		
		System.out.print("Sugar: ");
		double sugar = sc.nextDouble();
		
		System.out.print("Magassag: ");
		double magassag = sc.nextDouble();
		
		double terfogat =
			(1.0/3.0)*
			Math.pow(sugar, 2)*
			Math.PI*
			magassag;
		
		System.out.println("Terfogat: " + terfogat);
		
		
	}
}
