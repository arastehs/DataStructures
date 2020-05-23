package HashTables;

import LinkedList.mylinkedlist.Employee;

import java.util.LinkedList;
import java.util.ListIterator;

public class ChainedHashTable {
    LinkedList<StoredEmployee>[] hashTable;

    public ChainedHashTable() {
        hashTable = new LinkedList[10];
        for (int i = 0; i < hashTable.length; i++)
            hashTable[i] = new LinkedList<StoredEmployee>();
    }

    public int hahKey(String key) {
        return key.hashCode() % hashTable.length;
      //  return key.length() % hashTable.length;
    }

    public void put(String key, Employee employee) {
        int hashedKey = hahKey(key);
        StoredEmployee storedEmployee = new StoredEmployee(key, employee);
        hashTable[hashedKey].add(storedEmployee);

    }

    public Employee get(String key) {
        int hashedKey = hahKey(key);
        ListIterator<StoredEmployee> iterator = hashTable[hashedKey].listIterator();
        while (iterator.hasNext()) {
            StoredEmployee storedEmployee = iterator.next();
            if (storedEmployee.key.equals(key)) {
                return storedEmployee.employee;
            }
        }
        return null;
    }

    public Employee remove(String key) {
        int hashKey = hahKey(key);
        ListIterator<StoredEmployee> iterator = hashTable[hashKey].listIterator();
        int empIndex = -1;
        while (iterator.hasNext()) {
            StoredEmployee storedEmployee = iterator.next();
            empIndex++;
            if (storedEmployee.key.equals(key)) {
                hashTable[hashKey].remove(empIndex);
                return storedEmployee.employee;
            }
        }
        return null;
    }

    public void printHashTable() {
        for (int i = 0; i < hashTable.length; i++) {
            if (hashTable[i] == null)
                System.out.println("position " + i + " is empty");
            else {
                System.out.print("position " + i + " ");
                ListIterator<StoredEmployee> iterator = hashTable[i].listIterator();
                while (iterator.hasNext()) {
                    StoredEmployee storedEmployee = iterator.next();
                    System.out.print(storedEmployee.employee);
                    System.out.print(" -> ");

                }
                System.out.print("null");
            }
            System.out.println("");
        }

    }
}
