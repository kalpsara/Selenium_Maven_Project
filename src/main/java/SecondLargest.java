

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;

public class SecondLargest {
	
	//find second largest number using list and set
	
	
 

	public static void main(String[] args) {
		
		//list
		Stream<Integer> s = Stream.of(156, 275, 783,783, 454, 125, 6);
		List<Integer> myList = s.collect(Collectors.toList());
		Integer secondHighest=myList.stream().sorted(Collections.reverseOrder()).distinct().limit(2).skip(1).findFirst().get();
        System.out.println(secondHighest);
        
        
        //set
    	Stream<Integer> setOfIntegers = Stream.of(156, 275, 783,783, 457,454, 125, 6,156);
        Set<Integer> mySet=setOfIntegers.collect(Collectors.toSet());
        Integer secondHighestInSet= mySet.stream().sorted(Collections.reverseOrder()).limit(2).skip(1).findFirst().get();
        System.out.println(secondHighestInSet);
		

	}

}
