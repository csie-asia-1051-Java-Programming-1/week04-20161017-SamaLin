package hw;

/*
 * Topic: 程式個程式讓使用者連續輸入整數 (正數、負數及零)，直到使用者輸入 999 時停止，然後顯示正數有多少個，0 有幾個，
 * 		     負數總共有幾個，使用者可以重覆執行直到使用者輸入n;
 *
 * Date: 2016/10/17
 * Author: 105021058 蕭懋霖
 */

import java.util.Scanner;
public class hw03_105021058 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		while(true){
			int a=0;//+
			int b=0;//0
			int c=0;//-
		
			int d=0;
			while(d!=999){
				d=scn.nextInt();
				if(d>0){a++;}
				if(d==0){b++;}
				if(d<0){c++;}	
			}
			System.out.println("正數:"+(a-1));
			System.out.println("0:"+b);
			System.out.println("負數:"+c);
			String count=scn.next();
			if(count.equals("y")||count.equals("Y")){break;}
		}
		
	}

}