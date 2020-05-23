package heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityClassTestCache {
    public static void main(String[] args) {

        Comparator<Task> taskComparator = new Comparator<Task>() {
            @Override
            public int compare(Task o1, Task o2) {
                return o1.compareTo(o2);
             //   return o2.getPriority()-o1.getPriority();
            }
        };
        //don't forget that the priority queue class is a mean heap
        PriorityQueue<Task> cache = new PriorityQueue<Task>(taskComparator);
        cache.add(new Task(10,1000));
        cache.add(new Task(30,2000));
        cache.add(new Task(5,3000));
        cache.add(new Task(1,4000));
        cache.add(new Task(15,5000));

       // System.out.println(cache.remove());

        Object[] tasks = cache.toArray();
        for(Object obj : tasks)
            System.out.println(obj);
    }
}
