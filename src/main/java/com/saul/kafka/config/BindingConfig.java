package com.saul.kafka.config;

import com.saul.kafka.communication.binding.OutputMessageBinding;
import com.saul.kafka.contract.binding.InputMessageBinding;
import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableBinding({OutputMessageBinding.class, InputMessageBinding.class})
public class BindingConfig {
}
