package cn.com.dubbo.model;

import java.io.Serializable;

/**
 * @Title: User
 * @Description:
 * @author: xian jie
 * @date: 2016-3-31 14:53
 * 杭州尚尚签网络科技有限公司
 * @version: 2.0
 */
public class User implements Serializable {

    private int id;
    private String name;
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
