package co.yedam.api;

public class Key {
	
	@Override
	public int hashCode() {
		return number;
	}

	public int number;

	public Key(int number) {
		this.number = number;

	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Key) {
			Key compareKey = (Key) obj;
			if (this.number == compareKey.number) {
				return true;
			}

		}
		return false;
	}
}