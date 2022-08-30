package com.fstop.test.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fstop.test.entity.test;

@Repository
public interface testDao extends JpaRepository<test, String> {
	test findByName(String name);
}
