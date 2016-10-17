package ex;
/*
 * Topic: 寫一個程式讓使多個正整數(包含0)直到使用者輸入-1 時停止，同時要顯示這些數字 總合 及 平均。
 * Date: 2016/10/17
 * Author: 105021058 蕭懋霖
 */

import java.util.Scanner;
public class ex01_105021058 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int sum=0;
		int size=0;
		while(true){
			int a=scn.nextInt();
			if(a==-1){break;}
			sum=sum+a;
			size++;
		}
		System.out.println(sum);
		System.out.println((double)((float)sum/(float)size));
	}

}
