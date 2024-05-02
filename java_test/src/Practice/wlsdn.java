package Practice;

import java.util.Scanner;

public class wlsdn {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] seats =new int[10][10];
		while(true) {
			for(int a = 1; a <= 10; a++) {
				System.out.print("[" + a + "]");
			}
			System.out.println(" 행");
			for(int a = 0; a < seats.length; a++) {
				char c = (char)(a + 65);
				for(int b = 0; b < seats[a].length; b++) {
					if(seats[a][b] == 0) {
						System.out.print("[□]");
					} else {
						System.out.print("[■]");
					}
				}
				System.out.println(" " + c + "열");
			}
			System.out.println("예약하실 좌석의 열을 입력해주세요.");
			char row = sc.next().charAt(0);
			System.out.println("입력한 열 : "+row);
			System.out.println("예약하실 좌석의 행을 입력해주세요.");
			int column = sc.nextInt();
			System.out.println("선택하신 좌석은 "+row+"열 "+column+"행입니다");
			System.out.println("예약 완료하시겠습니까? y/n");
			if(sc.next().charAt(0) == 'y') {
				System.out.println("예약");
				if(seats[column-1][((int)row)-65]!=1) {
				seats[(int)row-65][column-1]=1;
				System.out.println("예약 완료되었습니다.");
				}else {
					System.out.println("이미 예약이 완료된 좌석입니다. \n 다시 선택해주세요.");
				}
			}else if(sc.next().charAt(0)=='n') {
				continue;
			}
			
		}
	}
}
