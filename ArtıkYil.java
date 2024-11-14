package sa;

import java.util.Scanner;

public class ArtıkYil {

	public static void main(String[] args) {

		int yıl;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Yıl Giriniz : ");
		yıl = input.nextInt();
		
		
		
		if ((yıl%4)==0) {
			System.out.println(yıl +" bir artık yıldır");
		}else {
			System.out.println(yıl + " bir artık yıl değildir");
		}
		
		
		
		
		
		
		
		
	}

}
