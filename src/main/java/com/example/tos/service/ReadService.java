package com.example.tos.service;

import com.alibaba.excel.metadata.BaseRowModel;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface ReadService {

    List<Object> excelReadService(MultipartFile file, Class<? extends BaseRowModel> clazz);
}
