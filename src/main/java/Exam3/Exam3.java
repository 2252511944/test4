package Exam3;

import java.util.Scanner;

public class Exam3 {
	public static void main(String[] args){
		int count=0;
		Scanner scan = new Scanner(System.in);
		System.out.print("请输入日期：");
		String time  = scan.nextLine();
		int mouth = Integer.parseInt(time.substring(5, 7));
		int day = Integer.parseInt(time.substring(8, time.length()));
		
		switch(mouth){
		case 1:
			count = day;
			break;
		case 2:
			count = 31+day;
			break;
		case 3:
			count = 31+29+day;
			break;
		case 4:
			count = 31+29+31+day;
			break;
		case 5:
			count = 31+29+31+30+day;
			break;
		case 6:
			count = 31+29+31+30+30+day;
			break;
		case 7:
			count = 31+29+31+30+31+30+day;
			break;
		case 8:
			count= 31+29+31+30+31+30+31+day;
			break;
		case 9:
			count= 31+29+31+30+31+30+31+31+day;
			break;
		case 10:
			count=  31+29+31+30+31+30+31+30+30+day;
			break;
		case 11:
			count=31+29+31+30+31+30+31+30+30+31+day;
			break;
		case 12:
			count=31+29+31+30+31+30+31+30+30+31+30+day;
			break;
		}
		
		System.out.println("你输入的日期为当年的第" + count + "天");
		
	}
}
