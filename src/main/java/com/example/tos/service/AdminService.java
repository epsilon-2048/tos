package com.example.tos.service;

import com.example.tos.pojo.Administrator;

public interface AdminService {

    int update(Administrator administrator);
    Administrator select(String id);
}
