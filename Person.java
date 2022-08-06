package task;

public class Person {
	enum Gender {MAN,WOMAN}
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
		switch(gender) {
			case MAN:
				System.out.println("I'm a man");
				break;
			case WOMAN:
				System.out.println("I'm a woman");
				break;
		}

	}

}
