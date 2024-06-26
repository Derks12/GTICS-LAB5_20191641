package com.example.demo.Repository;

import com.example.demo.Entity.technician;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TecnicosRepository extends JpaRepository<technician, Integer> {

    List<technician> findByFirstName(String FirstName);

}
