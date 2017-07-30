package com.springmvc.core.service;

import com.springmvc.core.dao.MyDaoImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

/**
 * Created by Administrator on 2017/7/30.
 */

@Service("myService")
public class MyServiceImpl {

    @Resource(name="myDao")
    private MyDaoImpl myDao;

    /**
     * 获取当前时间
     * @param param
     * @return
     */
    public Map getNowData(Map<String,Object> param){
        return myDao.getNowData(param);
    }

}
