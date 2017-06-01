package com.cyyz.myfirst.dao;

/**
 * Created by jq.chen on 2017/6/1.
 */
interface BaseDao {
    /**
     * 添加一条新的记录
     * @param id
     * @param name
     * @param password
     */
    void save(int id,String name,String password);
    void update(int id,String name,String password);
    void delete(int id);
    String getName(int id);
    void test(String name);
}
