import java.util.List;
import java.util.ArrayList;

import java.util.Stream;

public class StreamOperation{
    public static void main(String[] args){
        List<String> nameList  = new ArrayList<String>();
        nameList.add("James Bande");
        nameList.add("Jack");
        nameList.add("Jack");//add two same elements 
        nameList.add("Rose");
        nameList.add("Obama");
        nameList.add("Tanbu");
        Stream<String> stream = nameList.stream();
        // distinct elements
        nameList = stream.distinct().collect(toList());
        nameList.forEach(name->{
            System.out.println("-----------the element is"+name);
        });
    }
}