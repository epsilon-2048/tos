package com.example.tos.service.impl;

import com.example.tos.mapper.FillQuestionMapper;
import com.example.tos.pojo.Fillquestion;
import com.example.tos.result.CodeEnum;
import com.example.tos.result.TosException;
import com.example.tos.service.FillQuestionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;

@Service
public class FillQuestionServiceImpl implements FillQuestionService {

    @Resource
    private FillQuestionMapper fillQuestionMapper;

    @Override
    public List<Fillquestion> select() {
        return fillQuestionMapper.getListAll();
    }

    @Override
    public List<Fillquestion> selectAt(int number) {
        List<Fillquestion> fillquestions = fillQuestionMapper.getListAll();
        List<Fillquestion> fillquestionList = new ArrayList<>(number+1);
        int size = fillquestions.size();
        if (size < number) throw new TosException(CodeEnum.NoEnough);
        Set<Integer> set = new HashSet<Integer>();
        Random random = new Random(47);
        int cc = 0;
        while (true) {
            int n = random.nextInt(number);
            if (!set.contains(n)) {
                set.add(n);
                fillquestionList.add(fillquestions.get(n));
                cc++;
            }
            if (cc == number) break;
        }
        return fillquestionList;
    }

    @Override
    public int insert(Fillquestion fillquestion) {
        return fillQuestionMapper.insert(fillquestion);
    }

    @Override
    public int update(Fillquestion fillquestion) {
        int count = fillQuestionMapper.update(fillquestion);
        //if (count == 0) throw new TosException(CodeEnum.NoUserException);
        return count;
    }

    @Override
    public int delete(int id) {
        int count = fillQuestionMapper.delete(id);
        if (count == 0) throw new TosException(CodeEnum.NoUserException);
        return count;
    }
}
