package org.example.fitnessjava.dao;

import org.example.fitnessjava.pojo.Banner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BannerRepository extends JpaRepository<Banner, Long> {
}
