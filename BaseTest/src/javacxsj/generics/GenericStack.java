package javacxsj.generics;

import java.util.ArrayList;

/**
 * @author DuXiaojing
 * @desc
 * @create 2018-04-22 15:17
 **/
public class GenericStack<T> {
    private ArrayList<T> list = new ArrayList<T>();

    public int getSize(){
        return list.size();
    }
    public T get(int index){
        return list.get(index);
    }
    public T peek(){
        return list.get(getSize()-1);
    }
    public void push(T t){
        list.add(t);
    }
    public boolean isEmpty(){
        return list.size()==0;
    }
    public T pop(){
        T t = list.get(getSize()-1);
        list.remove(getSize()-1);
        return t;
    }

}
