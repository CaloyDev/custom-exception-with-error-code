package com.batchi.io.CustomExceptionWithErrorCode_Batchi.repository;

import com.batchi.io.CustomExceptionWithErrorCode_Batchi.model.AiEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AiEntityRepository extends JpaRepository<AiEntity, Long> {
}
