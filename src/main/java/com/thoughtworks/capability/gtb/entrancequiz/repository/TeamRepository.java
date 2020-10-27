package com.thoughtworks.capability.gtb.entrancequiz.repository;

import org.springframework.stereotype.Repository;

public class TeamRepository {

    @Repository
    public interface TeamRepository extends CrudRepository<Team,Integer> {
    }
}
