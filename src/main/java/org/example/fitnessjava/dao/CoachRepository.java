package org.example.fitnessjava.dao;

import org.example.fitnessjava.pojo.Coach;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CoachRepository extends JpaRepository<Coach, Long> {
    List<Coach> findByFeatured(Boolean isFeatured);
}
