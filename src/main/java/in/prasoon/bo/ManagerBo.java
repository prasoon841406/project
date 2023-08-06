package in.prasoon.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="avantel_manager")
public class ManagerBo
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int managerId;
	private String managerName;
	public int getManagerId() {
		return managerId;
	}
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	@Override
	public String toString() {
		return "ManagerBo [managerId=" + managerId + ", managerName=" + managerName + "]";
	}
	public ManagerBo(int managerId, String managerName) {
		super();
		this.managerId = managerId;
		this.managerName = managerName;
	}
	public ManagerBo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
