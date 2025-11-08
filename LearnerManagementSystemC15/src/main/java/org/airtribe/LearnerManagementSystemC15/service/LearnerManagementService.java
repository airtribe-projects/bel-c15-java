package org.airtribe.LearnerManagementSystemC15.service;

import java.util.List;
import java.util.Optional;
import org.airtribe.LearnerManagementSystemC15.entity.Learner;
import org.airtribe.LearnerManagementSystemC15.repository.LearnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LearnerManagementService {

  @Autowired
  private LearnerRepository learnerRepository;
  public Learner saveLearner(Learner learner) {
    return learnerRepository.save(learner);
  }

  public List<Learner> getAllLearners() {
    return learnerRepository.findAll();
  }

  public Learner fetchLearnerById(Long learnerId) throws LearnerNotFoundException {
    Optional<Learner> learnerOptional = learnerRepository.findById(learnerId);
    if (learnerOptional.isPresent()) {
      return learnerOptional.get();
    }

    throw new LearnerNotFoundException("Learner not found with id: " + learnerId);
  }

  public Learner fetchLearnerByName(String learnerName) {
    return learnerRepository.findByLearnerName(learnerName);
  }

  public List<Learner> fetchLearnersComplexParams(Long learnerId, String learnerName) throws LearnerNotFoundException {
    if (learnerId != null) {
      return List.of(fetchLearnerById(learnerId));
    }

    if (learnerName != null){
      return List.of(fetchLearnerByName(learnerName));
    }

    return getAllLearners();
  }
}
