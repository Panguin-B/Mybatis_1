package com.bobbi.service.impl;

import com.bobbi.domain.BaseResult;
import com.bobbi.domain.Student;
import com.bobbi.mapper.StudentMapper;
import com.bobbi.page.PageBean;
import com.bobbi.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by bobbi on 18/1/26.
 */
@Service("studentService")
public class StudentServiceImpl implements StudentService {
    /* service层调用持久层的接口对象声明 */
    @Resource
    private StudentMapper mapper;

    @Override
    public List<Student> selectAll() {
        return mapper.selectAll();
    }

    @Override
    public BaseResult<Student> pageSelect(Student student,int pageIndex, int pageSize) {
        BaseResult<Student> result = new BaseResult<>();
        int total = mapper.getTotalRecord(student);
        PageBean<Student> pageBean = new PageBean<>(pageIndex+1,pageSize,total);
        // 更新分页查询中的参数
        pageBean.setParameter(student);
        List<Student> datas = mapper.pageSelect(pageBean);
        result.setTotal(total);
        result.setData(datas);
        return result;
    }
}
