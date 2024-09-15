package com.example.todo_api.repositoy.sample;

import org.springframework.stereotype.Repository;

@Repository
public class SampleRepository {
    public SampleRecord select() {
        return new SampleRecord("HelloWorld");
    }

}
