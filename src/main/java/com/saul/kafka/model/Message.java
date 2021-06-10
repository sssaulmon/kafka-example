package com.saul.kafka.model;

import java.time.LocalDateTime;

public class Message {
  private LocalDateTime dateTime;

  public LocalDateTime getDateTime() {
    return dateTime;
  }

  public Message dateTime(LocalDateTime dateTime) {
    this.dateTime = dateTime;
    return this;
  }
}
