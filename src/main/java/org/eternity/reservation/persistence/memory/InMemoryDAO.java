package org.eternity.reservation.persistence.memory;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public abstract class InMemoryDAO<T> {
    private Long currentId;
    private final List<T> objects = new ArrayList<>();

    protected InMemoryDAO() {
        this.currentId = 1L;
    }

    protected List<T> findMany(Predicate<T> condition) {
        return objects.stream().filter(condition).collect(Collectors.toList());
    }

    protected T findOne(Predicate<T> condition) {
        return objects.stream().filter(condition).findFirst().orElse(null);
    }

    public void insert(T object) {
        setIdIfPossible(object);
        objects.add(object);
    }

    private void setIdIfPossible(T object) {
        try {
            Field idField = object.getClass().getDeclaredField("id");
            idField.setAccessible(true);
            idField.set(object, currentId);
            currentId++;
        } catch (Exception e) {
            //
        }
    }
}
