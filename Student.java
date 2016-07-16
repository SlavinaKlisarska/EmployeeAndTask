package person.studentAndEmployee;

public class Student extends Person {
	double score;

	Student(String name, int age, boolean isMale, double score) {
		super(name, age, true);
		setScore(score);
	}

	@Override
	public void showPersonInfo() {
		super.showPersonInfo();
		System.out.println("Also this person is a student and has score: " + getScore());
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		if (score >= 2 && score <= 6) {
			this.score = score;
		} else {
			System.out.println("Invalid score.Score must be between 2 and 6");
		}
	}
}
