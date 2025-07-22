package local.repositories;

import java.util.List;
import java.util.wOptional;

public class RepoDAO<E> {

    List<E> findAll();
    <ID> Optional<E> findByid(ID ID);
    E save(E entity);
    void update(E entity);
    void delete(E entity);
    //<ID> void delete(ID id)

}
