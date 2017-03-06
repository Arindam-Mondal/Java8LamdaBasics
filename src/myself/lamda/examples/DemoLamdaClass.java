package myself.lamda.examples;

public class DemoLamdaClass {
	
	public static void main(String args[]){
		
		LamdaInterface message = ()->System.out.println("Addition");
		message.show();
		Integer a = 10;
		Integer b = 20;
		LamdaCalcInterface addInteger = (k,z)->{
			try{
				System.out.println(Integer.valueOf(k.toString())+Integer.valueOf(z.toString()));
			}catch(Exception e){
				throw e;
			}
		};
			
		addInteger.compute(a, b);
		
		LamdaCalcInterface addDouble = (k,z)->{
			System.out.println(Double.valueOf(k.toString())+Double.valueOf(z.toString()));};
			addDouble.compute(a, b);
		
		
		/*message = ()->System.out.println("Substract");
		message.show();
		
		LamdaCalcInterface sub = (k,z)->System.out.println(k-z);
		sub.compute(a, b);*/
		
//		GenericInterface gi = (j)->System.out.println(j.getClass());
//		gi.consumer(new Integer("10"));
			
		GenericInterface<String> gi = new GenericInterfaceImpl<String>();
		gi.consumer();
		
	}
}

interface LamdaInterface {
	public void show();
}

interface LamdaCalcInterface {
	public void compute(Object a,Object b);
}
interface GenericInterface<T> {
	void consumer();
}

class GenericInterfaceImpl<T> implements GenericInterface<T> {
	
	T t;
	@Override
	public void consumer() {
		
		System.out.println(this.t.getClass());
	}
	
}