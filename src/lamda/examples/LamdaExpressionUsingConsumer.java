package lamda.examples;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LamdaExpressionUsingConsumer {
	
	public static void main(String[] args) {
		List<Person> personList = Arrays.asList(
				new Person("Arindam","Mondal",25),
				new Person("Arnab","Kolay",26),
				new Person("Rajdeep","Bhatia",22),
				new Person("Dipanjan","Das",28),
				new Person("Dipanjan","chanda",28)
				);
		
		System.out.println("Before Sorting");
		
		performConditionally(personList, p->true,p->System.out.println(p));
		
//		Step 1: Sort list by last name
		
		Collections.sort(personList,(p1,p2)->p1.getLastName().compareTo(p2.getLastName()));
		
//		step 2: Create a method that prints all the elements in the list
		
		System.out.println("After Sorting");
		performConditionally(personList, p->true,p->System.out.println(p.getLastName()));
		
//		step 3: Create a method that prints all people that have last name beginning with C
		
		System.out.println("Prints all the person having Last Name begining with C");
		
		performConditionally(personList,p->p.getLastName().toUpperCase().startsWith("C"),p->System.out.println(p.getFirstName()+"-"+p.getAge()));
	}
	
	public static void performConditionally(List<Person> personList, Predicate<Person> predicate, Consumer<Person> consumer){
		for(Person person: personList){
			if(predicate.test(person)){
				consumer.accept(person);
			}
		}
	}

}
