package HashTables;

import LinkedList.mylinkedlist.Employee;

public class HashTableArray {
    Employee[] hashTable ;

    public HashTableArray() {
        hashTable = new Employee[10];
    }
    private int hashKey(String name){
        return name.length()%hashTable.length;
    }
    public void put(String key, Employee employee){
        int hashedKey = hashKey(key);
        if(hashTable[hashedKey]==null)
        {
            hashTable[hashedKey] = employee;

        }
        else {
            System.out.println("Sorry position "+hashedKey+ " is full...");

        }
    }
    public Employee get(String key)
    {
        return hashTable[hashKey(key)];
    }
    public void printHashTable(){
        for(int i=0; i<hashTable.length;i++)
            System.out.println(hashTable[i]);
    }
}
