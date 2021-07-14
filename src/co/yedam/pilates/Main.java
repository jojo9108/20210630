package co.yedam.pilates;

public class Main {
	public static void main(String[] args) {

		pilatesApp app = pilatesApp.getInstance();
		app.main();

		pilatesApp app2 = pilatesApp.getInstance();
		app2.main();

		System.out.println(app == app2);
	}
}
