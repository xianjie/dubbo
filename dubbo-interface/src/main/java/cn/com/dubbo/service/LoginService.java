package cn.com.dubbo.service;

import cn.com.dubbo.model.User;

/**
 * @Title: LoginService
 * @Description:
 * @author: xian jie
 * @date: 2016/3/31 16:33
 * 杭州尚尚签网络科技有限公司
 * @version: 2.0
 */
public interface LoginService {

    public User login(String name, String psw);
}
