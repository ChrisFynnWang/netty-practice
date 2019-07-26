package com.wfan.goldenTolwer;

import com.wfan.anos.Bird;
import com.wfan.anos.BirdNet;
import com.wfan.anos.Desc;
import com.wfan.anos.Desc.Color;
import com.wfan.enums.Const;
import com.wfan.enums.LargerConst;
import com.wfan.goldenTolwer.Comparer.PublicComparer;
import com.wfan.multiThread.MultiThread;
import com.wfan.multiThread.RunnableThread;
import com.wfan.proxy.RealSubject;
import com.wfan.proxy.Subject;
import com.wfan.proxy.SubjectHandler;
import com.wfan.proxy.Utils;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.zip.DataFormatException;
import org.junit.Test;

/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/3/2
 * @Other:
 */
public class GoldenTower {

    public static final int BASE_NUM = 65;
    public static final int RANGE_NUM = 26;


    @Test
    public void goldenTest() {

        Scanner sc = new Scanner(System.in);
        int a = 30;
        int b = 1;
        for (int i = a; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.printf(" ");
            }
            for (int k = 0; k < b; k++) {
                System.out.printf("*");
            }
            b += 2;
            System.out.println();
        }
    }

    @Test
    public void mudleTest() {
        int a = -10;
        int b = 2;
        System.out.println(a % b);
    }

    @Test
    public void intTest() {
//        System.out.println(10.00 - 9.60);
//        System.out.println((double)(1111 / 100));
//        BigDecimal bd = new BigDecimal(1.1);
//        System.out.println(bd);
        System.out.println(Math.pow(2, 3));
    }

    @Test
    public void listTest() {
//        Integer i = new Integer(1);
//        Integer j = new Integer(2);
//        System.out.println(i == j);
//        System.out.println(i < j);
//        System.out.println(i > j);
        System.out.println(Integer.valueOf(1));
        System.out.println(new String("1").intern() == (new String("1").intern()));
    }

    @Test
    public void arrayTest() {
        List<Object> objects = Arrays.asList();
        objects.add(1);
        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(1);
        System.out.println(arrayList);
        HashSet<Object> hashSet = new HashSet<>();
//        hashSet.add(new Integer(11111));
//
        hashSet.add("111");
        hashSet.add("111");
        System.out.println(hashSet.size());

        int[] intArray = new int[100];
        System.out.println(intArray.getClass());
    }

    @Test
    public void orderTest() {
        new Extend();
    }

    @Test
    public void comparerTest() {

        List<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < 100; i++) {
            Random random = new Random();
            int i1 = random.nextInt(100);
            arrayList.add(i1);
        }
        System.out.println(arrayList);
        List<Integer> copyList = new ArrayList<>(arrayList);
        System.out.println(copyList.equals(arrayList));
        Collections.sort(arrayList, new PublicComparer());
        System.out.println(arrayList);
        System.out.println(copyList.equals(arrayList));
    }

    @Test
    public void binarySearchTest() {
        List arrayList = getIntegerList(100);
        Collections.sort(arrayList, new PublicComparer());
//        MyCollections.reverse(arrayList);
        System.out.println(arrayList);
        int index = Collections.binarySearch(arrayList, 2);
        System.out.println(index);
        System.out.println(arrayList);
        arrayList.subList(1, 2);
    }

    @Test
    public void readOnlyTest() {

        List<Object> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
        }
        List<Object> subList = arrayList.subList(1, 6);
        System.out.println(subList);
        boolean add = subList.add(10);
        System.out.println(add);
        System.out.println(arrayList);
