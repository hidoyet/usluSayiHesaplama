package usluSayiHesaplama;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int taban,kuvvet,sonuc=1;
		Scanner scanner=new Scanner(System.in);
		System.out.println("�ss� al�nacak say�y� giriniz: ");
		taban=scanner.nextInt();
		System.out.println("Say�n�n ka��nc� kuvveti al�nacak?");
		kuvvet=scanner.nextInt();
		for(int i=1;i<kuvvet+1;i++) {			
			sonuc*=taban;
		}		
		System.out.println(taban+" say�s�n�n "+kuvvet+"'inci kuvveti "+sonuc+"'dir");
	}

}
