package assignment;

public class softwarecompany implements TCS, imfosys{
	
	
	public void Qualitycontrol() {
		System.out.println("all software work is running");
	}
	
	public void Testingdepartment() {
		System.out.println("testing work is running");
	}

	
	static void  Devloper() {
    	System.out.println("devloper is running"); 
    	
	}
    	
    	public void coder() {
    		System.out.println("coder work is running");
    	}
    	
    	
    	
    		
    		static void designerdepartment() {
    			System.out.println("desingner phase is running");
    			
    		}
    		public static void main(String[]args) {
    			softwarecompany a = new	softwarecompany();
    			a.Testingdepartment();
    			a.Devloper();
    			a.designerdepartment();
    			a.Qualitycontrol();
    			a.coder();
    		}
    	

}
