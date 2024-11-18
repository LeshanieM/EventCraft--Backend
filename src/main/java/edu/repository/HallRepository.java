package edu.repository;

import edu.entity.BandEntity;
import edu.entity.HallEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HallRepository extends JpaRepository<HallEntity,Integer> {
}

