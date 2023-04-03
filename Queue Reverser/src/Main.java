import java.util.ArrayDeque;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> myQueue=new ArrayDeque<>();
        try {
            myQueue.add("Text1");
            myQueue.add("theText2");
            myQueue.add("myText the3");
        } catch (NullPointerException e){
            e.printStackTrace();
        }
        System.out.println(myQueue);
        QueueReverser<String> queueReverser = new QueueReverser<>();
        System.out.println("\n");
        System.out.println(queueReverser.reverse(myQueue));

    }
}