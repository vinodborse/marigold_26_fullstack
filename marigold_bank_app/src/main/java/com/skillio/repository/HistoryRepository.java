package com.skillio.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.skillio.model.History;

@Repository
public interface HistoryRepository extends JpaRepository<History, Long>{

	Optional<History> findByTransactionId(int tnId);

}
