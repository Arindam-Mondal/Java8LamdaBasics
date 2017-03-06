package myself.lamda.examples;

public class Animal {

	public static void main(String[] args) {
		
		AnimalInterface tiger = ()->System.out.println("Tiger"); 
		tiger.displayName();
		AnimalInterface deer = ()->{System.out.println("Deer");}; 
		deer.displayName();
		
		AnimalInterface genericMsg = Animal::display;
		genericMsg.displayName();

	}
	
	public static void display(){
		System.out.println("Hello! Good Morning!!");
	}

}
@FunctionalInterface
interface AnimalInterface {
	void displayName();
}
