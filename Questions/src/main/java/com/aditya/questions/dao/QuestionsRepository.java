package com.aditya.questions.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aditya.questions.entity.Questions;

@Repository
public interface QuestionsRepository extends JpaRepository<Questions, Integer> {

}
