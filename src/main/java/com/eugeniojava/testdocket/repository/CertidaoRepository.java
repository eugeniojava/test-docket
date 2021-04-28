package com.eugeniojava.testdocket.repository;

import com.eugeniojava.testdocket.model.Certidao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CertidaoRepository extends JpaRepository<Certidao, Long> {
}
