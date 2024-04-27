package com.chatAdv.chatAdv.chat;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ChatMessageRespository extends MongoRepository<ChatMessage, String> {
    List<ChatMessage> findByChatId(String s);
}
