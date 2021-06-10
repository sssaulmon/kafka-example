package com.saul.kafka.service.impl;

import com.saul.kafka.communication.binding.OutputMessageBinding;
import com.saul.kafka.model.Message;
import com.saul.kafka.service.SendTopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SendTopicServiceImpl implements SendTopicService {

  @Autowired
  private OutputMessageBinding binding;

  @Override
  public void sendMessage(Message message) {
    Optional.of(message)
      .map(MessageBuilder::withPayload)
      .map(MessageBuilder::build)
      .ifPresent(binding.outMessage()::send);
  }
}
