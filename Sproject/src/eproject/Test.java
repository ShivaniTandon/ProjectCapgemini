package eproject;

public class Test {
	 static int tstart=0;
	    private String testName;
	    public String testId="";
	    public Test(String testName) {
	    	this.testId=Integer.toString(tstart++);
	    	this.testName=testName;
	    }
		public String getTestName() {
			return testName;
		}
		public void setTestName(String testName) {
			this.testName = testName;
		}
		
		
	   
}
