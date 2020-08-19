package com.project.lombok.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@EqualsAndHashCode
@ToString
public class Person {

	private @Setter String name;
	private int age;
	private @Setter String tech;
}
