package j0719;

import java.util.Scanner;

public class exam22 {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		
		System.out.print("출력할 단을 입력하세요 : ");
		int dan=s1.nextInt();
		
		int i=1;
		do {
		     System.out.printf("%d*%d=%d\n", dan, i ,dan*i);
		     i++;                         
		}while(i<10);
		
     //do-while 먼저 수행+나중조건. 무조건 한번은 찍힘


	}

}
