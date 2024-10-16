package com.word.engword.api.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WordRepository extends JpaRepository<EngWordEntity, Long>{
    List<EngWordEntity> findAll();
    Optional<EngWordEntity> findById(Long id);
}
