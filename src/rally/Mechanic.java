package rally;


import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Mechanic<T extends Transport>  {
    private final String name;
    private final String company;


    public Mechanic(String name, String company) {
        this.name = name;
        this.company = company;
          }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }


    public void fixCar(T car) {

        System.out.println("Механик " + getName() +
                " Ремонту ТС: " + car.getBrand() +
                " " + car.getModel());
    }


    public String toString() {
        return " Механик " + name ;}


    public int size() {
        return 0;
    }


    public boolean isEmpty() {
        return false;
    }


    public boolean contains(Object o) {
        return false;
    }


    public Iterator<Mechanic> iterator() {
        return null;
    }


    public Object[] toArray() {
        return new Object[0];
    }


    public <T> T[] toArray(T[] a) {
        return null;
    }


    public boolean add(Mechanic mechanic) {
        return false;
    }


    public boolean remove(Object o) {
        return false;
    }


    public boolean containsAll(Collection<?> c) {
        return false;
    }


    public boolean addAll(Collection<? extends Mechanic> c) {
        return false;
    }


    public boolean addAll(int index, Collection<? extends Mechanic> c) {
        return false;
    }


    public boolean removeAll(Collection<?> c) {
        return false;
    }


    public boolean retainAll(Collection<?> c) {
        return false;
    }


    public void clear() {

    }


    public Mechanic get(int index) {
        return null;
    }


    public Mechanic set(int index, Mechanic element) {
        return null;
    }


    public void add(int index, Mechanic element) {

    }


    public Mechanic remove(int index) {
        return null;
    }


    public int indexOf(Object o) {
        return 0;
    }


    public int lastIndexOf(Object o) {
        return 0;
    }


    public ListIterator<Mechanic> listIterator() {
        return null;
    }


    public ListIterator<Mechanic> listIterator(int index) {
        return null;
    }


    public List<Mechanic> subList(int fromIndex, int toIndex) {
        return null;
    }
}