//        System.out.println(subList instanceof AbstractList);
//        arrayList = MyCollections.unmodifiableList(arrayList);
//        System.out.println(subList);

        Employee go = new Employee("go", 11);
        System.out.println(go);
    }

    @Test
    public void employeeTest() {

        Employee leBron = new Employee("LeBron", 2);
        Employee bryant = new Employee("Bryant", 3);
        Employee wade = new Employee("Wade", 4);
        Employee kenvin = new Employee("Kenvin", 6);
        Employee steve = new Employee("Steve", 7);
        Employee chris = new Employee("Chris", 8);
        Employee wang = new Employee("Wada", 4);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(leBron);
        employeeList.add(bryant);
        employeeList.add(wade);
        employeeList.add(kenvin);
        employeeList.add(steve);
        employeeList.add(chris);
        employeeList.add(wang);
        Collections.sort(employeeList);
        Collections.reverse(employeeList);
        System.out.println(employeeList);
    }

    @Test
    public void setTest() {
        List<Object> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        List<Object> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        //并集
//        boolean b = list1.addAll(list2);
        //交集
//        list1.retainAll(list2);
        //差集
//        list1.removeAll(list2);

        //无重复的并集
        list2.removeAll(list1);
        list1.addAll(list2);
        System.out.println(list1);
    }

    @Test
    public void shuffleTest() {
        int i;
        int j;
        int k = 0;
        i = j = 0;
        List integerList = getIntegerList(123);
        System.out.println(integerList);
        Collections.shuffle(integerList);
        System.out.println(integerList);
    }


    public List getIntegerList(int size) {
        List<Integer> arrayList = new ArrayList<Integer>();
        int i1 = 0;
        for (int i = 0; i < size; i++) {
            Random random = new Random();
            i1 = random.nextInt(size);
            while (arrayList.contains(i1)) {
                i1 = random.nextInt(size);
            }
            arrayList.add(i1);
        }
        return arrayList;
    }

    @Test
    public void enumTest() {
        int size = 67;
        Random random = new Random();
        List<String> arrayList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            String str = "";
            while (true) {
                char left = getRandomChar(random);
                char right = getRandomChar(random);
                str = Character.toString(left) + Character.toString(right);
                if (!arrayList.contains(str)) {
                    arrayList.add(str);
                    break;
                }
            }
        }
        System.out.println(arrayList);
    }

    @Test
    public void enumSetTest() {
        EnumSet<Const> cs = EnumSet.allOf(Const.class);
        EnumSet<LargerConst> lsc = EnumSet.allOf(LargerConst.class);
        System.out.println(Const.AA.ordinal());
    }

    public void f(Long l) {

    }

    @Test
    public void anoTest() {
        Bird bird = BirdNet.Sparrow.reproduce();
        Color color = bird.getColor();
        System.out.println(color);
    }


    @Test
    public void genericTest() {
        List<Integer> list = new ArrayList();
    }

    @Test
    public void proxyTest() {
        Subject subject = new RealSubject();
        InvocationHandler handler = new SubjectHandler(subject);
        ClassLoader classLoader1 = handler.getClass().getClassLoader();
        ClassLoader classLoader = subject.getClass().getClassLoader();
        Subject o = (Subject) Proxy
            .newProxyInstance(classLoader, subject.getClass().getInterfaces(), handler);
        o.request();
    }

    @Test
    public void typeTest() {
        Type subject = Subject.class.getGenericSuperclass();

//        String typeName = subject.getTypeName();
        System.out.println(subject instanceof ParameterizedType);

    }

    @Test
    public void exceptionTest() {
        int i1 = doStaff(-1);
        System.out.println(i1);
        int i100 = doStaff(100);
        System.out.println(i100);
    }

    @Test
    public void exceptionTestNoParams() {

//        int i = doStaff();
//        System.out.println(i);
//        System.out.println(doStaff3());
        try {
            System.out.println(doStaff4());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void stackTraceTest() {
        stachTest();
    }

    @Test
    public void StackTraceTest() {
        stachTest();
    }

    @Test
    public void multiThreadTest() {

        System.out.println(Thread.currentThread().getName());
        Thread multiThread = new MultiThread();
        multiThread.start();
        System.out.println(MultiThread.currentThread().getName());
    }

    @Test
    public void stopThreadTest() throws InterruptedException {
        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    //子线程静止1秒
//                    Thread.sleep(1000);
//                    while (true) {
//                        System.out.println("sub Thread");
//                    }
                } catch (Exception e) {
                    System.out.println("不會執行");
                }
            }
        };
        thread.start();
        Thread.sleep(10000);
        Thread.currentThread().stop();
    }

    @Test
    public void runnableThreadTest() {
        RunnableThread t = new RunnableThread();
        Thread t1 = new Thread(t);
        t1.start();
        for (int i = 0; i < 5; i++) {
            new Thread(t).start();
        }
        t1.stop();
    }


    @Test
    public void threadTest() {
        Thread thread = new Thread() {
            public void run() {
                while (true) {
                    System.out.println("run");
                }
            }
        };
        thread.start();
        System.out.println(thread.isInterrupted());
//        thread.interrupt();
        System.out.println(thread.isInterrupted());

    }

    public void stachTest() {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        for (StackTraceElement st : stackTrace) {
            System.out.print(st.getMethodName() + "  ");
            System.out.println(st.getMethodName().equals("stackTraceTest"));
        }
    }


    public char getRandomChar(Random random) {
        int i = BASE_NUM + random.nextInt(RANGE_NUM);
        return (char) i;
    }


    public int doStaff(int p) {
        try {
            if (p <= -1) {
                throw new DataFormatException();
            } else {
                return p;
            }
        } catch (DataFormatException e) {
            throw e;
        } finally {
            return -1;
        }
    }

    public int doStaff() {
        try {
            return 1;
        } catch (Exception e) {

        } finally {
            return -1;
        }
    }

    public int doStaff3() {
        try {
            throw new Exception();
        } catch (Exception e) {
            return 1;
        } finally {
            return -1;
        }
    }

    public int doStaff4() throws Exception {
        try {
            throw new Exception();
        } finally {
            return -1;
        }
    }

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        ThreadPoolExecutor threadPoolExecutor = ThreadPoolExecutor.class.newInstance();
    }
}
