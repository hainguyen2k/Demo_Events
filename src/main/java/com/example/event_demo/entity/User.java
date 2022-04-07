package com.example.event_demo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false)
	private long id;

	@Column(name = "first_name", nullable = false)
	private String first_name;

	@Column(name = "last_name", nullable = false)
	private String last_name;

	@Column(name = "phone", nullable = false)
	private String phone;

	@Column(name = "email", nullable = false)
	@Email(message = "Email không hợp lệ")
	private String email;

	@Column(name = "day_of_birth", nullable = false)
	private Date day_of_birth;

	@Column(name = "gender", nullable = false)
	private String gender;

	@Column(name = "nationality", nullable = false)
	private String nationality;

	@Column(name = "identity_card", nullable = false)
	private String identity_card;

	@Column(name = "full_name_contact_person", nullable = false)
	private String full_name_contact_person;

	@Column(name = "phone_contact_person", nullable = false)
	private String phone_contact_person;
	
	@Column(name = "role_name", nullable = false)
	private String role_name;

	@ManyToOne()
	@JoinColumn(name = "id_event")
	private Event event;
}
