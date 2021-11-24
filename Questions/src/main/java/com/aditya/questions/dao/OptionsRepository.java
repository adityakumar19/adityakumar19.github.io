package com.aditya.questions.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aditya.questions.entity.Options;

@Repository
public interface OptionsRepository extends JpaRepository<Options, Integer>{

}
