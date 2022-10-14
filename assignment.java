package firstassignment;

public class assignment {

	public static void main(String[] args) {

		assignment obj = new assignment();
		obj.problem1();
		obj.problem2();
		obj.problem3();
		obj.problem4();
		obj.problem5();
		obj.problem6();
		obj.problem7();
		obj.problem8();
		obj.problem9();
		obj.problem10();

	}

	public void problem1(){
		System.out.println("Assignment Q 1");
		int a = 100;
		int b = 20;
		int t;
		System.out.println("Before swaping a=" + a + " and " + "b=" + b);
		t = a;
		a = b;
		b = t;
		System.out.println("after swaping a=" + a + " and " + "b=" + b);
		System.out.println("****************************************************************************************");
	}

	public void problem2() {
		System.out.println("Assignment Q 2");
		int a = 10;
		double b=90.78;
		int c = 111;
		int d = 8989;
		int e = 7876;
		

		System.out.println("sum of the given numbers=" + (a+b+c+d+e));
		System.out.println("****************************************************************************************");

	}

	public void problem3() {
		System.out.println("Assignment Q 3");
		int a = 10;
		double b=90.78;
		int c = 111;
		int d = 8989;
		int e = 7876;
		
		System.out.println("average of the given numbers=" +(a+b+c+d+e)/5 );
		System.out.println("****************************************************************************************");

	}

	public void problem4() {
		System.out.println("Assignment Q 4");
		for (int i = 0; i <= 200; i = i + 2) {
			System.out.println(i);
		}
		System.out.println("****************************************************************************************");
	}

	public void problem5() {
		System.out.println("Assignment Q 5");
		for (int i = 1; i <= 50; i = i + 2) {
			System.out.println(i);
		}
		System.out.println("****************************************************************************************");

	}

	public void problem6() {
		System.out.println("Assignment Q 6");
		int n = 1000;
		for (int i = 2; i <= n; i++) {
			int count = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 0) {
				System.out.println(i + "");

			}
		}
		System.out.println("****************************************************************************************");
	}

	public void problem7() {
		System.out.println("Assignment Q 7");

		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("****************************************************************************************");

	}

	public void problem8() {
		System.out.println("(Assignment Q 8");
		int[] marks = { 78, 12,89,55,35 };
		if (marks[0] > 80) {
			System.out.println(marks[0]);
		} 
		if (marks[1] > 80) {
			System.out.println(marks[1]);
		}
		if (marks[2] > 80) {
			System.out.println(marks[2]);
		}
		if (marks[3] > 80) {
			System.out.println(marks[3]);
		} 
		if (marks[4] > 80) {
			System.out.println(marks[4]);
		}
		System.out.println("****************************************************************************************");
	}

	public void problem9() {
		System.out.println("Assignment Q 9");
		int mark = 85;

		switch (mark) {
		case 12:
			System.out.println("12");
			break;
		case 34:
			System.out.println("34");
			break;
		case 66:
			System.out.println("66");
			break;
		case 85:
			System.out.println("85");
			break;
		case 900:
			System.out.println("900");
			break;

		}
		System.out.println("****************************************************************************************");
	}

	public void problem10() {
		System.out.println("Assignment Q 10");
		String input = "selenium";
		switch (input) {
		case "java":
			System.out.println("java");
			break;
		case "JavaScript":
			System.out.println("JavaScript");
			break;
		case "selenium":
			System.out.println("Selenium");
			break;
		case "Python":
			System.out.println("Python");
			break;
		case "Mukesh":
			System.out.println("Mukesh");
			break;

		}
		System.out.println("****************************************************************************************");
	}

}
