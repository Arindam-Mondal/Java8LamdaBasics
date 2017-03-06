package lamda.examples;

public class Greeting {
	
	public static void main(String args[]){
		
		MyAdd addFunction = (int a,int b)-> a+b;
	}

}

interface MyAdd{
	int addFunc1(int a,int b);
	//int addFunc2(int a,int b);
}
