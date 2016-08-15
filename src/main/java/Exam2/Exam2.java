package Exam2;

import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("请输入工资：");
		int salary = scan.nextInt();
		double sum=0;
//		if(salary < 1500){
//			double s1 = salary*0.03;
//			sum = s1;
//			System.out.println("所需要缴纳的税费为：" + sum);
		if(salary>3500 && salary<4500){
			double s2 = (salary-3500)*0.1;
			sum += s2; 
			System.out.println("所需要缴纳的税费为：" + sum);
		}else if(salary > 4500 && salary < 9000){
			double s3 = (salary-4500)*0.2;
			sum += s3;
			System.out.println("所需要缴纳的税费为：" + sum);
		}else if(salary > 9000 && salary < 35000){
			double s4 = (salary-9000)*0.25;
			sum += s4;
			System.out.println("所需要缴纳的税费为：" + sum);
		}else if(salary > 35000 && salary < 55000){
			double s5 = (salary-35000)*0.3;
			sum += s5;
			System.out.println("所需要缴纳的税费为：" + sum);/////////
		}else if(salary > 55000 && salary < 80000){
			double s6 = (salary-55000)*0.35;
			sum += s6;
			System.out.println("所需要缴纳的税费为：" + sum);
		}else if(salary > 80000){
			double s7 = (salary-80000)*0.45;
			sum += s7;
			System.out.println("所需要缴纳的税费为：" + sum);
		}
	}

}
