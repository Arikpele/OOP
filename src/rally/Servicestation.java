package rally;

import java.util.LinkedList;
import java.util.Queue;

public class Servicestation<T extends Transport> {
    private Queue<T> queue = new LinkedList<>();

    public Servicestation() {
        this.queue = queue;

    }

    public void addCar1(T car) {
        queue.offer(car);
        System.out.println("добавить авто в очередь");
    }

    public void osmotr() {
        T car = queue.poll();
        if (car != null) {
            System.out.println("провести техосмотр авто");
            osmotr();
        } else {
            System.out.println("Очередь закончилась");
        }
    }

    public int size() {
        return queue.size();
    }
}