package com.wfan.jvm.action;

import java.io.File;
import java.lang.management.ClassLoadingMXBean;
import java.lang.management.ManagementFactory;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;


/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/6/29
 * @Other:
 */
public class OOMTest
{
    private static int count = 0;

    public static void main(String[] args)
    {
        try
        {
            //准备url
            URL url = new File("E:/classes").toURI().toURL();
            URL[] urls = {url};
            //获取有关类型加载的JMX接口
            ClassLoadingMXBean loadingBean = ManagementFactory.getClassLoadingMXBean();
            //用于缓存类加载器
            List<ClassLoader> classLoaders = new ArrayList<ClassLoader>();
            List<Class> classList = new ArrayList<>();
            while (true)
            {
                //加载类型并缓存类加载器实例
                ClassLoader classLoader = new URLClassLoader(urls);
                classLoaders.add(classLoader);
                Class<?> classA = classLoader.loadClass("ClassA");
                classList.add(classA);
                //显示数量信息（共加载过的类型数目，当前还有效的类型数目，已经被卸载的类型数目）
                System.out.println("total: " + loadingBean.getTotalLoadedClassCount());
                System.out.println("active: " + loadingBean.getLoadedClassCount());
                System.out.println("unloaded: " + loadingBean.getUnloadedClassCount());
                count++;
//                if (count == 1000)
//                {
//                    break;
//                }
            }
//            System.out.println(classList.get(0) == classList.get(1));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
