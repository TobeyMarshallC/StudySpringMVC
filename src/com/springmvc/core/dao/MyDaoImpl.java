package com.springmvc.core.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * Created by Administrator on 2017/7/30.
 */
@Repository("myDao")
public class MyDaoImpl {

    @Autowired
    public JdbcTemplate jdbcTemplate;

    /**
     * 获取当前时间
     * @param param
     * @return
     */
    public Map getNowData(Map<String,Object> param){
        try{
            String sql = "SELECT to_char(SYSDATE,'YYYY-MM-DD HH24:MI:SS') Now_date FROM dual";
            return jdbcTemplate.queryForMap(sql);
        }catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

}
