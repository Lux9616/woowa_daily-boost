package com.woowa.dailyboost.domain;

public enum Category {
    SAD("우울해요", "😢"),
    ANXIOUS("불안해요", "😰"),
    TIRED("피곤해요", "😫"),
    LONELY("외로워요", "😔"),
    ANGRY("화나요", "😠"),
    HAPPY("기쁨", "😊"),
    MOTIVATED("의욕적", "🔥");

    private final String description;
    private final String emoji;

    Category(String description, String emoji) {
        this.description = description;
        this.emoji = emoji;
    }

    public String getDescription() {
        return description;
    }

    public String getEmoji() {
        return emoji;
    }
}
