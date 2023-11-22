package com.jzy.test.jsp.test2_TCP;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author l
 */
public class Client {
    public static void main(String[] args) throws IOException {
        // TCP协议，发送数据

        // 1.创建Socket对象
        // [注]创建对象时会连接服务端
        // 如果连接不上，会报错
        // 三次握手协议保证连接建立
        Socket socket = new Socket("127.0.0.1", 10000);

        // 2.可以从连接通道中获取输出流
        OutputStream outputStream = socket.getOutputStream();

        // 3.写出数据
        outputStream.write("你好，世界！".getBytes());

        // 3.释放资源
        // 四次挥手，利用这个协议断开连接，而且保证连接通道里面的数据已经处理完毕了
        outputStream.close();
        socket.close();
    }
}
