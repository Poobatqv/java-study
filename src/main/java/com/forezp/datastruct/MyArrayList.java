package com.forezp.datastruct;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * Created by forezp on 2017/11/25.
 */
public class MyArrayList<T> implements Iterable<T>  {
    private T[] theItems;
    private int theSize;
    private static final int DEAULT_CAPACITY=10;

    public MyArrayList(){
        theSize=0;
        ensureCapacity(DEAULT_CAPACITY);

    }

    public void add(T data){
        if(size()==theItems.length){
            ensureCapacity(size()*2+1);
        }
        theItems[size()]=data;
        theSize++;
    }

    public void add(int index,T data){
        if(size()==theItems.length){
            ensureCapacity(size()*2+1);
        }
        for(int i=theSize;i>index;i--){
            theItems[i]=theItems[i-1];
        }
        theItems[index]=data;
        theSize++;
    }

    public T get(int index){
        if(index<0|index>=size()){
            throw new IndexOutOfBoundsException("index error");
        }
        return theItems[index];
    }

    public T remove(int index){
        T removeData=get(index);
        for(int i=index;i<size()-1;i++){
            theItems[i]=theItems[i+1];
        }
        theSize--;
        return removeData;
    }

    public int size(){
        return theSize;
    }

    private void ensureCapacity(int newCapacity){
        if(theSize>newCapacity){
            return;
        }

        T[] old=theItems;
        theItems= (T[]) new Object[newCapacity];
        for(int i=0;i<size();i++){
            theItems[i]=old[i];
        }
    }



    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super T> action) {

    }

    @Override
    public Spliterator<T> spliterator() {
        return null;
    }
}
