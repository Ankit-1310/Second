package com.anku.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Student {
	@Id
	private Integer sid;
	private String name;
	private String address;
}
