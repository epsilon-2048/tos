package com.example.tos;

import com.example.tos.mapper.*;
import com.example.tos.pojo.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TosApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Resource
    private TeacherMapper teacherMapper;

    @Resource
    private StudentMapper studentMapper;

    @Resource AdminMapper adminMapper;

    @Resource
    private ChoicequsetionMapper choicequsetionMapper;

    @Test
    public void testInsert() throws Exception {
 /*       int i = teacherMapper.insert(
                new Teacher("4","chen","男","2505", "123","sh", "2016" ));
        System.out.println(i);*/
        int i = studentMapper.insert(
                new Student("4","chen","男","2505", "123","sh", "2016" ));
        System.out.println(i);
        i = studentMapper.insert(
                new Student("3","chen","男","2505", "123","sh", "2016" ));
        System.out.println(i);
    }

    @Test
    public void testDelete() throws Exception {
        /*int i = teacherMapper.delete("3");
        System.out.println(i);*/
        int i = studentMapper.delete("3");
        System.out.println(i);
    }
    @Test
    public void testUpdate() throws Exception {
        /*int i = teacherMapper.update(new Teacher("4","cai","男","2505", "123","sh", "2016" ));
        System.out.println(i);*/
        int i = studentMapper.update(new Student("4","cai","男","2505", "123","sh", "2016" ));
        System.out.println(i);
    }

    @Test
    public void testGetOneById() throws Exception {
/*         Teacher teacher = teacherMapper.getOneById("5");
         if (teacher != null)
             System.out.println(teacher.toString());
         else
             System.out.println("没有这个id");*/
        Student student = studentMapper.getOneById("4");
        if (student != null)
            System.out.println(student.toString());
        else
            System.out.println("没有这个id");
    }

    @Test
    public void adminTestGetOneById() throws Exception {
        Administrator administrator = adminMapper.getOneById("1");
        if( administrator == null )
            System.out.println("null");
        else System.out.println(administrator);

    }

    @Test
    public void adminTestUpdate() throws Exception {
        Administrator administrator = new Administrator("1","大大佬","男","123456789","123", "123456789");
        adminMapper.update(administrator);
    }

    @Resource
    FillQuestionMapper fillQuestionMapper;
    @Test
    public void fillTestInsert() throws Exception {

        int i = fillQuestionMapper.insert(new Fillquestion("012345_7890,差什么啊？","6"));
        System.out.println(i);
    }

    @Test
    public void  fillTestUpdate() throws Exception {
        Fillquestion fillquestion = new Fillquestion(1,"0123_56789,差什么？","4");
        fillQuestionMapper.update(fillquestion);
    }

    @Test
    public void fillTestSelete() throws Exception {
        List<Fillquestion> fillquestionList = fillQuestionMapper.getListFormAtoB(0,5);
        for (Fillquestion fillquestion :
             fillquestionList) {
            System.out.println(fillquestion);
        }
    }

    @Test
    public void fillTestDelete() throws Exception {
        int i = fillQuestionMapper.delete(3);
        System.out.println(i);
    }

    @Test
    public void ChoiceTestSelete() throws Exception {
        List<Choicequsetion> choicequsetionList = choicequsetionMapper.getListAll();
        for (Choicequsetion choicequsetion :
                choicequsetionList) {
            System.out.println(choicequsetion);
        }
    }
}

