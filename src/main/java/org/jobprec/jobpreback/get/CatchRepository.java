package org.jobprec.jobpreback.get;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatchRepository extends JpaRepository<Catch, Long> {
}
