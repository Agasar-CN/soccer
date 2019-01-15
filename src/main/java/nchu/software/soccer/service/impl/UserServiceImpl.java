package nchu.software.soccer.service.impl;

import nchu.software.soccer.dao.UserDao;
import nchu.software.soccer.entity.User;
import nchu.software.soccer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
    @Override
    //@Transactional(rollbackFor = Exception.class)
    public List<User> selectUser() {
        return userDao.selectUser();
    }
}
