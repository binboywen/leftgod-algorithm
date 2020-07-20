package basic_08;

public class Test {
	void printValue(int m) {
		do {
			System.out.println(m);
		}while (m-- >= 10);
	}

	public static void main(String[] args) {
		int i = 10;
		Test t = new Test();
		t.printValue(i);
	}
}