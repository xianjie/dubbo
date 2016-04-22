package cn.com.dubbo;

import cn.com.dubbo.model.User;
import cn.com.dubbo.service.LoginService;
import cn.com.dubbo.service.RegisterService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Title: Client
 * @Description:
 * @author: xian jie
 * @date: 2016/3/31 15:05
 * 杭州尚尚签网络科技有限公司
 * @version: 2.0
 */
public class Client {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"dubbo-consumer.xml"});
        context.start();

        LoginService loginService = (LoginService) context.getBean("loginService"); // 获取远程服务代理
        User user = loginService.login("root", "123456");

        System.out.println(user.getId() + " " + user.getName()); // 显示调用结果

        RegisterService registerService = (RegisterService) context.getBean("registerService");
        User user2 = registerService.createUser("root", "123456");
        System.out.println(user2.getId() + " " + user2.getName()); // 显示调用结果
    }
}
