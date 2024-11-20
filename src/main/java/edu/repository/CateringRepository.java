package edu.repository;

import edu.entity.CateringEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CateringRepository extends JpaRepository<CateringEntity,Integer> {
}
