package com.xiangxue.jack.test;

import com.xiangxue.jack.bean.Student;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

	@Test
	public void test1() {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		Student student = (Student)applicationContext.getBean("student");
		System.out.println(student.getUsername());
	}
}
