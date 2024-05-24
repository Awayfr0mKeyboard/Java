package b_default;

public class LGPrinter implements Printable {

	@Override
	public void print() {
		System.out.println("LG 프린터가 출력합니다.");
	}

	@Override
	public void threeDPrint() {
		System.out.println("LG 3d 프린트 출력 !");
	}

	
	
}
