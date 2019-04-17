package com.wfan.io;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import org.junit.Test;


/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/6/8
 * @Other:
 */
public class TimeServer
{
    @Test
    public void blockIOTest()
        throws IOException
    {
        String[] args = null;
        int port = 8080;
        if (args != null && args.length > 0)
        {
            try
            {
                port = Integer.valueOf(args[0]);
            }
            catch (Exception e)
            {

            }
        }
        ServerSocket server = null;
        try
        {
            server = new ServerSocket(port);
            Socket socket = null;
            while (true)
            {
                socket = server.accept();
                new Thread(new TimeServerHandler(socket)).start();
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            if (server != null)
            {
                server.close();
            }
        }
    }

    @Test
    public void fakeBlockIOTest()
        throws IOException
    {
        int port = 8081;
        ServerSocket server = null;
        try
        {
            server = new ServerSocket(port);
            Socket socket = null;
            TimeServerHandlerExecutePool executePool = new TimeServerHandlerExecutePool(
                50, 1000);
            while (true)
            {
                socket = server.accept();
                executePool.execute(new TimeServerHandler(socket));
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            if (server != null)
            {
                server.close();
            }
        }
    }
}
