package usluSayiHesaplama;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int base,power,result=1;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Üssü alınacak sayıyı giriniz: ");
		base=scanner.nextInt();
		System.out.println("Sayının kaçıncı kuvveti alınacak?");
		power=scanner.nextInt();
		for(int i=1;i<power+1;i++) {			
			result*=base;
		}		
		System.out.println(base+" sayısının "+power+"'inci kuvveti "+result+"'dir");
	}

}
