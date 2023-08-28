package mvc.repository;

import java.util.List;

public interface IRepository <E>{
    void add(E e);

    void delete(String id);

    List<E> display();

    List<E> convert(List<String> strings);

    List<String> convertToString(List<E> e);
}
