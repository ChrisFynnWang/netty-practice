package com.wfan.nio;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import org.junit.Test;


/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/6/9
 * @Other:
 */
public class NioTest
{
    @Test
    public void nioTest()
        throws IOException
    {
        int port = 8080;
        ServerSocketChannel server = ServerSocketChannel.open();
        server.socket().bind(new InetSocketAddress(port));
        server.configureBlocking(false);
        Selector selector = Selector.open();
        selector.select();
        selector.select(10000);
    }
}
