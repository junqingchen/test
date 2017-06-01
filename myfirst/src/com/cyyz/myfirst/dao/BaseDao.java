package com.cyyz.myfirst.dao;

/**
 * Created by jq.chen on 2017/6/1.
 */
interface BaseDao {
    void save(int id,String name,String password);
    void update(int id,String name,String password);
}
