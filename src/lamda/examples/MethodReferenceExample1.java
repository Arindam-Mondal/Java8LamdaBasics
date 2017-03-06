package lamda.examples;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class MethodReferenceExample1 {

	public static void main(String[] args) {
		
		List<Person> personList = Arrays.asList(
				new Person("Arindam","Mondal",25),
				new Person("Arnab","Kolay",26),
				new Person("Rajdeep","Bhatia",22),
				new Person("Dipanjan","Das",28),
				new Person("Dipanjan","chanda",28)
				);
		
		long start = System.currentTimeMillis();
		
		for(int i=0;i<personList.size();i++){
			System.out.println(personList.get(i));
		}
		
		System.out.println();
		
		for(Person p:personList){
			System.out.println(p);
		}
		
		System.out.println();
		
		personList.forEach((p)->System.out.println(p));
		
		System.out.println();
		
		ListIterator<Person> itr = personList.listIterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		System.out.println();
		
		personList.forEach(System.out::println);
		
		long end = System.currentTimeMillis();
		
		System.out.println((end-start));

	}

}
