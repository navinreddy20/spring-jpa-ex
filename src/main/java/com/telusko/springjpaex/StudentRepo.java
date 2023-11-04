package com.telusko.springjpaex;

import com.telusko.springjpaex.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

// JPQL Query for finding students by name
//    @Query("from Student where name=:name")
//    List<Student> findByName(@Param("name") String name);
}
