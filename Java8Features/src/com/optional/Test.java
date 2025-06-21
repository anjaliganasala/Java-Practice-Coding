package com.optional;

import java.util.Optional;

public class Test {

	public static void main(String[] args) {
		
		User user = new User(10,"Anjali");
		User user2 = new User(20, null);
		
          
		Optional<String> email= user.getUserEmailById(30);     // pass id here - get value if present / no value
		
		email.ifPresentOrElse(e->System.out.println(e),
				() -> System.out.println("No value"));
		
		Optional<String> of = Optional.of("Anjali");
		System.out.println(of.get());
		

		Optional<String> of1 = Optional.of("flm");
		System.out.println(of1.get());
		
		Optional<Object> ofNullable = Optional.ofNullable(null);
		ofNullable.ifPresent(n -> System.out.println(n));
		
        Optional<String> name = Optional.of("Anjali");
        
        
        Optional<Integer> map = name
        		//.map(n -> n.length());
                .map(String::length);
        
        System.out.println(map.get());
		  
		}
}
