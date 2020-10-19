package com.company.pr8;

import java.util.Collection;

public interface IWaitList<T> {
    void add(T element);

    T remove();

    Boolean contains(T element);

    Boolean containsAll(Collection<T> collection);

    Boolean isEmpty();
}
