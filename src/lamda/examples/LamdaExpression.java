package lamda.examples;

//Type inference
public class LamdaExpression {
	
	public static void main(String args[]){
		
//		GetLength getLength = s -> s.length();
//		System.out.println(getLength.getLength("Hello World"));
		StringLengthLamda(s->s.length(), "Hello lamda!");
		
	}
	
	public static void StringLengthLamda(GetLength l,String s){
		System.out.println(l.getLength(s));
	}

}

//It is an optional but recommendable annotation since it signifies
//that the interface ia a functional interface and to be used for
//lamda expression.

@FunctionalInterface    
interface GetLength{
	int getLength(String s);
}
