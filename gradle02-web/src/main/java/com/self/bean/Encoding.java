package com.self.bean;

/**
 * @author ：lrns1
 * @date ：Created in 2023年05月02日
 * @description ：
 * @version: 1.0
 */
//可以使用此方法测试自己的idea编码格式
import java.nio.charset.Charset;
import java.util.Properties;

public class Encoding {
    public static void main(String[] args) {
//        file.encoding=GBK
//        ServletContextListener
        Properties properties = System.getProperties();
        properties.list(System.out);
//        System.setProperty("file.encoding","UTF-8");
        System.out.println("====================================");
        properties.list(System.out);
        System.out.println(Charset.defaultCharset().name());
    }
}
