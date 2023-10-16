package com.course.kafkaproducer;

import com.course.kafkaproducer.entity.Employee;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.time.LocalDate;

@SpringBootApplication
//@EnableScheduling
public class KafkaProducerApplication implements CommandLineRunner {

//	@Autowired
//	private HelloKafkaProducer helloKafkaProducer;

//	@Autowired
//	private KafkaKeyProducer kafkaKeyProducer;

	@Autowired
	private EmployeeJsonProducer employeeJsonProducer;

	public static void main(String[] args) {
		SpringApplication.run(KafkaProducerApplication.class, args);
	}

	//@Override
//	public void run(String... args) throws Exception {
//	  helloKafkaProducer.sendHello("Timotius" + Math.random());
//	}


//	@Override
//	public void run(String... args) throws Exception {
//		for (int i = 0; i < 30; i++) {
//			var key = "key-" + (i % 4);
//			var data = "data " + i + " with key " + key;
//			kafkaKeyProducer.send(key, data);
//
//			Thread.sleep(500);
//		}
//	}


	@Override
	public void run(String... args) throws Exception {
		for (int i = 0; i < 5; i++) {
			var employee = new Employee("emp-"+ i, "Employee " + i, LocalDate.now().toString());
			employeeJsonProducer.sendMessage(employee);
		}

	}
}
