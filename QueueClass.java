import java.util.Queue;
import java.util.LinkedList;
class QueueClass {
    public static void main(String []args){
        Queue<Integer> queue= new LinkedList<>();
        // add elements
        queue.add(5);
        queue.offer(6);
        System.out.println(queue);
        // clear
      //  queue.clear();
        // front element
        //System.out.println( queue.peek());
       // System.out.println( queue.element());
       // remove element
       //queue.poll();
       queue.remove(6);
       
       System.out.println(queue.size());
       System.out.println(queue.isEmpty());

    }
}