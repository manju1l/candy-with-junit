package com.example.junit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.junit.Model.Model;

public interface Erepo  extends JpaRepository<Model, Integer>{

}
