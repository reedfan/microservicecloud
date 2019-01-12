package com.reed.ustc.dao;

import com.reed.ustc.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * created by reedfan on 2019/1/12 0012
 */

@Mapper
public interface DeptDao {
    public boolean addDept(Dept dept);

    public Dept findById(Long id);
    public List<Dept> findAll();

}
