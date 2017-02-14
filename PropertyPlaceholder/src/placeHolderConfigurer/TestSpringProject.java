package placeHolderConfigurer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
			
			((AbstractApplicationContext)context).registerShutdownHook();
			Resturant resturantObj = (Resturant) context.getBean("resturantBean");
			resturantObj.greetCustomer();
		}
}
}