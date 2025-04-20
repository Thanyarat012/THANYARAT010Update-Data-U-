package com.thanyarat.cakesystem.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="students")
public class Students {
    // สร้างติดต่อฟิลด์
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	public int id;
	
	@Column(name="stdcode")
	public String stdcode;
	
	@Column(name="stdname")
	public String stdname;
	
	@Column(name="department")
	public String department;
	
	@Column(name="tel")
	public String tel;
	
	@Column(name="advisor")
	public String advisor;
	
	@Column(name="product")
	public String product;
	
	@Column(name="price")
	public String price;
	
	// ขั้นตอนที่ 2 สร้าง default Constructor
	public Students() {}

	// ขั้นตอนที่ 3 สร้าง Constructor fields
	public Students(int id, String stdcode, String stdname, String department, String tel, String advisor,
			String product, String price) {
		super();
		this.id = id;
		this.stdcode = stdcode;
		this.stdname = stdname;
		this.department = department;
		this.tel = tel;
		this.advisor = advisor;
		this.product = product;
		this.price = price;
	}

	
	// ขั้นตอนที่ 4 สร้าง Getter / Setter
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStdcode() {
		return stdcode;
	}

	public void setStdcode(String stdcode) {
		this.stdcode = stdcode;
	}

	public String getStdname() {
		return stdname;
	}

	public void setStdname(String stdname) {
		this.stdname = stdname;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAdvisor() {
		return advisor;
	}

	public void setAdvisor(String advisor) {
		this.advisor = advisor;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	// ขั้นตอนที่ 5 สร้าง toString
	@Override
	public String toString() {
		return "Students [id=" + id + ", stdcode=" + stdcode + ", stdname=" + stdname + ", department=" + department
				+ ", tel=" + tel + ", advisor=" + advisor + ", product=" + product + ", price=" + price + "]";
	}
	
	
}
