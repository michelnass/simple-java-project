package main.java.com.example.repository;

import main.java.com.example.model.BmiRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BmiRecordRepository extends JpaRepository<BmiRecord, Long> {
    List<BmiRecord> findAllByOrderByCalculatedAtDesc();
}