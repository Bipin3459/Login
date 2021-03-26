package com.project.login.member;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class Member {
	
	
	@Id
	@SequenceGenerator(
			name="member_sequence",
			sequenceName="member_sequence",
			allocationSize=1
	
			)
	@GeneratedValue(
			strategy= GenerationType.SEQUENCE,
			generator = "member_sequence"
			)
	private Long id;
	private String firstname;
	private String lastname;
	private int account;
	private int balance;
	public Member(){
		
	}
	public Member(Long id, String firstname, String lastname, int account, int balance) {
		
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.account = account;
		this.balance = balance;
	}

	public Member(String firstname, String lastname, int account, int balance) {
		
		this.firstname = firstname;
		this.lastname = lastname;
		this.account = account;
		this.balance = balance;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getAccount() {
		return account;
	}

	public void setAccount(int account) {
		this.account = account;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", account=" + account
				+ ", balance=" + balance + "]";
	}

}
