package co.yedam.abstracts;

public class PrinterExample {
	public static void main(String[] args) {
		Printer printer = null; // new Printer() => 사용불가. / 추상클래스는 인스턴스를 못만든다.

		printer = new SamsungPrinter("ML6");
		printer.turnOn();
		printer.printing();
		printer.turnOff();
		System.out.println("\t");

		printer = new CanonPrinter("Epson");
		printer.turnOn();
		printer.printing();
		printer.turnOff();
		System.out.println("\t");
		
		printer = new LGPrinter("Gram");
		printer.turnOn();
		printer.printing();
		printer.turnOff();

	}
}
