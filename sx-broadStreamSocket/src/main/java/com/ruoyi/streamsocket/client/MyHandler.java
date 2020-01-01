package com.ruoyi.streamsocket.client;

import io.netty.channel.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class MyHandler extends ChannelInboundHandlerAdapter {

    private static Channel channel ;

    //数据库初始化
    public Connection initsql()
    {
        String Url = "jdbc:mysql://localhost:3306/iotdata?serverTimezone=UTC&useUnicode=true&characterEncoding=utf-8";//参数参考MySql连接数据库常用参数及代码示例
        String name = "root";//数据库用户名
        String psd = "hn123456Aa";//数据库密码
        String jdbcName = "com.mysql.cj.jdbc.Driver";//连接MySql数据库
        Connection con=null;
        try {
            Class.forName(jdbcName);//向DriverManager注册自己
            con = DriverManager.getConnection(Url, name, psd);//与数据库建立连接
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {//执行与数据库建立连接需要抛出SQL异常
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return con;
    }

    //读取服务端发送来的内容存入数据库
    @Override
    public void channelRead(ChannelHandlerContext channelHandlerContext, Object msg) throws Exception
    {

          String s=(String)msg;
          String[] str=s.split(",");
          System.err.println(s);
          String sql = "insert into iotdata(Ambient_temperature,ambient_humidity) values('"+str[1].toString()+"','"+str[3].toString()+"')";//数据库操作语句（插入）
          Connection con=initsql();
          PreparedStatement pst = con.prepareStatement(sql);//用来执行SQL语句查询，对sql语句进行预编译处理
          pst.executeUpdate();//解释在下

    }

}

