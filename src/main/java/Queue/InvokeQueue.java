package Queue;

public class InvokeQueue {
    public static void main(String[] args) {
//      invokeHeap();
    invokeQueneOnArray();
    }

    public static void invokeQuene() {
        Queue queue = new Queue();
        queue.addToQueue(10);
        queue.addToQueue(11);
        queue.addToQueue(5);
        queue.printQueue();
    }


    public static void invokeQueueOnArray() {
        QueueOnArray queue = new QueueOnArray(5);
        System.out.println(String.valueOf(queue.isEmpty()));
        queue.addToQueue(10);
        queue.addToQueue(11);
        queue.addToQueue(5);
        System.out.println();
        System.out.println(String.valueOf(queue.getLastAdded()));
        System.out.println(String.valueOf(queue.getPickofQuene()));
        System.out.println(String.valueOf(queue.removeFromQuene()));
        System.out.println(String.valueOf(queue.getPickofQuene()));
        System.out.println(String.valueOf(queue.isEmpty()));

    }
}
