package encapsulation;

public class CustomerImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer c=new Customer();
		c.setC_id(111);;
		c.setC_name("hari");
		c.setC_salary(-1111);
		
		
		System.out.println("/////"+c.getC_id());
		System.out.println("/////"+c.getC_name());
		System.out.println("/////"+c.getC_salary());
		

	}

}
