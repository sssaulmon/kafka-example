package com.saul.kafka.test.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Charsets;
import com.google.common.io.Resources;

import java.io.IOException;

public class TestUtils {

  private static final ObjectMapper mapper = new ObjectMapper();

  public static String loadResource(String fileName) {
    try {
      return Resources.toString(Resources.getResource(fileName), Charsets.UTF_8);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  public static <T> T loadObject(String file, Class<T> clazz) {
    return loadContent(loadResource(file), clazz);
  }

  public static <T> T loadContent(String content, Class<T> clazz) {
    try {
      return mapper.readValue(content, clazz);
    } catch (IOException ex) {
      ex.printStackTrace();
      throw new RuntimeException("Error parsing file to JSON with content: " + content);
    }
  }
}
