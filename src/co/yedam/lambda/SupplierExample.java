package co.yedam.lambda;

import java.util.Random;
import java.util.function.DoubleSupplier;
import java.util.function.LongSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

// java.util.function 밑에 있는 인터페이스 Supplier
public class SupplierExample { // 매개값은 없음, 반환값은 있음.
	public static void main(String[] args) {
		Supplier<String> sup = new Supplier<String>() {
			@Override
			public String get() {
				return "Hello world";
			}
		};
		System.out.println(sup.get());

		IntSupplier intSup = () -> {
			return new Random().nextInt(40);
		};
		System.out.println(intSup.getAsInt());

		DoubleSupplier dusp = null;
	}
}