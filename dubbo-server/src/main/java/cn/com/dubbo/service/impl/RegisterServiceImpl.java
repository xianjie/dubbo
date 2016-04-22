package cn.com.dubbo.service.impl;

import cn.com.dubbo.model.User;
import cn.com.dubbo.service.RegisterService;

/**
 * @Title: RegisterServiceImpl
 * @Description:
 * @author: xian jie
 * @date: 2016-3-31 14:54
 * 杭州尚尚签网络科技有限公司
 * @version: 2.0
 */
public class RegisterServiceImpl implements RegisterService {

    /**
     * 注册
     * @param name
     * @param password
     * @return
     */
    public User createUser(String name, String password) {
        User user = new User();
        user.setId(2);
        user.setName(name);
        user.setPassword(password);
        return user;
    }
}
