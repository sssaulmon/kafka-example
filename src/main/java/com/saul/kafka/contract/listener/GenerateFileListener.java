package com.saul.kafka.contract.listener;

import com.saul.kafka.contract.constants.MessageTopicInputConstants;
import com.saul.kafka.model.Message;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;


@Component
public class GenerateFileListener {

  @StreamListener(MessageTopicInputConstants.INPUT_TOPIC_MESSAGE)
  public void inputMessage(Message message) {
    System.out.println("Este es el topico de entrada = " + message.getDateTime());
  }
}
