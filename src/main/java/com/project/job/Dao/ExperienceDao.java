package com.project.job.Dao;

import com.project.job.model.Exprerience;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienceDao extends JpaRepository<Exprerience, Long > {
}
