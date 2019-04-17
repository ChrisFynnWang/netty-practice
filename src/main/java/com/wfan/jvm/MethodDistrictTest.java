package com.wfan.jvm;

import java.util.ArrayList;
import java.util.List;
import net.sf.cglib.proxy.Enhancer;
import org.junit.Test;


/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/6/23
 * @Other:
 */
public class MethodDistrictTest
{
/*    private static final List<Object> list = new ArrayList<>();

    static
    {
        for (int i = 0; i < Integer.MAX_VALUE; i++)
        {
            new Thread(new Runnable()
            {
                @Override
                public void run()
                {
                    for (int j = 0; j < Integer.MAX_VALUE; j++)
                    {
                        list.add(new Object());
                    }
                }
            });
        }
    }*/

    @Test
    public void runTimeConstant()
    {
        ArrayList<Object> list = new ArrayList<>();
        int num = 0;
        while (true)
        {
            list.add(String.valueOf(num++).intern());
        }
    }

    @Test
    public void javaMethodAreaOOM()
    {

    }

    public static void main(String[] args)
    {
        ArrayList<Object> list = new ArrayList<>();
        while (true)
        {
            list.add(new Object());
        }
    }
}
