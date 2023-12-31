package com.epam.gymservice.dao;

import com.epam.gymservice.model.Training;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TrainingRepository extends JpaRepository<Training,Long> {
    Optional<List<Training>> findByTraineeId(Long id);
    Optional<Training> findByTrainingName(String trainingName);
    List<Training> findAllByTrainingName(String trainingName);

}
