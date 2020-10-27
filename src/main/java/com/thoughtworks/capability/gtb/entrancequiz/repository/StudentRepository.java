package com.thoughtworks.capability.gtb.entrancequiz.repository;


import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends CrudRepository<Student,Integer> {

}