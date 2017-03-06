package lamda.examples;

import java.util.function.BiConsumer;

public class LamdaExceptionHandling {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4};
		int key = 0;
		
		process(arr,key,wrapperLamdaBiConsumer((a,k) -> System.out.println(a/k)));

	}
	
	public static void process(int arr[],int key,BiConsumer<Integer,Integer> biConsumer){
		for(int a:arr){
			biConsumer.accept(a, key);
		}
	}
	
	public static BiConsumer<Integer,Integer> wrapperLamdaBiConsumer(BiConsumer<Integer,Integer> biConsumer){
		return (v,k) ->{
			try{
				biConsumer.accept(v, k);
			}catch(ArithmeticException e){
				System.out.println("Some Exception Occured");
			}
			
		};
	}

}
