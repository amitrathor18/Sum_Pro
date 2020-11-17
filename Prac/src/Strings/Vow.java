package Strings;

import java.util.Scanner;

public class Vow {
	public static void main(String a[]) {
		Scanner sc = new Scanner(System.in);
		String str= sc.nextLine();
		
		sc.close();
		
		str=str.toUpperCase();
		System.out.println(str);
		
		int l = str.length();
		System.out.println(l);
		
		
		int count=0;
		
		for(int i=0; i<(str.length()); i++) {
			char c = str.charAt(i);
			if(c=='A' && c=='E' && c=='I' && c=='O' && c=='U' ) {
				count++;
				System.out.println(i);
			}
		}
		System.out.println(count);
	}
}
