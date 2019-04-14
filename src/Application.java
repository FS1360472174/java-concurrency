/*
 * Application.java
 * Copyright fangzhang all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fs.jackson.Address;
import com.fs.jackson.AddressByLombok20;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

/**
 * @author cnstonefang@gmail.com
 */
@SpringBootApplication(scanBasePackages = "com.fs")
public class Application implements CommandLineRunner {
    @Override
    public void run(final String... args) throws Exception {
        testSeriable();
    }
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    private void testSeriable() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        Address address = Address.builder().build();
        address.setId(1L).setAddress("address");
        AddressByLombok20 lombok20 = AddressByLombok20.builder().build();
        String value = objectMapper.writeValueAsString(address);
        try {
            objectMapper.readValue(value, Address.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
