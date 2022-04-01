package usluSayiHesaplama;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int taban,kuvvet,sonuc=1;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Üssü alýnacak sayýyý giriniz: ");
		taban=scanner.nextInt();
		System.out.println("Sayýnýn kaçýncý kuvveti alýnacak?");
		kuvvet=scanner.nextInt();
		for(int i=1;i<kuvvet+1;i++) {			
			sonuc*=taban;
		}		
		System.out.println(taban+" sayýsýnýn "+kuvvet+"'inci kuvveti "+sonuc+"'dir");
	}

}
