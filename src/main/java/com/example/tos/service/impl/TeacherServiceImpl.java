package com.example.tos.service.impl;

import com.example.tos.mapper.TeacherMapper;
import com.example.tos.pojo.Teacher;
import com.example.tos.result.CodeEnum;
import com.example.tos.result.TosException;
import com.example.tos.service.TeacherService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Resource
    private TeacherMapper teacherMapper;

    @Override
    public Teacher select(String id) {
        Teacher teacher = teacherMapper.getOneById(id);
        if (teacher == null) throw new TosException(CodeEnum.NoUserException);
        return teacher;
    }

    @Override
    public int insert(Teacher teacher) {
        Teacher s = teacherMapper.getOneById(teacher.getTid());
        if (s != null) {
            throw new TosException(CodeEnum.UserExistException);
        }
        return teacherMapper.insert(teacher);
    }

    @Override
    public int delete(String id) {
        int count = teacherMapper.delete(id);
        if (count == 0) throw new TosException(CodeEnum.NoUserException);
        return count;
    }

    @Override
    public int update(Teacher teacher) {
        int count = teacherMapper.update(teacher);
      //  if (count == 0) throw new TosException(CodeEnum.NoUserException);
        return count;
    }
}
