package com.saul.kafka.contract.binding;

import com.saul.kafka.contract.constants.MessageTopicInputConstants;
import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface InputMessageBinding {

  @Input(MessageTopicInputConstants.INPUT_TOPIC_MESSAGE)
  SubscribableChannel generateFileRequest();
}
