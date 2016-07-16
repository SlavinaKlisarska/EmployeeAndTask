package person.studentAndEmployee;

public class Employee extends Person {

	private static final int NO_MONEY = 0;
	private static final int MIN_LEGAL_AGE_TO_RECEIVE_SALARY = 18;
	private static final double COEFFICIENT_FOR_OVERTIME_WORKING = 1.5;
	private static final int WORKING_HOURS_PER_DAY = 8;
	private float daySalary;

	public Employee(String name, int age, boolean isMale, float salary) {
		super(name, age, isMale);
		setDaySalary(salary);
	}

	double calculateOvertime(double hoursOvertime) {
		return COEFFICIENT_FOR_OVERTIME_WORKING * (this.getDaySalary() / WORKING_HOURS_PER_DAY);
	}

	@Override
	public void showPersonInfo() {
		super.showPersonInfo();
		System.out.println(this.getName() + " is an employee and has day salary: " + daySalary);
	}

	public float getDaySalary() {
		return daySalary;
	}

	public void setDaySalary(float daySalary) {
		if (daySalary > 0) {
			if (getAge() < MIN_LEGAL_AGE_TO_RECEIVE_SALARY) {
				this.daySalary = NO_MONEY;
			} else {
				this.daySalary = daySalary;
			}
		} else {
			System.out.println("Give more money.");
		}
	}
}
