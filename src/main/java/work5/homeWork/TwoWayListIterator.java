package work5.homeWork;

import java.util.ListIterator;

public interface TwoWayListIterator<T> extends ListIterator<T> {
    @Override
    boolean hasNext();

    @Override
    T next();

    @Override
    boolean hasPrevious();

    @Override
    T previous();

    @Override
    default int nextIndex(){
        return 0;
    };

    @Override
    default int previousIndex(){
        return 0;
    };

    @Override
    default void remove(){};

    @Override
    default void set(T t){};

    @Override
    default void add(T t){};
}
