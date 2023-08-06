package in.prasoon.vo;

public class ManagerVo
{
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
		return "ManagerVo [managerId=" + managerId + ", managerName=" + managerName + "]";
	}
	public ManagerVo(int managerId, String managerName) {
		super();
		this.managerId = managerId;
		this.managerName = managerName;
	}
	public ManagerVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
