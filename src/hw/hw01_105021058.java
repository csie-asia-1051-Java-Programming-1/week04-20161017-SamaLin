package hw;
/*
 * Topic: �ϥΪ̿�J n ���� n �� �O��ƦC (�� n = 5 )
		  1, 1, 2, 3, 5

 * Date: 2016/10/17
 * Author: 105021058 �����M
 */

import java.util.Scanner;
public class hw01_105021058 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int data[]=new int[n];
		for(int i=0;i<=n-1;i++){
			if(i<=1){
				data[i]=1;
			}else{
			  data[i]=data[i-1]+data[i-2];
			}
		}
		for(int i=0;i<=n-1;i++){
			System.out.print(data[i]);
			if(i!=n-1){System.out.print(",\t");}
		}
		
	}

}