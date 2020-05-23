package heap;

public class Task implements Comparable{
    private int priority;
    private int taskNo;

    public Task(int priority, int taskNo) {
        this.priority = priority;
        this.taskNo = taskNo;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public int compareTo(Object o) {

        //like compare to in string if this number becames positive it means that obj o is greater than this
        return ((Task) o).priority - this.priority;
    }

    @Override
    public String toString() {
        return "Task{" +
                "priority=" + priority +
                ", taskNo=" + taskNo +
                '}';
    }
}
