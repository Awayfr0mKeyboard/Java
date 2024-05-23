package practice_07.member;

import java.util.Scanner;

public class MemberManagement{
	
	// 사용자 입력
	private Scanner sc = new Scanner(System.in);
	
	// 회원정보 저장
	private Member[] members = new Member[100];
	
	// 관리자 계정
	private Member master = new Member(100,"master","root","root");
	
	// 로그인한 회원
	private Member loginMember = null;
	
	// 프로그램 flag (true : 진행 , false : 종료) 
	private boolean isRun = true;
	
	// 메뉴 번호 선택
	private int selectNo;
	
	// 프로그램 실행용 생성자
	public MemberManagement() {
		// 관리자 계정을 99인덱스에 저장
		members[members.length - 1] = master;
	}

	public void isRun() {
		System.out.println("프로그램 시작!");
		while (isRun) {
			System.out.println("===========================================================");
			System.out.println("1.회원가입 |2.로그인 |3.회원목록|4.회원정보수정|5.회원탈퇴|6.프로그램종료");
			System.out.println("===========================================================");
			System.out.println("메뉴 선택 > ");
			
			if(!sc.hasNextInt()){
				System.out.println("번호를 입력해주세요. ");
				sc.next();
				continue;
			}

			selectNo = sc.nextInt();
			switch (selectNo) {
				case 1:
					System.out.println("== 회원가입 == ");
					join();
					break;
				case 2:
					System.out.println("== 로그인 == ");
					login();
					break;
				case 3:
					System.out.println("== 회원목록 == ");
					select();
					break;
				case 4:
					System.out.println("== 회원정보수정 == ");
					update();
					break;
				case 5:
					System.out.println("== 회원탈퇴 == ");
					delete();
					break;
				case 6:
					System.out.println("== 종료 == ");
					terminate();
					break;
				default:
					System.out.println("선택할 수 없는 번호입니다.");
			}
		}
	}

	
	private void terminate() {
		isRun = false;
	}

	private void join() {
		System.out.println("아이디를 입력해주세요");
		String mId = sc.next();
		System.out.println("비밀번호를 입력해주세요");
		String mPw = sc.next();
		System.out.println("비밀번호를 한번 더 입력해주세요");
		String rePw = sc.next();
		// 중복된 아이디 또는 비밀번호 불일치 확인
		if (!mPw.equals(rePw) || memberIdCheck(mId)) {
			System.err.println("이미 사용 중이거나 비밀번호가 일치하지 않습니다.");
			return;
		}
		
		System.out.println("이름을 입력해주세요");
		String name = sc.next();
		
		// 배열에 저장할 객체 생성
		Member m = new Member();
		// 빈 배열을 찾아 객체를 저장하는 반복문
		for (int i = 0; i < members.length; i++) {
			if (members[i] == null) {
				m.setNum(i+1);
				m.setName(name);
				m.setId(mId);
				m.setPw(rePw);
				members[i] = m;
				break;
			}
		}
		System.out.println("회원가입 완료");
		
	} // end join method

	private void login() {
		System.out.println("아이디를 입력해주세요 > ");
		String mId = sc.next();
		System.out.println("비밀번호를 입력해주세요 >");
		String mPw = sc.next();
		
		// 아이디와 비밀번호를 저장하는 checkMember
		Member checkMember = new Member(mId, mPw);
		// findMember method 에 매개변수로 checkMember 를 넣어 일치하는지 확인 후
		// 그 값을 acceptMember 에 저장
		Member acceptMember = findMember(checkMember);
		
		// NullPointerException 거르기
		if (acceptMember == null) {
			System.out.println("일치하는 멤버가 없습니다.");
			return;
		}
		
		// 관리자 로그인
		if (acceptMember == master) {
			System.out.println("정상적으로 로그인 되었습니다.");
			System.out.println(master.toString());
			System.out.println("관리자 계정입니다.");
			loginMember = master;
		}
		
		// 일반 회원 로그인
		loginMember = acceptMember;
		if (acceptMember != master) {
			System.out.println("정상적으로 로그인 되었습니다.");
			System.out.println(loginMember.toString());
		}
		
	} // end login method

	private void select() {
		// 관리자일 경우에만 회원 목록 확인
		if (loginMember == master) {
			for (Member m : members) {
				if (m != null) {					
					System.out.println(m.toString());
				}
			}
		} else {
			// 개인 회원은 확인 할 수 없음
			System.out.println("회원 목록 > ");
			System.out.println("관리자만 확인 가능한 메뉴입니다.");
			return;
		}
		
	} // end select method
	
	private void update() {
		// 개인회원 - 자기정보(이름) 만 수정 가능
		// 관리자 - 전체 회원 정보(이름) 수정 가능
		
		// 로그인을 하지 않는다면 사용할 수 없게 막기
		if (loginMember == null) {
			System.err.println("로그인 후 사용가능 한 메뉴입니다.");
			return;
		}
		
		// 관리자로 로그인했다면 회원 목록 및 회원 번호로 회원 이름 수정
		if (loginMember == master) {
			System.out.println("== 관리자 회원정보 수정");
			select();
			System.out.println("수정할 회원 번호를 입력해 주세요.");
			int mNum = sc.nextInt();
			
			for (Member m : members) {
				if (m != null && m.getNum() == mNum) {
					System.out.println("수정할 회원의 이름을 입력해 주세요 > ");
					String name = sc.next();
					m.setName(name);
					System.err.println("수정 완료");
					break;
				}
			}
			// 일반 회원 정보 수정
		} else {
			System.out.println("내 정보 수정 ------");
			System.out.println("비밀번호를 한 번 더 입력해주세요 > ");
			String rePw = sc.next();
			// 입력한 비밀번호와 로그인 시 비밀번호가 일치하지 않는다면 진행 불가
			if (!loginMember.getPw().equals(rePw)) {
				System.out.println("일치하지 않는 비밀번호입니다.");
				return;
			}
			System.out.println("수정할 이름을 입력해주세요 > ");
			String name = sc.next();
			loginMember.setName(name);
		}
	} // end update method
	

	private void delete() {
		// 로그인 계정이 관리자 계정일 경우
		if (loginMember == master) {
			System.out.println("회원 탈퇴 > ");
			System.out.println("master 계정은 삭제할 수 없습니다.");
			return;
		} else {
			// 일반 회원일 경우 
			System.out.println("회원 탈퇴 > ");
			System.out.println("정말로 탈퇴하시겠습니까? y/n ");
			
			String input = sc.next();
			
			switch (input) {
			case "y" : case "Y" : case "ㅛ" :
				deleteMember();
				break;
			case "n" : case "N" : case "ㅜ" :
				System.out.println("취소합니다.");
				break;
			}
		}
		
	} // end delete method
	
	// 회원 정보 삭제
	private void deleteMember() {
		for(int i=0; i<members.length; i++) {
			if(members[i].equals(loginMember)) {
				members[i] = null;
				loginMember = null;
				System.out.println("회원탈퇴 완료");
				return;
			}
		}
	}
	
	// 사용자 아이디 중복 체크
	private boolean memberIdCheck(String mId) {
		for (Member m : members) {
			if (m != null && m.getId().equals(mId)) {
				return true;				
			}
		}
		return false;
	}
	
	
	// 회원 아이디와 비밀번호로 회원 찾기
	private Member findMember(Member m) {
		for(Member member : members) {
			if(member != null && member.equals(m)) {
				return member;
			}
		}
		return null;
	}
}
