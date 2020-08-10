package cn.liwenshuo.service;

import cn.liwenshuo.mapper.UserMapper;
import cn.liwenshuo.pojo.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public user queryUserById(Long id){
        return this.userMapper.selectByPrimaryKey(id);
    }

    @Transactional
    public void deleUserById(Long id) {
        this.userMapper.deleteByPrimaryKey(id);
    }
}
