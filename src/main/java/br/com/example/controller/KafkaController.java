package br.com.example.controller;

import br.com.example.broker.producer.TopicProducer;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/kafka")
@RequiredArgsConstructor
@Slf4j
public class KafkaController {
    private final TopicProducer topicProducer;

    @PostMapping(value = "/send/{topic}")
    public String publish(@PathVariable String topic, @RequestBody String body) {
        topicProducer.send(topic, body);
        return "Success";
    }
}
