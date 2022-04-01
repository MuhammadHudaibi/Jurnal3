package com.company;

public class Input <E>{
    E data;
    Input<E> next;

    public Input(E object){ data = object; this.next = null;
    }

    public E getData(){
        return data;
    }
}
