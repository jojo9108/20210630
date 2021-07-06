package co.yedam.abstracts;

public class LGPrinter extends Printer {

	public LGPrinter(String modelName) {
		super(modelName);
	}

	@Override
	public void printing() {
		System.out.println("LG프린터를 출력합니다.");
	}

}
