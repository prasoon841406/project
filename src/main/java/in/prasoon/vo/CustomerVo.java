package in.prasoon.vo;

public class CustomerVo
{
	private int customerId;
	private String customerName;
	
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	@Override
	public String toString() {
		return "CustomerVo [customerId=" + customerId + ", customerName=" + customerName + "]";
	}
	public CustomerVo(int customerId, String customerName) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
	}
	public CustomerVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	
	
}
