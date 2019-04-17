package com.wfan.jvm.hotswap;

/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/6/26
 * @Other:
 */
public class HotSwapClassLoader extends ClassLoader
{
    public HotSwapClassLoader()
    {
        super(HotSwapClassLoader.class.getClassLoader());
    }

    public Class loadByte(byte[] classBytes)
    {
        return defineClass(null, classBytes, 0, classBytes.length);
    }
}
