package hw;

/*
 * Topic: �{���ӵ{�����ϥΪ̳s���J��� (���ơB�t�Ƥιs)�A����ϥΪ̿�J 999 �ɰ���A�M����ܥ��Ʀ��h�֭ӡA0 ���X�ӡA
 * 		     �t���`�@���X�ӡA�ϥΪ̥i�H���а��檽��ϥΪ̿�Jn;
 *
 * Date: 2016/10/17
 * Author: 105021058 �����M
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
			System.out.println("����:"+(a-1));
			System.out.println("0:"+b);
			System.out.println("�t��:"+c);
			String count=scn.next();
			if(count.equals("y")||count.equals("Y")){break;}
		}
		
	}

}