package com.wfan.jvm.classload;

import java.io.IOException;
import java.io.InputStream;


/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/6/26
 * @Other:
 */
public class ClassLoaderTest
{
    public static void main(String[] args)
        throws ClassNotFoundException, IllegalAccessException, InstantiationException
    {
        ClassLoader myLoader = new ClassLoader()
        {
            @Override
            public Class<?> loadClass(String name)
                throws ClassNotFoundException
            {
                try
                {
                    String fileName = name.substring(name.lastIndexOf(".") + 1) + ".class";
                    InputStream is = getClass().getResourceAsStream(fileName);
                    if (is == null)
                    {
                        return super.loadClass(name);
                    }

                    byte[] bytes = new byte[is.available()];
                    is.read(bytes);
                    return defineClass(name, bytes, 0, bytes.length);
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                    throw new ClassNotFoundException();
                }

            }

            ClassLoader getClassLoader0()
            {
                return null;
            }
        };
        Object obj = myLoader.loadClass("com.wfan.jvm.classload.ClassLoaderTest").newInstance();
        ClassLoader cl = ClassLoaderTest.class.getClassLoader();
        System.out.println(obj.getClass().getClassLoader());
        System.out.println(obj instanceof com.wfan.jvm.classload.ClassLoaderTest);
    }
}
