package person.studentAndEmployee;

public class Demo {
	public static void main(String[] args) {

		Person gosho = new Person("Georgi Dimitrov", 26, true);
		Person qna = new Person("Qna Petrova", 31, false);
		Student petko = new Student("Petko Petrov", 15, true, 5.0);
		Student petrana = new Student("Petrana Georgieva", 14, false, 4.50);
		Employee angel = new Employee("Angel Todorov", 20, true, 60);
		Employee svetlana = new Employee("Svetlana Lazarova", 31, false, 100.20f);

		Person[] people = { gosho, qna, petko, petrana, angel, svetlana, null, null, null, null };

		for (int i = 0; i < people.length; i++) {
			if (people[i] != null) {
				people[i].showPersonInfo();
				System.out.println();
			}
		}

		for (Person person : people) {
			if (person != null) {
				if (person instanceof Employee) {
					Employee currEmployee = (Employee) person;
					System.out.println("Sum to pay for overtime working to " + currEmployee.getName() + ": "
							+ currEmployee.calculateOvertime(2));
				}
			}
		}

		/*
		 * K���� �� ����� ��� ���������� ����������� ��� ��������� Student() �
		 * ����� Student ??? �������� �� �, � ��� �� ����. ��� ���� �� �� ������
		 * ����?
		 * 
		 * ������������ �� ���� ������, �� ����� �� ������� ���� ���� ��������
		 * super(name, age, isMale) �� ������ ��� � ������������ � �������
		 * ��������� �� �����������. ���� ������� � �� ���������� �����������
		 * ��� ��������� � ����������� ����, ���� ������������ �� �����������
		 * ��� ��������� � ����� ��������� �� � ������������.
		 * 
		 */

	}

}
