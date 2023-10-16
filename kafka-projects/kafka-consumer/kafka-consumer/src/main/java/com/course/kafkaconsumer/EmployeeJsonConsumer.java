package com.course.kafkaconsumer;

import com.course.kafkaconsumer.entity.Employee;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


@Service
public class EmployeeJsonConsumer {

    private ObjectMapper objectMapper = new ObjectMapper();


    private static final Logger logger = LoggerFactory.getLogger(EmployeeJsonConsumer.class);

    @KafkaListener(topics = "t_employee")
    public void consume(String message) throws JsonProcessingException {
           var emp = objectMapper.readValue(message, Employee.class);
           logger.info("Employee is {}", emp);
    }
}
