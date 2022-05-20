package com.quiz.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quiz.crud.model.Cachorro;

public interface CachorroRepository extends JpaRepository<Cachorro, Long>{


}
