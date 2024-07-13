package com.application.junkmanagement.Repository;

import com.application.junkmanagement.models.RecyclingCenter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecyclingCenterRepositoy extends JpaRepository<RecyclingCenter, Long> {
}
