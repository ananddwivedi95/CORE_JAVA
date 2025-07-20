package com.anand;


import java.util.*;
import java.util.stream.Stream;

public class StreamOperations {

	public static void main(String[] args) {
		
       List<String> list= new ArrayList<>();
       
       list.add("one");
       list.add("two");
       list.add("three");
       list.add("four");
       list.add("five");
       list.add("six");
       
       Stream<String> stream = list.stream();
       
       //stream pipelining 
      List<String> toUpper= stream.map(s -> s.toUpperCase()).toList();
      System.out.println(toUpper);
      
      
                             //making new stream object below 
      List<String> toLower=  list.stream()                    //making new stream object
    		                 .filter(s -> s.startsWith("f"))  //intermediate operation 
                             .map(s -> s.toLowerCase())       //intermediate operation 
                             .toList();                       //terminal operation 
      System.out.println(toLower);
      
      
      
      List<Integer> listLength= list.stream()          // new stream object 
    		                   .map(s -> s.length())  //intermediate operation 
    		                   .toList();  
      //terminal operation 
      System.out.println(listLength);
      
      list.stream()                         //making stream object 
      .map(s -> s.toUpperCase())            //intermediate operation 
      .forEach(System.out::println);        //terminal operation 
      
      
      List<String> limitedNumber=list.stream()
    		                    .limit(4)
    		                    .toList();
 
      System.out.println(limitedNumber);
      
      List<String> exceptFirst3=list.stream()
    		                    .skip(4)
    		                    .toList();
      
      System.out.println(exceptFirst3);
      
    
      //anyMatch() method is return the false if any of the match with the condition then it return true other wise false 
      Boolean matchedList=list.stream()
    		              .anyMatch(s -> s.matches("one"));
      
      System.out.println(matchedList);
      
     //allMatch() is the method which is check for all if any will not match to condition satisfied then it will give false
     Boolean matchedResult= list.stream()
    		                .allMatch(s -> s.matches("one"));
     
     System.out.println(matchedResult);
     
     //findAny() is method used to find the value from out of all value
     String find= list.stream()
    		      .findAny()
    		      .get();
     
     System.out.println(find);
     
     //findFirst() is method used to find the value from first 
     String findFirst=list.stream()
    		          .findFirst()
    		          .get();
     
     System.out.println(findFirst);
     
     
     //sorted() is the method use to sort the element of the collections
     List<Integer> sortedList=list.stream()
    		                 .map(s -> s.length())
    		                 .sorted()
    		                 .toList();
     
     System.out.println(sortedList);
     
     //average() is the method which is used to calculate the average of the element 
     Double resultAvg= list.stream()
    		           .mapToDouble(s ->s.length())
    		           .average()
    		           .getAsDouble();
    
    System.out.println(resultAvg);
    
    
	}
}
