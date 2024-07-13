package com.application.junkmanagement.Repository;

import com.application.junkmanagement.models.Users;
import com.application.junkmanagement.models.WasteCollection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WasteCollectionRepository extends JpaRepository<WasteCollection, Long> {
    List<WasteCollection> findByUserId(Long id);
}
