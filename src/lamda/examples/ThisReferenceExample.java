package lamda.examples;

public class ThisReferenceExample {
	
	void checkThis(Process p){
		p.process(10);
	}
	
	void checkIfThis(){
		checkThis(i->System.out.println(this));
	}

	public static void main(String[] args) {
		ThisReferenceExample thisReferenceExample = new ThisReferenceExample();
		thisReferenceExample.checkThis(i->System.out.println("hello"));
		thisReferenceExample.checkIfThis();
	}
	
	public String toString(){
		return "This is the main ThisReferenceExample Class";
	}

}
