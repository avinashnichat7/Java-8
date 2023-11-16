package api.employee.employee_1;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Employee> list = EmployeeData.employeeDetails();


//        Map<String, Long> deptByGroup = list.stream()
//                .collect(Collectors.groupingBy(Employee::getDept, Collectors.counting()));
//
//        System.out.println("deptByGroup" + deptByGroup);
//
//        list.stream()
//                .collect(Collectors.groupingBy(Employee::getDept, Collectors.toList()))
//                .forEach((k, v) -> System.out.println("dept by Name " + k + " : " + v));

//        System.out.println("DeptByEmployeeList");
//
//        list.stream()
//                .collect(Collectors.groupingBy(Employee::getDept, Collectors.toList()))
//                .forEach((k, v) -> System.out.println(k + " : " + v));


//        System.out.println("max salary by each department");
//        list.stream()
//                .collect(Collectors.groupingBy(Employee::getDept,
//                        Collectors.maxBy(Comparator.comparing(Employee::getSalary))))
//                .entrySet().forEach((k) -> System.out.println(k.getKey() + k.getValue().get()));
//
//        System.out.println("max salary by each department");
//
//        list.stream().collect(Collectors.groupingBy(Employee::getDept,
//                        Collectors.minBy(Comparator.comparing(Employee::getSalary))))
//                .forEach((k, v) -> System.out.println(k + ": " + v.get()));
//

 /*       System.out.println("max salary by 1 Dept");
        Employee maxSalaryByJava = list.stream().filter(x -> x.getDept().equalsIgnoreCase("Java"))
                .sorted((s1, s2) -> s2.getSalary() - s1.getSalary())
                .limit(1).findFirst().get();
        System.out.println(maxSalaryByJava);
*/

/*
        System.out.println("second highestSalary");
        Employee secondMaxSalary = list.stream().filter(x -> x.getDept().equalsIgnoreCase("Java"))
                .sorted(Comparator.comparing(Employee::getSalary))
                .skip(1).limit(1)
                .findFirst().get();
        System.out.println(secondMaxSalary);
*/


/*
        System.out.println("dept by Employee Name");
        list.stream().collect(Collectors.groupingBy(Employee::getDept,
                        Collectors.mapping(Employee::getName, Collectors.toList())))
                .forEach((x, v) -> System.out.println(x + ": " + v));
*/

/*
        System.out.println("Avg salary of each Dept");

        list.stream().collect(Collectors.groupingBy(Employee::getDept,
                        Collectors.averagingDouble(Employee::getSalary)))
                .forEach((x, v) -> System.out.println(x + ": " + v));

*/

//        System.out.println("Sort by salary and Name");
//        List<Employee> soryBySalaryAndName = list.stream()
//                .sorted(Comparator.comparing(Employee::getSalary).thenComparing(
//                        Comparator.comparing(Employee::getName)))
//                .collect(Collectors.toList());
//        System.out.println(soryBySalaryAndName);


        System.out.println("1 dept by sorting salary by name and salary");
        list.stream().filter(x -> x.getDept().equalsIgnoreCase("Java"))
                .sorted(Comparator.comparing(Employee::getName).thenComparing(
                        Comparator.comparing(Employee::getSalary))).forEach(x -> System.out.println(x));
    }

}
