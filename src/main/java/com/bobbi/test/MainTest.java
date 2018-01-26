package com.bobbi.test;

import com.bobbi.domain.Student;
import com.bobbi.mapper.StudentMapper;
import com.bobbi.page.PageBean;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by bobbi on 18/1/26.
 */
public class MainTest {

    private ApplicationContext context;

    @Before
    public void init() {
        context = new ClassPathXmlApplicationContext("classpath*:spring-*.xml");
    }

//    @Test
//    public void testMapper() {
//        /* 获得mybatis的Student表的代理对象 */
//        StudentMapper mapper = context.getBean(StudentMapper.class);
//        /* 调用接口中的查询所有 */
//        List<Student> students = mapper.selectAll();
//        System.out.println(students);
//
//        int count = mapper.getTotalRecord();
//        System.out.println(count);
//
//        PageBean<Student> pageBean = new PageBean<>(1, 3, count);
//        System.out.println(mapper.pageSelect(pageBean));
//    }

//    @Test
//    public void testPageSelect() {
//        StudentMapper studentMapper = context.getBean(StudentMapper.class);
//        int total = studentMapper.getTotalRecord();
//        PageBean<Student> pageBean = new PageBean<>(1, 3, total);
//        Student student = new Student();
//        student.setSname("b");
//        pageBean.setParameter(student);
//        List<Student> students = studentMapper.pageSelect(pageBean);
//        System.out.println(students);
//    }

}
