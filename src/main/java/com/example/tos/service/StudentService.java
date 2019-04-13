package com.example.tos.service;

import com.example.tos.pojo.Student;

public interface StudentService {

    Student select(String id);

    int insert(Student student);

    int delete(String id);

    int update(Student student);

}
