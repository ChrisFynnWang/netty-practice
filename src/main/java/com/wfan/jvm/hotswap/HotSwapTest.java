package com.wfan.jvm.hotswap;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import org.junit.Test;


/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/6/26
 * @Other:
 */
public class HotSwapTest
{
    @Test
    public void testClassLoader()
        throws IOException
    {
        String className = Foo.class.getName();
        System.out.println(className);
        String fileName = className.substring(className.lastIndexOf(".") + 1) + ".class";
        InputStream is = getClass().getResourceAsStream(fileName);
        byte[] bytes = new byte[is.available()];
        HotSwapClassLoader loader = new HotSwapClassLoader();
        Class clazz = loader.loadByte(bytes);
        System.out.println(clazz.getName());
    }
}
