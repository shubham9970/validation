package com.springvalidation.SpringValidation;

import java.util.Date;
import validationapiblog.enums.Gender;

/**
 *
 * @author Adedayo Ominiyi
 */
public class Member {

    private String lastName = null;
    private String firstName = null;
    private Gender gender = null;
    private String emailAddress = null;
    private Date dateOfBirth = null;

    public Member() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Integer getAge() {
        if (this.dateOfBirth != null) {
            // calculate age of member here
        }
        return null;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

	@Override
	public String toString() {
		return "Member [lastName=" + lastName + ", firstName=" + firstName
				+ ", gender=" + gender + ", emailAddress=" + emailAddress
				+ ", dateOfBirth=" + dateOfBirth + "]";
	}
}