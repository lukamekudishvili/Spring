package luka.springframework.PetClinic.Services.map;

import luka.springframework.PetClinic.Model.BaseEntity;
import luka.springframework.PetClinic.Services.CrudService;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> implements CrudService<T, ID> {
    protected Map<Long, T> map = new HashMap<>();

    @Override
    public T findById(ID id) {
        return map.get(id);
    }

    @Override
    public T save(T object) {
        if (object != null) {
            if (object.getId() == null) {
                object.setId(getNextID());
            }
            map.put(object.getId(), object);
        }else{
            throw new RuntimeException("Object cannot be null!");
        }
        return object;
    }

    @Override
    public Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    @Override
    public void delete(T object) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));

    }

    @Override
    public void deleteById(ID id) {
        map.remove(id);
    }

    private Long getNextID() {
        Long nextId=null;
        try{
            nextId=Collections.max(map.keySet()) + 1;
        }catch (NoSuchElementException e){
            nextId=1L;
        }
        return nextId;
    }
}
