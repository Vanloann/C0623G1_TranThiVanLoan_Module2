package mvc.service;

import java.util.List;

public interface IService <E>{
    void add(E e);

    void delete(E e);

    List<E> display();
}
