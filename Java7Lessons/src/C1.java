class MyExc1 extends Exception {
	MyExc1() {
		System.out.println("Hello EX1 Contructor");
	}
}

class MyExc2 extends Exception {
	MyExc2() {
		System.out.println("Hello EX2 Contructor");
	}
}

class MyExc3 extends MyExc2 {
	MyExc3() {
		System.out.println("Hello EX2 Contructor");
	}
}

public class C1 {
	public static void main(String[] args) throws Exception {
		try {
			
			System.out.println(1);
			q();
		} catch (Exception i) {
			throw new MyExc2();
		} finally {
			System.out.println(2);
			throw new MyExc1();
		}
	}

	static void q() throws Exception {
		try {
			throw new MyExc1();
		} catch (Exception y) {
		} finally {
			System.out.println(3);
			throw new Exception();
		}
	}
}