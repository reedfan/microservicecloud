package com.reed.ustc.service;

import com.reed.ustc.pojo.Dept;

import java.util.List;

/**
 * created by reedfan on 2019/1/12 0012
 */
public interface DeptService {
    public boolean add(Dept dept);
    public Dept    get(Long id);
    public List<Dept> list();
}
