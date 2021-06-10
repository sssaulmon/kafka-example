package com.saul.kafka.service;

import com.saul.kafka.model.Message;

public interface SendTopicService {
  void sendMessage(Message message);
}
