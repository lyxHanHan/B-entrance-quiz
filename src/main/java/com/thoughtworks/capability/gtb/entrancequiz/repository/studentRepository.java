package com.thoughtworks.capability.gtb.entrancequiz.repository;

import org.springframework.stereotype.Repository;

public interface studentRepository {

    @Repository
    public interface studentRepository extends CrudRepository<student,Integer> {
    }
}
