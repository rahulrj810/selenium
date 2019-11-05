package practice;

import java.util.Scanner;

public class Sentence_rev {
	public static void main(String args[]) {
		System.out.println("enter the sentene");
		Scanner sc=new Scanner(System.in);
		String srt= sc.nextLine();
		System.out.println("srt"+srt.length());
		
		String obj=srt.replace(" ", "");
		System.out.println(obj);
		System.out.println(obj.length());
		
		
	}


}
