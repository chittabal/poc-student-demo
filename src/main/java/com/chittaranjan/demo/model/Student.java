package com.chittaranjan.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

	private String name;
	private String address;
	private String mobileNo;
	private Integer cityId;
	private String sex;
	private String[] hobbies;
	private String hobbiesCommaSeparated;

	public Student(String name, String address, String mobileNo, Integer cityId, String sex, String[] hobbies,
			String hobbiesCommaSeparated) {
		super();
		this.name = name;
		this.address = address;
		this.mobileNo = mobileNo;
		this.cityId = cityId;
		this.sex = sex;
		this.hobbies = hobbies;
		this.hobbiesCommaSeparated = hobbiesCommaSeparated;
	}

	public Student() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public Integer getCityId() {
		return cityId;
	}

	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String[] getHobbies() {
		return hobbies;
	}

	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}

	public String getHobbiesCommaSeparated() {
		return hobbiesCommaSeparated;
	}

	public void setHobbiesCommaSeparated(String hobbiesCommaSeparated) {
		this.hobbiesCommaSeparated = hobbiesCommaSeparated;
	}

}
