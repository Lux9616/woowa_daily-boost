package com.woowa.dailyboost.service;

import com.woowa.dailyboost.domain.Category;
import com.woowa.dailyboost.domain.Message;
import com.woowa.dailyboost.dto.MessageRequest;
import com.woowa.dailyboost.dto.MessageResponse;
import com.woowa.dailyboost.exception.MessageNotFoundException;
import com.woowa.dailyboost.repository.MessageRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional(readOnly = true)
public class MessageService {

    private final MessageRepository messageRepository;

    public MessageService(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    // 랜덤 메시지 가져오기 (카테고리별)
    public MessageResponse getRandomMessage(Category category) {
        Message message = messageRepository.findRandomByCategory(category.name());

        if (message == null) {
            throw new MessageNotFoundException("해당 카테고리의 메시지가 없습니다: " + category);
        }

        return new MessageResponse(message);
    }

    // 모든 메시지 조회
    public List<MessageResponse> getAllMessages() {
        return messageRepository.findAll().stream()
                .map(MessageResponse::new)
                .collect(Collectors.toList());
    }

    // 카테고리별 메시지 조회
    public List<MessageResponse> getMessagesByCategory(Category category) {
        return messageRepository.findByCategory(category).stream()
                .map(MessageResponse::new)
                .collect(Collectors.toList());
    }

    // 메시지 추가
    @Transactional
    public MessageResponse createMessage(MessageRequest request) {
        Message message = new Message(request.getContent(), request.getCategory());
        Message savedMessage = messageRepository.save(message);
        return new MessageResponse(savedMessage);
    }

    // 메시지 삭제
    @Transactional
    public void deleteMessage(Long id) {
        if (!messageRepository.existsById(id)) {
            throw new MessageNotFoundException("메시지를 찾을 수 없습니다: " + id);
        }
        messageRepository.deleteById(id);
    }

    // 카테고리별 메시지 개수
    public long countByCategory(Category category) {
        return messageRepository.countByCategory(category);
    }
}
