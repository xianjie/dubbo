package cn.com.dubbo.service;

import cn.com.dubbo.model.User;

/**
 * @Title: RegisterService
 * @Description:
 * @author: xian jie
 * @date: 2016/3/31 16:36
 * 杭州尚尚签网络科技有限公司
 * @version: 2.0
 */
public interface RegisterService {

    public User createUser(String name, String psw);

}
