package com.cyyz.myfirst.dao;

/**
 * Created by jq.chen on 2017/6/1.
 */
interface BaseDao {
    /**
     * 添加一条新的记录
     * @param id 用户ID
     * @param name 用户名称
     * @param password 用户密码
     */
    void save(int id,String name,String password);
    void update(int id,String name,String password);
    void delete(int id);
    String getName(int id);
    void test(String name);
}
