package deloitte.spring.core.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @author Vaman
 * 
 *         Document Link:
 * 
 *         https://docs.google.com/document/d/1gjd0EmZKpZsIGuU7zTre9IZaLqHeqwjyQtUixNDbIVU/edit?usp=sharing
 *
 */

public class App {

	public static void main(String[] args) {

		System.out.println("Start");


		int num = 10;
		
//		Employee obj = new Employee();
		Employee obj = new Employee(101, "Sonu", 90000);

		System.out.println(obj.toString());

		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");

		Employee obj2 = context.getBean(Employee.class);

		System.out.println(obj2.toString());

		((AbstractApplicationContext) context).close();

		System.out.println("End");

	}
}
