package task;

public class Person {
	enum Gender {
		MAN("man"), WOMAN("woman");

		private final String value;

		private Gender(String value) {
			this.value = value;
		}

		public String getValue() {
			return this.value;
		}
	}

	private Gender gender;

	public Person(Gender gender) {
		this.gender = gender;
	}

	public static void main(String[] args) {
		Person man = new Person(Gender.MAN);
		Person woman = new Person(Gender.WOMAN);
		man.speak();
		woman.speak();
	}

	public void speak() {
		System.out.println("I'm a " + this.gender.getValue());
	}
}
