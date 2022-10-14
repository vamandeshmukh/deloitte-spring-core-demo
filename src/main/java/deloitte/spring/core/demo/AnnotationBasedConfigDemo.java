package deloitte.spring.core.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.AbstractApplicationContext;

@ComponentScan
public class AnnotationBasedConfigDemo {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AnnotationBasedConfigDemo.class);

		Employee emp = context.getBean(Employee.class);
		
		System.out.println(emp.toString());
		
		((AbstractApplicationContext) context).close();

	}

}
