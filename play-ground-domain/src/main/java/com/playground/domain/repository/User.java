package com.playground.domain.repository;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by woongs on 2017. 12. 18..
 */
@Entity
@Data
@Table(name = "user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;

	@Column(name = "userId")
	private String userId;

	@Column(name = "password")
	private String password;

	@Column(name = "name")
	private String name;
}
