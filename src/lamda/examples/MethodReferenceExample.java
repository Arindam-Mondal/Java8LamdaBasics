package lamda.examples;

public class MethodReferenceExample {
	
	public static void main(String args[]){
		Thread t = new Thread(()->printmessage());
		t.start();
	}
	
	static void printmessage(){
		System.out.println("Hello MethodReferenceExample");
	}

}
