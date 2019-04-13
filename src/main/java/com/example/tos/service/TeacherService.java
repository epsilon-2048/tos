package com.example.tos.service;

import com.example.tos.pojo.Teacher;

public interface TeacherService {
    Teacher select(String id);

    int insert(Teacher teacher);

    int delete(String id);

    int update(Teacher teacher);

}
