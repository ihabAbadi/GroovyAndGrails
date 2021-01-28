package formation.interfaces

interface IRepository<T> {
    void create(T element)
    void update(T element)
    void delete(T element)
    T read(int id)
    List<T> readAll(def closure)
}