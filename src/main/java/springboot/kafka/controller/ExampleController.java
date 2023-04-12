package springboot.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springboot.kafka.producer.KafkaProducer;

@RestController
@RequestMapping("/send")
public class ExampleController {

    @Autowired
    KafkaProducer kafkaProducer;

    @GetMapping
    void send() {
        kafkaProducer.sendMessage("HelloWorld!", "topic-name-1");
    }

}
