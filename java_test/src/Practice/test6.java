package Practice;

import java.util.Scanner;

public class test6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] seats = new int[10][10];
		
		while (true) {
		for (int i = 0; i < seats.length; i++) {
			for (int j = 0; j < seats.length; j++) {
				System.out.print("[" + (char)(seats[i][j] = '□') + "]");
			}
			System.out.println();
		}
		System.out.println("예약하실 좌석의 열을 입력해주세요.");
		char col = sc.next().charAt(0);
		System.out.println("입력한 열 : " + col);
		System.out.println("예약하실 좌석의 행 번호를 입력해주세요 > ");
		int row = sc.nextInt();
		System.out.println("선택하신 좌석은 : " + col + "열" + row + "행 입니다.");
		System.out.println("예약 완료 하시겠습니까? y/n");
		char answer = sc.next().charAt(0);
		
		} // while end
		
	} // main end
	
} // class end
