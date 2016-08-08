	package com.Model;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name = "User")
public class User implements Serializable 
{
	private static final long serialVersionUID = -4747980228140827924L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userid;	
	@Column
	@NotEmpty(message = "Please enter your user name.")
	@Size(min = 5, max = 20, message = "Your name should be between 5 - 20 characters.")
	private String username;
	@Column
	@NotNull
	@NotEmpty(message = "Please enter your password.")
	@Length(min = 5, max = 20, message = "Password should be between 5 - 20 charactes")
	private String password;
	@NotNull
	transient String rpassword;
	@Column
	private boolean enabled;
	@Column
	private String userrole;
	@Column
	@NotEmpty(message = "Please enter your full name.")
	private String fullname;
	@Column
	@Pattern(regexp = ".+@.+\\..+", message = "Wrong email!")
	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	private String phoneno;
	private String gender;
	private String city;
	/*@Column
    private String fpath;
    
   transient private MultipartFile file1;
   public MultipartFile getFile1() {
		return file1;
	}

   public String getFpath() {
		return fpath;
	}

	public void setFpath(String fpath) {
		this.fpath = fpath;
	}*/
	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRpassword() {
		return rpassword;
	}

	public void setRpassword(String rpassword) {
		this.rpassword = rpassword;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public String getUserrole() {
		return userrole;
	}

	public void setUserrole(String userrole) {
		this.userrole = userrole;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	/*public void setFile1(MultipartFile file1) {
		this.file1 = file1;
	}

		public  String getFilePath(String path1,String contextpath)
		{	
			String fileName = null;
			if (!file1.isEmpty()) 
			{
		        try 
		        {       	
		        	
		            fileName = file1.getOriginalFilename();
		            byte[] bytes = file1.getBytes();
		            	String npath=path1+"\\resources\\images\\"+ fileName;
		        
		    				BufferedOutputStream buffStream = 
		                    new BufferedOutputStream(new FileOutputStream(new File(npath)));
		            buffStream.write(bytes);
		            buffStream.close();
		           String dbfilename=contextpath+"/resources/images/"+fileName;
		            
		            this.setFpath(dbfilename);
		            return dbfilename;
		        }
		        catch (Exception e) 
		        {
		            return "You failed to upload " + fileName + ": " + e.getMessage();
		        }
		    } 
			else 
			{
				return "Unable to upload. File is empty.";
			}
		}*/
}