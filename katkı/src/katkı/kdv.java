package katkı;

import java.util.Scanner;

public class kdv {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double tutar, kdvTutar, total, rate =16;
		System.out.println("Miktar Giriniz = ");
		tutar = scan.nextDouble();
		
		kdvTutar = tutar * (rate/100);
		total = kdvTutar + tutar;
		
		System.out.println("KDV Oranı = %" + rate);
		System.out.println("KDV Miktarı = " + kdvTutar);
		System.out.println("KDV'li Miktar = " + total);
		

	}

}
