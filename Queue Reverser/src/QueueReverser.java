import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class QueueReverser<T> {
    public Queue<T> reverse (Queue<T> queueToReverse){
        Queue<T> tempQueue = new ArrayDeque<>();
        Stack<T> temp = new Stack<>();
        for (T count: queueToReverse){
            temp.push(count);
        }
        while (!temp.isEmpty()){

            tempQueue.add(temp.pop());
        }

        return tempQueue;
    }
}
