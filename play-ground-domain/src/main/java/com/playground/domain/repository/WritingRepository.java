package com.playground.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by coupang on 2017. 12. 24..
 */
@Repository
public interface WritingRepository extends JpaRepository<Writing, Integer> {
}
