package rally;


import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Mechanic<T extends Transport> implements List<Mechanic> {
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


    @Override
    public String toString() {
        return " Механик " + name ;}

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<Mechanic> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Mechanic mechanic) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Mechanic> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Mechanic> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Mechanic get(int index) {
        return null;
    }

    @Override
    public Mechanic set(int index, Mechanic element) {
        return null;
    }

    @Override
    public void add(int index, Mechanic element) {

    }

    @Override
    public Mechanic remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<Mechanic> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Mechanic> listIterator(int index) {
        return null;
    }

    @Override
    public List<Mechanic> subList(int fromIndex, int toIndex) {
        return null;
    }
}