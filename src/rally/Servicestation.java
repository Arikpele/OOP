package rally;
import java.util.LinkedList;
import java.util.Queue;

public class Servicestation<T extends Car> {
    private Queue<T> queue = new LinkedList<>();

    public Servicestation(Queue<T> queue, String name) {
        this.queue = queue;
        this.name = name;
    }

    public String name;

    public void addCar1(T Car) {
        queue.offer(Car);
    }

    public void osmotr() {
       T car= queue.poll();
       if (car != null) {
           System.out.println("провести техосмотр авто");
           osmotr();
       }
       else {
           System.out.println("Очередь закончилась");
       }
    }

    public int size() {
        return queue.size();
    }

}