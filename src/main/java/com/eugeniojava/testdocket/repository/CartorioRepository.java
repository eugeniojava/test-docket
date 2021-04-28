package com.eugeniojava.testdocket.repository;

import com.eugeniojava.testdocket.model.Cartorio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartorioRepository extends JpaRepository<Cartorio, Long> {
}
