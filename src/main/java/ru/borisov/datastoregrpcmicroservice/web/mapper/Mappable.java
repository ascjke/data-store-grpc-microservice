package ru.borisov.datastoregrpcmicroservice.web.mapper;

public interface Mappable<E, D>{

    D toDto(E e);

}
