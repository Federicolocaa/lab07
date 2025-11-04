package it.unibo.inner.impl;

import it.unibo.inner.api.IterableWithPolicy;
import it.unibo.inner.api.Predicate;
import java.util.Iterator;

public class IterableWithPolicyImpl<T> implements IterableWithPolicy<T> {
    private final T[] array;
    public IterableWithPolicyImpl (final T[] array){
        this.array = array;
    }
}
