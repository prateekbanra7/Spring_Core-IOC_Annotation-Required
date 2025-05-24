package in.abc.Test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.abc.bean.Robot;


public class ClientApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("in/abc/cfg/applicationContext.xml");
		Robot robot = applicationContext.getBean("robot", Robot.class);
		System.out.println(robot);
		
		applicationContext.close();		
	}
}
