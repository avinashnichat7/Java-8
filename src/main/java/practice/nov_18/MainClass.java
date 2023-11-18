package practice.nov_18;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class MainClass{
    public static void main(String[] args) {

        List<Person> list = new ArrayList<>();


        list.add(new Person(1, "Amit", 25));
        list.add(new Person(1, "Suresh", 29));
        list.add(new Person(1, "John", 27));
        list.add(new Person(1, "Patrick", 25));
        list.add(new Person(1, "Amir", 26));
        list.add(new Person(1, "Ramesh", 26));
        list.add(new Person(1, "Vijay", 27));
        list.add(new Person(1, "Javed", 25));
        list.add(new Person(1, "Anil", 26));
        list.add(new Person(1, "Balaji", 25));



        Map<Integer, List<Person>> collect = list.stream()
                .collect(Collectors.groupingBy(Person::getAge, Collectors.toList()));

        System.out.println(collect);

    }

/*
    Expected Output :		 
    Age 25 = [{"Amit", 25}, {"Patrick", 25}, {"Javed", 25}, {"Balaji", 25}]
    Age 26 = [{"Amir", 26}, {"Ramesh", 26}, {"Anil", 26}]
    Age 27 = [{"John", 27}, {"Vijay", 27}]
    Age 29 = [{"Suresh", 29}]
*/

}
