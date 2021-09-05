package com.chittaranjan.demo.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@Table(name = "student")
@EqualsAndHashCode(exclude = "hobbies")
public class StudentEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "student_id")
	private Integer id;

	@Column(name = "name", columnDefinition = "varchar(100)", nullable = false)
	private String name;

	@Column(name = "city_id", columnDefinition = "INT(11)", nullable = false)
	private Integer cityId;

	@Column(name = "address", columnDefinition = "varchar(250)")
	private String address;

	@NotEmpty
	@Pattern(regexp="(^$|[0-9]{10})")
	@Column(name = "mobile", columnDefinition = "varchar(10)")
	private String mobile;

	@Column(name = "gender", columnDefinition = "varchar(6)", nullable = false)
	private String gender;

	@Column(name = "active", length = 1, columnDefinition = "tinyint(1) default 1")
	private boolean active;

	@OneToMany(mappedBy = "student", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
	private List<StudentHobbyEntity> hobbies;
	
	public StudentEntity() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCityId() {
		return cityId;
	}

	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public List<StudentHobbyEntity> getHobbies() {
		return hobbies;
	}

	public void setHobbies(List<StudentHobbyEntity> hobbies) {
		this.hobbies = hobbies;
	}

}
