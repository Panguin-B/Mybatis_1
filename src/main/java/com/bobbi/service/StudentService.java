package com.bobbi.service;

import com.bobbi.domain.BaseResult;
import com.bobbi.domain.Student;

import java.util.List;

/**
 * Created by bobbi on 18/1/26.
 */
public interface StudentService {
    List<Student> selectAll();

    /**
     * 分页查询
     * @return 包含total和data的结果封装对象
     * */
    BaseResult<Student> pageSelect(Student student,int pageIndex,int pageSize);
}
