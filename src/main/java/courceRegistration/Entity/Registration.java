package courceRegistration.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "registration")
public class Registration {

    @Id
	private int id;
	private String studentName;
	
	private String courceName;
	private String registrationDate;
	
	private int feesPaid;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCourceName() {
		return courceName;
	}

	public void setCourceName(String courceName) {
		this.courceName = courceName;
	}

	public String getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}

	public int getFeesPaid() {
		return feesPaid;
	}

	public void setFeesPaid(int feesPaid) {
		this.feesPaid = feesPaid;
	}

	@Override
	public String toString() {
		return "Registration [id=" + id + ", studentName=" + studentName + ", courceName=" + courceName
				+ ", registrationDate=" + registrationDate + ", feesPaid=" + feesPaid + "]";
	}
	
	
}
