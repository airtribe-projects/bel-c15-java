package org.airtribe.LearnerManagementSystemC15.repository;

import java.util.List;
import org.airtribe.LearnerManagementSystemC15.entity.Learner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface LearnerRepository extends JpaRepository<Learner, Long> {
  Learner findByLearnerName(String learnerName);

  @Query("SELECT l FROM Learner l WHERE l.learnerName = ?1")
  Learner findByLearner(String learnerName);

}
