package com.woowa.dailyboost.dto;

import com.woowa.dailyboost.domain.Category;
import com.woowa.dailyboost.domain.Message;

import java.time.LocalDateTime;

public class MessageResponse {

    private Long id;
    private String content;
    private Category category;
    private String categoryDescription;
    private String emoji;
    private LocalDateTime createdAt;

    public MessageResponse(Message message) {
        this.id = message.getId();
        this.content = message.getContent();
        this.category = message.getCategory();
        this.categoryDescription = message.getCategory().getDescription();
        this.emoji = message.getCategory().getEmoji();
        this.createdAt = message.getCreatedAt();
    }

    // Getters
    public Long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public Category getCategory() {
        return category;
    }

    public String getCategoryDescription() {
        return categoryDescription;
    }

    public String getEmoji() {
        return emoji;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}
