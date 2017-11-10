package cjava.abstractclass;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String s=input.nextLine();
		MyBook new_novel=new MyBook();
		new_novel .setTitle(s);
		System.out.println("The title is: "+new_novel.getTitle());
		input.close();
	}

}
