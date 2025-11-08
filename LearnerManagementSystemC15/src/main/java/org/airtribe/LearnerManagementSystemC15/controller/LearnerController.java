package org.airtribe.LearnerManagementSystemC15.controller;

import java.util.List;
import org.airtribe.LearnerManagementSystemC15.entity.Learner;
import org.airtribe.LearnerManagementSystemC15.service.LearnerManagementService;
import org.airtribe.LearnerManagementSystemC15.service.LearnerNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LearnerController {

  @Autowired
  private LearnerManagementService learnerManagementService;

  @PostMapping("/learners")
  public Learner createLearner(@RequestBody Learner learner) {
    return learnerManagementService.saveLearner(learner);
  }

//  @GetMapping("/learners/{learnerId}")
//  public Learner fetchLearnerById(@PathVariable("learnerId") Long learnerId) {
//    return learnerManagementService.fetchLearnerById(learnerId);
//  }
//
//  @GetMapping("/learners/{learnerName}")
//  public Learner fetchLearnerByName(@PathVariable("learnerName") String learnerName) {
//    return learnerManagementService.fetchLearnerByName(learnerName);
//  }

  @GetMapping("/learners")
  public List<Learner> fetchLearnerById(@RequestParam(value = "learnerId", required = false) Long learnerId,
      @RequestParam(value = "learnerName", required = false) String learnerName) throws LearnerNotFoundException {

    return learnerManagementService.fetchLearnersComplexParams(learnerId, learnerName);
  }

  @ExceptionHandler(LearnerNotFoundException.class)
  public ResponseEntity handleLearnerNotFoundException(LearnerNotFoundException e) {
    return ResponseEntity.status(404).body(e.getStackTrace());
  }


}