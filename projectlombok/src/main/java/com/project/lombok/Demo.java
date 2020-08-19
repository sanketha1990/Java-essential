package com.project.lombok;

import com.project.lombok.model.Alien;
import com.project.lombok.model.Person;

public class Demo {

	public static void main(String[] args) {
		Alien a = new Alien();
		a.setAge(10);
		a.setName("Sanketh");
		a.setTech("Software Engineer");
		
		System.out.println("Print Alien = "+a);
		
		Person p=new Person();
		p.setName("Dhavi");
		p.setTech("SSE");
		System.out.println("Person = "+p);

	}

}
