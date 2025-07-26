package courceRegistration.Entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "registration")
public class Registration {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String studentName;
	
	private String courceName;
	private String registrationDate;
	
	private int feesPaid;
	
	@ManyToMany
	private List<Students> student;
	
	
	public List<Students> getStudent() {
		return student;
	}

	public void setStudent(List<Students> student) {
		this.student = student;
	}

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
