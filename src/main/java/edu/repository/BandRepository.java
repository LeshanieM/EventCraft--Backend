package edu.repository;
import edu.entity.BandEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BandRepository extends JpaRepository<BandEntity,Integer> {
}
