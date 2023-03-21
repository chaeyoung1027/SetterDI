package kr.hs.study;

import kr.hs.study.beans.TestBean1;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

        TestBean1 obj1 = ctx.getBean("t1", TestBean1.class);
        System.out.println("data1 : "+obj1.getData1());

        TestBean1 obj2 = ctx.getBean("t2", TestBean1.class);
        System.out.println("data2 : "+obj2.getData2());

        TestBean1 obj3 = ctx.getBean("t3", TestBean1.class);
        System.out.println("data3 : "+obj3.isData3());

        TestBean1 obj4 = ctx.getBean("t4", TestBean1.class);
        System.out.println("data4 : "+obj4.getData4());
        ctx.close();
    }
}