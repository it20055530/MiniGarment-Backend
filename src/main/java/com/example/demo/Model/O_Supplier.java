  package com.example.demo.Model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "suppliers")
public class O_Supplier {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "name")
	private String Sname;
	
	@Column(name = "nic")
	private String Snic;
	
	@Column(name = "type")
	private String Stype;
	
	@Column(name = "company")
	private String Scompany;
	
	@Column(name = "email")
	private String Semail;
	
	@Column(name = "phone")
	private String Sphone;
	
	@Column(name = "capacity")
	private String Scapacity;
	
	public O_Supplier() {
		
	}
	
	public O_Supplier(String sname, String snic, String stype, String scompany, String semail, String sphone,String scapacity) {
		super();
		Sname = sname;
		Snic = snic;
		Stype = stype;
		Scompany = scompany;
		Semail = semail;
		Sphone = sphone;
		Scapacity = scapacity;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public String getSnic() {
		return Snic;
	}
	public void setSnic(String snic) {
		Snic = snic;
	}
	public String getStype() {
		return Stype;
	}
	public void setStype(String stype) {
		Stype = stype;
	}
	public String getScompany() {
		return Scompany;
	}
	public void setScompany(String scompany) {
		Scompany = scompany;
	}
	public String getSemail() {
		return Semail;
	}
	public void setSemail(String semail) {
		Semail = semail;
	}
	public String getSphone() {
		return Sphone;
	}
	public void setSphone(String sphone) {
		Sphone = sphone;
	}
	public String getScapacity() {
		return Scapacity;
	}
	public void setScapacity(String scapacity) {
		Scapacity = scapacity;
	}
}

