package person.studentAndEmployee;

public class Person {

	private static final int MIN_AGE_FOR_PERSON_TO_WORK = 12;
	private static final int MAX_AGE_FOR_PERSON_TO_WORK = 80;
	private String name;
	private int age;
	private boolean isMale;

	public Person(String name, int age, boolean isMale) {
		setName(name);
		setAge(age);
		setIsMale(isMale);
	}

	public void showPersonInfo() {
		if (this.getName() != null && this.getAge() > 0) {
			System.out.println("This is: " + getName() + ", " + getAge() + " years old " 
					+ ", is this a man: " + isMale);
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name != null && name.trim().length() > 0) {
			this.name = name;
		} else {
			System.out.println("Invalid name.");
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > MIN_AGE_FOR_PERSON_TO_WORK && age < MAX_AGE_FOR_PERSON_TO_WORK) {
			this.age = age;
		} else {
			System.out.println("Invalid age.");
		}
	}

	public boolean isMale() {
		return isMale;
	}

	public void setIsMale(boolean isMale) {
		this.isMale = isMale;
	}

}
