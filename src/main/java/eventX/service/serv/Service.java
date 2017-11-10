package eventX.service.serv;

public interface Service<E, ID> {
    E create (E entity);
    E readById(ID id);
    Iterable<E> readAll();
    E update(E entity);
    void delete(E entity);
}
