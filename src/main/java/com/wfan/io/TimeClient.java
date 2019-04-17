package com.wfan.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
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
public class TimeClient
{
    @Test
    public void blockIOTest()
        throws IOException
    {
        int port = 8080;
        Socket socket = null;
        BufferedReader in = null;
        PrintWriter out = null;
        try
        {
            socket = new Socket("127.0.0.1", port);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(), true);
            out.println("QUERY TIME ORDER");
            System.out.println("Send order 2 server success!");
            String resp = in.readLine();
            System.out.println("Now is " + resp);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            if (out != null)
            {
                out.close();
                out = null;
            }
            if (in != null)
            {
                in.close();
                in = null;
            }
            if (socket != null)
            {
                socket.close();
                socket = null;
            }
        }
    }

    @Test
    public void fakeBlockIOTest()
        throws IOException
    {
        int port = 8081;
        Socket socket = null;
        BufferedReader in = null;
        PrintWriter out = null;
        try
        {
            socket = new Socket("127.0.0.1", port);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(), true);
            out.println("QUERY TIME ORDER");
            System.out.println("Send order 2 server success!");
            String resp = in.readLine();
            System.out.println("Now is " + resp);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            if (out != null)
            {
                out.close();
                out = null;
            }
            if (in != null)
            {
                in.close();
                in = null;
            }
            if (socket != null)
            {
                socket.close();
                socket = null;
            }
        }
    }
}
