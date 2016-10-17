package ex;
/*
 * Topic: 讓使用者輸入 一個正整數 n 及一個字元符號，然後顯示出下列圖形 (例 n = 4,字元符號= @)
    @@@@
    @@@  
    @@  
    @
 * Date: 2016/10/17
 * Author: 105021058 蕭懋霖
 */

import java.util.Scanner;
public class ex04_105021058 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		String Char=scn.next();
		for(int i=n;i>=1;i--){
			for(int j=1;j<=i;j++){
				System.out.print(Char);
			}
				System.out.println();
		}
		
	}

}