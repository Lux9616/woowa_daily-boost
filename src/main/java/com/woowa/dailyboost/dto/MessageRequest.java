package com.woowa.dailyboost.dto;

import com.woowa.dailyboost.domain.Category;

public class MessageRequest {

    private String content;
    private Category category;

    public MessageRequest() {
    }

    public MessageRequest(String content, Category category) {
        this.content = content;
        this.category = category;
    }

    // Getters & Setters
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
