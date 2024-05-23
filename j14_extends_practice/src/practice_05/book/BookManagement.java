package practice_05.book;

import java.util.Scanner;

public class BookManagement {
	
	// 문자열 입력
	private Scanner scanLine = new Scanner(System.in);
	// 선택번호 입력
	private Scanner scanSelectnum = new Scanner(System.in);
	
	// 도서목록
	private static Book[] books = new Book[100];
	// 프로그램 실행 flag
	private boolean isRun = true;
	// 메인 메뉴 선택 번호
	private int selectNo = 0;
	// 도서관리 번호
	private int count = 1;	

	public BookManagement(){}
	
	public void run() {
		while(isRun) {
			System.out.println("================================================");
			System.out.println("1.도서등록 | 2. 도서목록 | 3.도서수정 | 4.도서삭제 | 5. 종료");
			System.out.println("================================================");
			selectNo = getSelectNum("번호를 선택하세요>");
			
			switch(selectNo) {
				case 1 :
					registerBook();
					break;
				case 2 :
					selectBook();
					break;
				case 3 :
					updateBook();
					break;
				case 4 : 
					deleteBook();
					break;
				case 5 : 
					terminate();
					break;	
				default : 
					System.out.println("등록된 메뉴가 아닙니다.");
			}
		}
	}
	
	// 프로그램 종료
	public void terminate() {
		this.isRun = false;
		System.out.println("프로그램 종료");
	}

	// 도서 등록
	public void  registerBook() {
		System.out.println("1. 도서등록");
		String title = getData("등록할 도서의 제목을 입력해 주세요 >");
		String author = getData("등록할 도서의 저자를 입력해 주세요 >");
		
		// Book 클래스의 객체 생성
		Book book = new Book();
		
		// 반복문을 통해 books 배열의 빈 자리를 찾아 book 에 저장해둔 값을 빈 자리에 저장
		for (int i = 0; i < books.length; i++) {
			// books 배열에 값이 null 일 경우 book 에 입력해둔 값 저장
			if (books[i] == null) {
				book.setTitle(title);
				book.setAuthor(author);
				book.setNum(count);
				books[i] = book;
				count++;		// 도서관리번호 자동 증가
				break;
			}
		}
		System.out.println("등록 완료");
		
	} // end registerBook Method
	
	// 도서 목록 출력
	public void selectBook() {
		System.out.println("2. 도서목록");
		// books 배열을 전체 순회하는 반복문
		for (Book b : books) {
			// 배열의 값이 null 이 아니라면 저장된 책의 정보를 보여줌
			if (b != null) {
				System.out.println(b.toString());
			}
		}
		
	} // end selectBook Method

	// 도서 정보 수정
	public void updateBook() {
		System.out.println("3. 도서수정");
		int bookNum = getSelectNum("수정 하실 책의 관리번호를 입력해주세요.");
		// findBook Method 가 반복문을 순회하며 입력한 bookNum과 일치하는 책의 배열을 가져옴
		Book updateBook = findBook(bookNum);
		if (updateBook == null) {
			System.err.println("입력하신 번호의 책이 존재하지 않습니다.");
			return;
		}
		// 해당 책의 정보 출력
		System.out.println(updateBook.toString());
		
		// while 문 탈출 flag
		boolean isUpdate = true;
		
		while (isUpdate) {
		System.out.println("===================================");
		System.out.println("1. 제목 수정 | 2. 저자 수정 | 3. 수정 완료");
		System.out.println("===================================");
		
		int selectNum = getSelectNum("번호 입력 >");
		
		switch (selectNum) {
			case 1 :
				System.out.println("제목 수정");
				String title = getData("제목 입력 > ");
				// findBook으로 찾아온 책의 제목을 위에서 입력한 title 로 변경
				updateBook.setTitle(title);
				System.out.println("제목 수정 완료");
				break;
			case 2 : 
				System.out.println("저자 수정");
				// findBook으로 찾아온 저자의 이름을 위에서 입력한 author 로 변경
				String author = getData("저자 입력 > ");
				updateBook.setAuthor(author);
				System.out.println("저자 수정 완료");
				break;
			case 3 :
				System.out.println("수정 완료");
				// while 문 탈출 flag
				isUpdate = false;
				break;
			default :
				System.err.println("잘못입력된 번호입니다.");
				break;
		}
		
		}
		
	} // end updateBook Method
	
	// 도서 목록에서 책 정보 삭제
	public void deleteBook() {
		System.out.println("4. 도서삭제");
		int bookNum = getSelectNum("삭제할 도서의 관리번호를 입력해주세요.");
		// findBook Method 를 통해서 찾아온 책의 정보를 book 변수에 저장
		Book book = findBook(bookNum);
		// 책의 정보가 존재하지 않는다면
		if (book == null) {
			System.err.println("일치하는 책이 존재하지 않습니다.");
		}
		
		// 해당 책을 찾기 위해 순회하는 반복문
		for (int i = 0; i < books.length; i++) {
			// 배열을 순회하며 null 값이 아니고 배열에 저장된 책의 정보와 일치할 경우 null 로 변경 (삭제)
			if (books[i] != null && books[i] == book) {
				books[i] = null;
				System.out.println("삭제 완료");
				break;
			}
		}
		
	} // end deleteBook Method
	
	// 도서관리번호로 책 정보 찾기
	public Book findBook(int num) {
		for (Book b : books) {
			if (b != null && b.getNum() == num) {
				return b;
			}
		}
		return null;
	} // end findBook Method
	
	// 사용자에게 메시지를 전달 받아 출력하고 문자열 값 받아 반환
	String getData(String message) {
		System.out.println(message);
		return scanLine.nextLine();
	}
	
	// 번호 선택 받기
	int getSelectNum(String message) {
		System.out.println(message);
		if(!scanSelectnum.hasNextInt()) {
			System.out.println("숫자를 입력해주세요.");
			scanSelectnum.next();
			return 0;
		}
		return scanSelectnum.nextInt();
	}
		
}




