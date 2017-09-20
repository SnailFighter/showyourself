package com.chtm.myself.service;


/**
 * Created by snail on 17-6-19.
 */



import com.chtm.myself.dao.MyInfoDao;
import com.chtm.myself.entity.MyInfo;
import com.chtm.myself.interfaces.MyInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @auther cht
 * @create 2017-06-19-下午7:52
 * @
 */
@Service("myInfoService")
public class MyInfoServiceImplements  implements MyInfoService {

    @Autowired
    private MyInfoDao myInfoDao;

    @Override
    public MyInfo query(long id) {

        return myInfoDao.query(id);
    }

    @Override
    public boolean insert(MyInfo info) {

        return myInfoDao.insert(info);
    }

    @Override
    public boolean delete(long id) {

        return myInfoDao.delete(id);
    }

    @Override
    public boolean modify(MyInfo info) {
        return myInfoDao.modify(info);
    }
}
