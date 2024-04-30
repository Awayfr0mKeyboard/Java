package array;

import java.util.Scanner;

public class StudentExample {

	public static void main(String[] args) {
		System.out.println("Main START");
		
		Scanner sc = new Scanner(System.in);
		
		// 프로그램 종료 flag
		boolean isRun = true;
		// 학생들의 점수를 저장할 배열(공간)
		int[] scores = null;
		int sum = 0;
		int high = 0;
		int low = 0;
		
		while (isRun) {
			System.out.println("====================================");
			System.out.println("1.학생수|2.점수입력|3.전체점수|4.분석|5.종료");
			System.out.println("====================================");
			System.out.println("선택하실 기능의 번호를 입력하세요 > ");
			int selectNo = sc.nextInt();    // int 타입의 값을 입력받아 전달
			System.out.println("선택하신 번호는 " + selectNo + "번 입니다.");
			/*
			 	1. 학생 수
			 	   점수를 입력할 학생 수를 입력 받음.
			 	   입력받은 학생 수(정수값)만큼 배열을 생성하여 scores에 저장
			 	
			 	2. 1번에서 생성된 학생 수 만큼(배열의 크기 만큼) 학생의 점수를 입력받아
			 	   scores 배열의 각 항목에 저장 (0 ~ scores.length -1)
			 	   
			 	3. scores 배열에 저장된 각 학생의 점수(배열 항목)를 출력
			 	
			 	4. 분석 - scores 배열에 저장된 학생의 점수를 계산하여
			 	         전체 총점, 평균 점수, 최고 점수, 최저 점수를 출력
			 	         
			 	5. while문을 종료하여 프로그램 종료
			 */
			
			if (selectNo != 1 && selectNo != 5 && scores == null) {
				System.out.println("학생 수를 먼저 입력해 주세요.");
				// continue;
				selectNo = 1;
			}
			
			// switch문을 통해서 사용자가 입력한 메뉴 번호 비교
			switch(selectNo) {
				case 1 :
					/*
					 	
					 */
					System.out.println("학생 수를 입력해 주세요.");
					int studentCount = sc.nextInt();
					// 입력받은 학생 수 만큼 배열 생성해서 studentCount에 저장
					scores = new int[studentCount];
					System.out.println("등록된 학생 수는 : " + scores.length);
					break;    // 1번 기능 종료 시 switch 문 탈출
				case 2 :
					// 배열의 항목 크기만큼 학생들의 점수를 입력받아 저장
					System.out.println("저장할 학생 점수 입력");
					for (int i = 0; i < scores.length; i++) {
						System.out.println((i + 1) + "번 째 학생 점수 입력");
						// 입력받은 학생의 점수를 scores 배열의 각 항목에 저장
						scores[i] = sc.nextInt();
					}
					System.out.println("점수 입력 완료!");
					break;
				case 3 :
					System.out.println("학생들의 점수 출력");
					for (int i : scores) {
						System.out.print(i + " ");
					}
					System.out.println();
					break;
				case 4 :
					System.out.println("점수 입력");
					// 전체 총점, 평균, 최고, 최저
					int total = 0;  // 총점
					double avg = 0; // 평균
					int max = 0, min = 0;   // 최고, 최저 점수
					max = min = scores[0];
					
					for(int i : scores) {
						// scores 배열에 저장된 모든 항목의 값을 total
						// 변수에 누적해서 저장
						total += i;
						if (i > max) {
							max = i;
						}
						
						if (i < min) {
							min = i;
						}
					}
					
					avg = (double)total / scores.length;
					
					System.out.println("총점 : " + total);
					System.out.println("평균 : " + avg);
					System.out.println("최고 : " + max);
					System.out.println("최저 : " + min);
					break;
				case 5 :
					isRun = false;
					System.out.println("프로그램을 종료합니다.");
					break;
				default :
					System.out.println("없는 메뉴 입니다.");
			} // switch end
			
			
			
			/*
			switch (selectNo) {
				case 1 :    // 학생 수
					System.out.println("학생수를 입력해주세오 >");
					int num = sc.nextInt();
					scores = new int[num];
					break;
				case 2 :     // 점수 입력
					for (int i = 0; i < scores.length; i++ ) {
						scores[i] = sc.nextInt();
					}
					break;
				case 3 :     // 전체 점수
					int j = sc.nextInt();
					System.out.println(j + "번 째 학생의 점수는 " + scores[i] + "입니다.");
					break;
				case 4 :     // 분석
					for (i = 0; i < student.length; i++) {
						sum += student[i];
					}
					System.out.println("총점은 " + sum + "입니다.");
					System.out.println("평균은 " + (sum / i) + "입니다.");
					
					if ()
					break;
				case 5 :     // 종료
					break;
				default :
			}
			*/
		} // while end
		
		System.out.println("Main END");
	} // main end
	
} // class end
