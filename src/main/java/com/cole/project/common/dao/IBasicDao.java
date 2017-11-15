package com.cole.project.common.dao;

import java.util.List;

/**
 * @author JiangFeng
 * @date 2017/11/14
 * @Description
 */
public interface IBasicDao<T>{
    List<T> getList(T vo);
    T getOne(long id);
    void insert(T vo);
    void insertBatch(List<T> vos);
    void delete(long id);
    void update(T vo);
}
