package com.woowa.dailyboost.repository;

import com.woowa.dailyboost.domain.Category;
import com.woowa.dailyboost.domain.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {

    // 카테고리별 메시지 조회
    List<Message> findByCategory(Category category);

    // 카테고리별 메시지 개수
    long countByCategory(Category category);

    // 랜덤 메시지 1개 (카테고리별)
    @Query(value = "SELECT * FROM messages WHERE category = ?1 ORDER BY RAND() LIMIT 1",
            nativeQuery = true)
    Message findRandomByCategory(String category);
}