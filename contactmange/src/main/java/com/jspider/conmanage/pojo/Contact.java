package com.jspider.conmanage.pojo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="contactman")
public class Contact {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false)
	private String name;
	@Column(nullable = false)
	private String photo;
	@Column(nullable = false)
	private long mobile;
	@Column(nullable = false)
	private String email;
	@Column(nullable = false)
	private String company;
	@Column(nullable = false)
	private String title;
	@Column(nullable = false)
	private String groupname;

}
