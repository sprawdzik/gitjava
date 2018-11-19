package pl.infoshare.eleven;

import java.util.ArrayList;
import java.util.List;

public class GenericClass<T,K> {

    private T number;

    private List<K> someList = new ArrayList<>();

    public T getNumber() {
        return number;
    }

    public void setNumber(T number) {
        this.number = number;
    }

    public void addToList(K element){
        someList.add(element);
    }

    public K getFromList(int index){
        return someList.get(index);
    }
}
