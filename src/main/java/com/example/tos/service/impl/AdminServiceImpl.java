package com.example.tos.service.impl;

import com.example.tos.mapper.AdminMapper;
import com.example.tos.pojo.Administrator;
import com.example.tos.result.CodeEnum;
import com.example.tos.result.TosException;
import com.example.tos.service.AdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AdminServiceImpl implements AdminService {

    @Resource
    private AdminMapper adminMapper;

    @Override
    public int update(Administrator administrator) {
        int count = adminMapper.update(administrator);
/*        if (count == 0){
            throw new TosException(CodeEnum.NoUserException);
        } else*/
            return count;
    }

    @Override
    public Administrator select(String id) {
        Administrator administrator = adminMapper.getOneById(id);
        if (administrator == null)
            throw new TosException(CodeEnum.NoUserException);
        else
            return administrator;
    }
}
