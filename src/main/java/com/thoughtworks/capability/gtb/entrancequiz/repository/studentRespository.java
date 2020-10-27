package com.thoughtworks.capability.gtb.entrancequiz.repository;

import org.springframework.stereotype.Repository;

public interface studentRespository {

    @Repository
    public interface OrderRepository extends CrudRepository<student,Integer> {
    }
}
