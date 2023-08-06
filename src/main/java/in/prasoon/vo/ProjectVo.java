package in.prasoon.vo;

import java.util.Date; 

import org.springframework.format.annotation.DateTimeFormat;

public class ProjectVo
{
	private int projectId;
	private String projectName;
	private String projectCode;
	private String contactPerson;
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private Date startDate;
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private Date endDate;
	private String projectRemark;
	
	private CustomerVo customerVo;
	private ManagerVo managerVo;
	
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
	public CustomerVo getCustomerVo() {
		return customerVo;
	}
	public void setCustomerVo(CustomerVo customerVo) {
		this.customerVo = customerVo;
	}
	public ManagerVo getManagerVo() {
		return managerVo;
	}
	public void setManagerVo(ManagerVo managerVo) {
		this.managerVo = managerVo;
	}
	@Override
	public String toString() {
		return "ProjectVo [projectId=" + projectId + ", projectName=" + projectName + ", projectCode=" + projectCode
				+ ", contactPerson=" + contactPerson + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", projectRemark=" + projectRemark + ", customerVo=" + customerVo + ", managerVo=" + managerVo + "]";
	}
	public ProjectVo(int projectId, String projectName, String projectCode, String contactPerson, Date startDate,
			Date endDate, String projectRemark, CustomerVo customerVo, ManagerVo managerVo) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.projectCode = projectCode;
		this.contactPerson = contactPerson;
		this.startDate = startDate;
		this.endDate = endDate;
		this.projectRemark = projectRemark;
		this.customerVo = customerVo;
		this.managerVo = managerVo;
	}
	public ProjectVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	
}
