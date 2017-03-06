package myself.lamda.examples;

public class TestClass {

	public static void main(String[] args) {
		Integer a = 10;
		Integer b = 20;
		Object objA = a;
		Object objB = b;
		System.out.println(Integer.valueOf(objA.toString())+Integer.valueOf(objB.toString()));

	}

}
