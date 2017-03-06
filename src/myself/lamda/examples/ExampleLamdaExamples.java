package myself.lamda.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class ExampleLamdaExamples {

	public static void main(String[] args) {
		
		List<Integer> tradeAmount = new ArrayList<Integer>();
		
		tradeAmount.add(10);
		tradeAmount.add(20);
		tradeAmount.add(30);
		tradeAmount.add(40);
		
		Trade t = (s) -> s>35;
		
		for(Integer amount:tradeAmount){
			System.out.println(t.check(amount));
		}
		
//		Using Function class
		
		Predicate<String> check = (s)->{return true;};
		System.out.println(check.test("Arindam"));
		
		Function<String,String> concatString = (s)->s.toString();

	}

}

interface Trade {
	boolean check(int amount);
}
