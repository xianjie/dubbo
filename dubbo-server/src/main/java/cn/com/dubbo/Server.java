package cn.com.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Title: Server
 * @Description:
 * @author: xian jie
 * @date: 2016-3-31 14:56
 * 杭州尚尚签网络科技有限公司
 * @version: 2.0
 */
public class Server {

    // 服务启动类，发布服务

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"dubbo-provider.xml"});
        context.start();
        System.in.read(); // 按任意键退出
    }
}
