package com.woowa.dailyboost.controller;

import com.woowa.dailyboost.domain.Category;
import com.woowa.dailyboost.dto.MessageRequest;
import com.woowa.dailyboost.dto.MessageResponse;
import com.woowa.dailyboost.service.MessageService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/messages")
@CrossOrigin(origins = "*") // CORS 설정
public class MessageController {

    private final MessageService messageService;

    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    // 랜덤 메시지 가져오기
    @GetMapping("/random/{category}")
    public ResponseEntity<MessageResponse> getRandomMessage(@PathVariable Category category) {
        MessageResponse response = messageService.getRandomMessage(category);
        return ResponseEntity.ok(response);
    }

    // 모든 메시지 조회
    @GetMapping
    public ResponseEntity<List<MessageResponse>> getAllMessages() {
        List<MessageResponse> messages = messageService.getAllMessages();
        return ResponseEntity.ok(messages);
    }

    // 카테고리별 메시지 조회
    @GetMapping("/category/{category}")
    public ResponseEntity<List<MessageResponse>> getMessagesByCategory(@PathVariable Category category) {
        List<MessageResponse> messages = messageService.getMessagesByCategory(category);
        return ResponseEntity.ok(messages);
    }

    // 메시지 추가
    @PostMapping
    public ResponseEntity<MessageResponse> createMessage(@RequestBody MessageRequest request) {
        MessageResponse response = messageService.createMessage(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    // 메시지 삭제
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMessage(@PathVariable Long id) {
        messageService.deleteMessage(id);
        return ResponseEntity.noContent().build();
    }

    // 카테고리별 메시지 개수
    @GetMapping("/count/{category}")
    public ResponseEntity<Long> countByCategory(@PathVariable Category category) {
        long count = messageService.countByCategory(category);
        return ResponseEntity.ok(count);
    }

    // Health Check
    @GetMapping("/health")
    public ResponseEntity<String> health() {
        return ResponseEntity.ok("Daily Boost API is running! 💙");
    }
}