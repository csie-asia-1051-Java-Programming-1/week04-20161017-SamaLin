package hw;

/*
 * Topic: �ϥΪ̿�J����� n �P m �M��p��

 * Date: 2016/10/17
 * Author: 105021058 �����M
 */

import java.util.Scanner;
public class hw02_105021058 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
			int n=scn.nextInt();
			int m=scn.nextInt();
		
			int a=1;
			int b=1;
			int c=1;
			for(int i=n;i>=1;i--){
				a=a*i;
			}
			for(int i=m;i>=1;i--){
				b=b*i;
			}
			for(int i=n-m;i>=1;i--){
				c=c*i;
			}
			System.out.println(a/(b*c));
		}
	}