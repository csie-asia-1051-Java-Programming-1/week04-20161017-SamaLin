package hw;

/*
 * Topic: 讓使用者輸入1, 2, 3, 與4選項，
		  1.輸入 n 並顯示圖形 (ex: n = 5)
		  2.輸入 n 並顯示圖形
		  3.輸入 n (必須是奇數)並顯示圖形
		  4.結束程式

 * Date: 2016/10/17
 * Author: 105021058 蕭懋霖
 */

import java.util.Scanner;
public class hw04_105021058 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int count=1;
		while(count==1){
			System.out.println("1.輸入 n 並顯示圖形 (ex: n = 5)");
			System.out.println("2.輸入 n 並顯示圖形");
			System.out.println("3.輸入 n (必須是奇數)並顯示圖形");
			System.out.println("4.結束程式");
			int a=scn.nextInt();
			int n=scn.nextInt();
			switch(a){
				case 1:
					for(int i=(n+1)/2;i>=1;i--){
						for(int j=1;j<=i;j++){
							System.out.print("@");
						}
						System.out.println();
					}
					for(int i=2;i<=(n+1)/2;i++){
							for(int j=1;j<=i;j++){
								System.out.print("@");
							}
							System.out.println();
						}
					break;
					
				case 2:
					for(int i=1;i<=(n+1)/2;i++){
							for(int j=1;j<=i;j++){
								System.out.print("%");
							}
							System.out.println();
						}
					for(int i=((n+1)/2)-1;i>=1;i--){
						for(int j=1;j<=i;j++){
							System.out.print("%");
						}
						System.out.println();
					}
					break;
					
				case 3:
					for(int i=1;i<=n;i+=2){
						for(int k=i;k<=(n+1)/2;k+=2){
							System.out.print(" ");
						}
						for(int j=1;j<=i;j++){
								System.out.print("#");
						}
							System.out.println();
					}
					for(int i=n-2;i>=1;i-=2){
						for(int k=i;k<=(n+1)/2;k+=2){
							System.out.print(" ");
						}
						for(int j=1;j<=i;j++){
								System.out.print("#");
						}
							System.out.println();
					}
					break;
					
				case 4:
					count=0;
					break;
			}
		
		}
	}

}