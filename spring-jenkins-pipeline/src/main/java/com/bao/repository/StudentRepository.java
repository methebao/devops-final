package com.bao.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.bao.domain.Student;

public interface StudentRepository extends MongoRepository<Student, String> {
}
