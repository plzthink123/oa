package com.think123.oa.biz.impl;

import com.think123.oa.biz.DepartmentBiz;
import com.think123.oa.dao.DepartmentDao;
import com.think123.oa.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DepartmentBizImpl implements DepartmentBiz {
    @Qualifier("departmentDao")
    @Autowired
    private DepartmentDao departmentDao;
    public void add(Department department) {
        departmentDao.insert(department);
    }

    public void edit(Department department) {
        departmentDao.update(department);
    }

    public void remove(String sn) {
        departmentDao.delete(sn);
    }

    public Department get(String sn) {
        Department department = departmentDao.select(sn);
        return department;
    }

    public List<Department> getAll() {
        List<Department> list = departmentDao.selectAll();
        return list;
    }
}