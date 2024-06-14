package t4_state_control.notify_wait;

public class DataBox {

	private String data;
	
	public synchronized String getData() {
		
		if (this.data == null) {
			// 소비할 data 가 저장되어 있지 않으면 소비 스레드 일시 정지
			try {
				// getData()를 호출한 thread 를 일시 정지 상태로 지정
				wait();
			} catch (InterruptedException e) {}
		}
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
		
		String value = this.data;
		this.data = null;
		System.out.println("읽은 데이터 : " + value);
		notify();
		return value;
	}
	
	public synchronized void setData(String data) {
		// 아직 dataBox에 data 가 소비되지 않았으면 기존 데이터 유지
		if (this.data != null) {
			// data 가 소비되지 않았을 때는 일시정지 상태로 변환
			try {
				wait();
			} catch (InterruptedException e) {}
		}
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
		
		this.data = data;
		System.out.println("생성한 데이터 : " + data);
		// wait() 상태의 스레드를 실행 대기 상태로 변경
		notify();
	}
	
}
