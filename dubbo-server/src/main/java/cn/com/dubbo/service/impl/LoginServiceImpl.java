package cn.com.dubbo.service.impl;

import cn.com.dubbo.model.User;
import cn.com.dubbo.service.LoginService;

/**
 * @Title: LoginServiceImpl
 * @Description:
 * @author: xian jie
 * @date: 2016-3-31 14:53
 * 杭州尚尚签网络科技有限公司
 * @version: 2.0
 */
public class LoginServiceImpl implements LoginService {

    /**
     * 登录
     * @param name
     * @param psw
     * @return
     */
    public User login(String name, String psw) {
        User user = null;
        if (name.equals("root") && psw.equals("123456")) {
            user = new User();
            user.setId(1);
            user.setName("root");
        }
        return user;
    }
}
