package in.prasoon.bo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="avantel_project")
public class ProjectBo
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int projectId;
	private String projectName;
	private String projectCode;
	private String contactPerson;
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private Date startDate;
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private Date endDate;
	private String projectRemark;
	
	@OneToOne
	private CustomerBo customerBo;
	@OneToOne
	private ManagerBo managerBo;
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getProjectCode() {
		return projectCode;
	}
	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}
	public String getContactPerson() {
		return contactPerson;
	}
	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getProjectRemark() {
		return projectRemark;
	}
	public void setProjectRemark(String projectRemark) {
		this.projectRemark = projectRemark;
	}
	public CustomerBo getCustomerBo() {
		return customerBo;
	}
	public void setCustomerBo(CustomerBo customerBo) {
		this.customerBo = customerBo;
	}
	public ManagerBo getManagerBo() {
		return managerBo;
	}
	public void setManagerBo(ManagerBo managerBo) {
		this.managerBo = managerBo;
	}
	@Override
	public String toString() {
		return "ProjectBo [projectId=" + projectId + ", projectName=" + projectName + ", projectCode=" + projectCode
				+ ", contactPerson=" + contactPerson + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", projectRemark=" + projectRemark + ", customerBo=" + customerBo + ", managerBo=" + managerBo + "]";
	}
	public ProjectBo(int projectId, String projectName, String projectCode, String contactPerson, Date startDate,
			Date endDate, String projectRemark, CustomerBo customerBo, ManagerBo managerBo) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.projectCode = projectCode;
		this.contactPerson = contactPerson;
		this.startDate = startDate;
		this.endDate = endDate;
		this.projectRemark = projectRemark;
		this.customerBo = customerBo;
		this.managerBo = managerBo;
	}
	public ProjectBo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
