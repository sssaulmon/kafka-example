package com.saul.kafka.communication.binding;

import com.saul.kafka.communication.constants.MessageTopicOutputConstants;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface OutputMessageBinding {

  @Output(MessageTopicOutputConstants.OUTPUT_TOPIC_MESSAGE)
  MessageChannel outMessage();
}
