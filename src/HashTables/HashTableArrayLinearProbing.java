package HashTables;

import LinkedList.mylinkedlist.Employee;

public class HashTableArrayLinearProbing {
    StoredEmployee[] hashTable;

    public HashTableArrayLinearProbing() {
        hashTable = new StoredEmployee[10];
    }

    private int hashKey(String key) {
        return key.length() % hashTable.length;
    }

    private boolean occupied(int hashedKey) {
        return hashTable[hashedKey] != null;
    }

    public void put(String key, Employee employee) {
        int hashedKey = hashKey(key);
        if (occupied(hashedKey)) {
            int stopIndex = hashedKey;

            if (hashedKey == hashTable.length - 1) {
                hashedKey = 0;
            } else {
                hashedKey++;
            }


            while (occupied(hashedKey) && hashedKey != stopIndex) {
                hashedKey = (hashedKey + 1) % hashTable.length;
            }
        }
        if (occupied(hashedKey)) {
            System.out.println("Sorry, hashtable is full...");
        } else {
            hashTable[hashedKey] = new StoredEmployee(key, employee);
        }

    }

    public Employee get(String key) {
        int hashedKey = findKey(key);

        if (hashedKey == -1) {
            return null;
        }
        return hashTable[hashedKey].employee;

    }

    public Employee remove(String key) {
        int hashedKey = findKey(key);

        if (hashedKey == -1) {
            return null;
        }
        Employee employee = hashTable[hashedKey].employee;
        hashTable[hashedKey] = null;
        rehash();
        return employee;

    }

    private void rehash() {
        StoredEmployee[] oldHashTable = hashTable;
        hashTable = new StoredEmployee[oldHashTable.length];
        for (int i = 0; i < oldHashTable.length; i++) {
            if (oldHashTable[i] != null)
                put(oldHashTable[i].key, oldHashTable[i].employee);
        }
    }

    public int findKey(String key) {

        int hashedKey = hashKey(key);

        //found the key in it's position:
        if (hashTable[hashedKey] != null && hashTable[hashedKey].key.equals(key)) {
            return hashedKey;
        }
        //it's not in it's position, search for it:
        else {
            int stopIndex = hashedKey;

            if (hashedKey == hashTable.length - 1) {
                hashedKey = 0;
            } else {
                hashedKey++;
            }

            while (occupied(hashedKey) && !hashTable[hashedKey].key.equals(key) && hashedKey != stopIndex) {
                hashedKey = (hashedKey + 1) % hashTable.length;
            }

            if (occupied(hashedKey) && hashTable[hashedKey].key.equals(key)) {
                return hashedKey;
            } else {
                return -1;
            }

        }
    }

    public void printHashTable() {
        for (int i = 0; i < hashTable.length; i++)
            if (hashTable[i] == null)
                System.out.println("position " + i + " is empty");
            else {
                System.out.println("position " + i + " includes " + hashTable[i].employee);
            }

    }
}
