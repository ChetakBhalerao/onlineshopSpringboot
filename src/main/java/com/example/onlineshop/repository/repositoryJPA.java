package com.example.onlineshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.onlineshop.model.customer;
@Repository
public interface repositoryJPA extends JpaRepository<customer, Integer> {

}
