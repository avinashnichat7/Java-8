package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {

		List<Employee> list = new ArrayList<>();

		list.add(new Employee(1, "Avinash", "b+", "ngp", 26, 5000, "Java"));
		list.add(new Employee(1, "Ramesh", "o+", "ngp", 26, 6000, "DevOps"));
		list.add(new Employee(1, "Chetan", "b+", "goa", 26, 2000, "JS"));
		list.add(new Employee(1, "Kailas", "A+", "pune", 26, 1400, "Java"));
		System.err.println("*********Groupingby*********");
		Map<String, List<Employee>> collect = list.stream().collect(Collectors.groupingBy(Employee::getBloodGroup));

		collect.entrySet().forEach(s -> System.out.println(s));

		System.err.println("*********Groupingby Counting*********");
		Map<String, Long> deptByCounting = list.stream()
				.collect(Collectors.groupingBy(Employee::getDept, Collectors.counting()));

		deptByCounting.entrySet().forEach(s -> System.out.println(s));

		System.err.println("*********GroupingbyDept*********");

		Map<String, Long> groupbyDept = list.stream()
				.collect(Collectors.groupingBy(Employee::getDept, Collectors.counting()));

		for (Map.Entry<String, Long> entry : groupbyDept.entrySet()) {
			System.out.println("Dept " + entry.getKey() + "=" + entry.getValue());

		}

		System.err.println("*********GroupingbyDept and their name*********");

		Map<String, List<String>> groupingbyDeptAndName = list.stream().collect(
				Collectors.groupingBy(Employee::getDept, Collectors.mapping(Employee::getName, Collectors.toList())));
		groupingbyDeptAndName.forEach((dept, name) -> System.out.println(dept + "=" + name));

		System.err.println("***name of the employee who has b+ group");

		Map<String, List<String>> bloodGroupByName = list.stream().collect(Collectors
				.groupingBy(Employee::getBloodGroup, Collectors.mapping(Employee::getName, Collectors.toList())));

		bloodGroupByName.forEach((name, bloodGroup) -> System.out.println(name + ":" + bloodGroup));
	
		Map<String, Long> bloodGroupByCount = list.stream().collect(Collectors.groupingBy(Employee::getBloodGroup, Collectors.counting()));
		bloodGroupByCount.forEach((bloodGroup, count)->System.out.println(bloodGroup + ":" + count));
		
	}
}
