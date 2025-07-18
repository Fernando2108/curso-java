package com.cdsb.project.repositories;

import java.util.Optional;

public interface repo<T, E, DTO> {

    List<E> readAll();
    // findAll
    // getAll

    E readById(I id) throws Error;
    // findById
    // getById

    E create(DTO data);
    // save

    E updateById(I id, DTO data) throws Exception;
    // update

    T deleteById() throws Exception;
    // delete

}
