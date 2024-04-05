package org.example.e100;

import java.util.Scanner;

public class E100StringManipulations {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("In:");
        String s= inp.nextLine();
for(int i=s.length()-1; i>=0; i--){
        System.out.print(s.charAt(i));
        }
        System.out.println();}}
/*	String text = "";
		Scanner sc = new Scanner(System.in);
		text = sc.nextLine();
		String allData[] = text.split(" ");   //[""]
		System.out.println(allData.length);
		if(allData.length==1) {  // 1 ug baiwal
			StringBuilder  s=new StringBuilder(text);
			System.out.println(s.reverse());
		}
		else {
			for(int y=0;  y<allData.length;  y++) {
				StringBuilder  s=new StringBuilder(allData[y]);
				System.out.print(s.reverse()+" ");
			}
		}

	}

}*/