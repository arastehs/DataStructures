package HashTables;

import LinkedList.mylinkedlist.Employee;

public class HashTableArrayDriveTest {
    public static void main(String[] args) {
        //testing simple hashTable:
//        HashTableArray hashTable = new HashTableArray();
//        hashTable.put("Arian", new Employee("Arian", "namvar", 10));
//        hashTable.put("Adrina",new Employee("Adrina", "namvar", 20));
//        hashTable.put("sep",new Employee("sep", "ara", 30));
//        hashTable.put("vahid",new Employee("vahid", "namvar", 40));
//
//        hashTable.printHashTable();

       //testing linear probing hashTable:
//        HashTableArrayLinearProbing hashTable = new HashTableArrayLinearProbing();
//        hashTable.put("Arian", new Employee("Arian", "namvar", 10));
//        hashTable.put("Adrina",new Employee("Adrina", "namvar", 20));
//        hashTable.put("sep",new Employee("sep", "ara", 30));
//        hashTable.put("vahid",new Employee("vahid", "namvar", 40));
//
//        hashTable.printHashTable();
//        System.out.println("----------------");
//        System.out.println(hashTable.get("vahid"));
//        hashTable.remove("Arian");
//        hashTable.printHashTable();
//        System.out.println(hashTable.get("vahid"));

        //testing Chained HashTable:
        ChainedHashTable hashTable = new ChainedHashTable();
        hashTable.put("Arian", new Employee("Arian", "namvar", 10));
        hashTable.put("Adrina",new Employee("Adrina", "namvar", 20));
        hashTable.put("sep",new Employee("sep", "ara", 30));
        hashTable.put("vahid",new Employee("vahid", "namvar", 40));

        hashTable.printHashTable();
        System.out.println("----------------");
        System.out.println(hashTable.get("vahid"));
        hashTable.remove("Arian");
        hashTable.printHashTable();
        System.out.println(hashTable.get("vahid"));


    }
}
