package basic.examples;

public class Memory extends ClassLoader{
	
	public Memory(){
		super(Object.class.getClassLoader());
	}

	public static void main(String[] args) {
		
		Object obj1 = new Object();
		System.out.println(obj1.toString());
		Object obj2 = new Object();
		System.out.println(obj2.toString());
		
		NullReturn ret = ()->{return null;};
		System.out.println(ret.getValue());
		
		System.out.println(Memory.class.getClassLoader());

	}

}

interface NullReturn{
	String getValue();
}
