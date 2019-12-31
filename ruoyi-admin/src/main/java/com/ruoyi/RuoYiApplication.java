package com.ruoyi;


import com.ruoyi.server.CheckServer;
import com.ruoyi.iot.domain.receivedata;
import com.ruoyi.iot.domain.senddata;
import com.ruoyi.streamsocket.client.NettyClient;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;

import java.net.InetSocketAddress;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * 启动程序
 *
 * @author ruoyi
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@MapperScan({"com.ruoyi.*.mapper"})
// 监听器
@ServletComponentScan(value = "com.ruoyi.streamsocket.listener")
public class RuoYiApplication implements CommandLineRunner {
    @Autowired
    CheckServer checkServer;

    public static void main(String[] args) {

//        String Url = "jdbc:mysql://localhost/test";//参数参考MySql连接数据库常用参数及代码示例
//        String name = "root";//数据库用户名
//        String psd = "hn123456Aa";//数据库密码
//        String jdbcName = "com.mysql.cj.jdbc.Driver";//连接MySql数据库
//        String sql = "insert into iotdata values(s)";//数据库操作语句（插入）
//        try {
//            Class.forName(jdbcName);//向DriverManager注册自己
//            Connection con = DriverManager.getConnection(Url, name, psd);//与数据库建立连接
//            PreparedStatement pst = con.prepareStatement(sql);//用来执行SQL语句查询，对sql语句进行预编译处理
//            pst.setString(1, "nonono");
//            pst.setInt(2, 123123213);
//            pst.executeUpdate();//解释在下
//        } catch (ClassNotFoundException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        } catch (SQLException e) {//执行与数据库建立连接需要抛出SQL异常
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    new NettyClient().start();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
          SpringApplication.run(RuoYiApplication.class, args);


    }

    @Override
    public void run(String... strings) throws Exception {
        InetSocketAddress address = new InetSocketAddress("127.0.0.1", 8888);
        checkServer.run(address);
    }
}