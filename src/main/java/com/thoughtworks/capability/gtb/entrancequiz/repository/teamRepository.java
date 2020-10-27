package com.thoughtworks.capability.gtb.entrancequiz.repository;

import org.springframework.stereotype.Repository;

public class teamRepository {

    @Repository
    public interface teamRepository extends CrudRepository<team,Integer> {
    }
}
