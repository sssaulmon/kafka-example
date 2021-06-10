package com.saul.kafka.schedule;

import com.saul.kafka.model.Message;
import com.saul.kafka.service.SendTopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class ResourceSchedule {
  @Autowired
  private SendTopicService sendTopicService;

  @Scheduled(fixedDelayString = "${fixedDelay.in.milliseconds}")
  public void invokeResource() {
    sendTopicService.sendMessage(new Message().dateTime(LocalDateTime.now()));
  }
}
