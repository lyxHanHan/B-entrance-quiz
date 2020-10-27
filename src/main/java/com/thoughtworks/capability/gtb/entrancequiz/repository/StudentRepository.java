package com.thoughtworks.capability.gtb.entrancequiz.repository;

import org.springframework.stereotype.Repository;

public interface StudentRepository {

    @Repository
    public interface StudentRepository extends CrudRepository<Student,Integer> {
    }
}
