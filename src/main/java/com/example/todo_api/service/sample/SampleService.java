package com.example.todo_api.service.sample;

import com.example.todo_api.repositoy.sample.SampleRecord;
import com.example.todo_api.repositoy.sample.SampleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SampleService {

    private final SampleRepository repository;
    public SamleEntity find() {
        var record = repository.select();
        return new SamleEntity(record.getContent());
    }
}
