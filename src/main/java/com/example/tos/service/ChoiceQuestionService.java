package com.example.tos.service;

import com.example.tos.pojo.Choicequsetion;

import java.util.List;

public interface ChoiceQuestionService {

    List<Choicequsetion> select();

    List<Choicequsetion> selectAt(int number);

    int insert(Choicequsetion choicequsetion);

    int update(Choicequsetion choicequsetion);

    int delete(int id);

}
