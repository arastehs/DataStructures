package HashTables;

import LinkedList.mylinkedlist.Employee;

import java.util.HashMap;
import java.util.Map;

public class JDKHashMap {
    public static void main(String[] args) {
        Map<String, Employee> hashMap = new HashMap();
        hashMap.put("Arian", new Employee("Arian", "namvar", 10));
        hashMap.put("Adrina", new Employee("Adrina", "namvar", 20));
        hashMap.put("sep", new Employee("sep", "ara", 30));
        hashMap.put("vahid", new Employee("vahid", "namvar", 40));

        //we can use an iterator or java8 lamba expression like this
        hashMap.forEach((k, v) -> System.out.println("key is: " + k + " value is: " + v));
        //        Iterator<Employee> iterator = hashMap.values().iterator();
//        while(iterator.hasNext())
//            System.out.println(iterator.next());

        //it will replace sep_ara with sep_arasteh:
////        hashMap.put("sep", new Employee("sep", "arasteh", 30));
//        System.out.println("----------------------------------------");
//
//        hashMap.forEach((k, v) -> System.out.println("key is: " + k + " value is: " + v));

        //if we don't want to be replaced use:
       Employee e = hashMap.putIfAbsent("sep", new Employee("sep", "arasteh", 30));
        System.out.println(e);

        e = hashMap.getOrDefault("majid", new Employee("majid","namvar",60));
        System.out.println(e);



    }
}
