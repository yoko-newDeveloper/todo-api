package com.example.todo_api.service.sample;

import org.springframework.stereotype.Service;

@Service
public class SampleService {
    public SamleEntity find() {
        return new SamleEntity("Hello");
    }
}
