package project;
import java.util.ArrayList;
import eproject.Test;

public class Diagnostic_Center {
	    static int cstart=0;
	    String centerId;
	    private String centerName;

		public String getCenterName() {
			return centerName;
		}

		public void setCenterName(String centerName) {
			this.centerName = centerName;
		}

		ArrayList<Test> listOfTests=new ArrayList<>();
	    //ArrayList<Appointment> appointmentList=new ArrayList<>();
	    
	    public Diagnostic_Center(String centerName)
	    {
	        listOfTests.add(new Test("Blood Group"));
	        listOfTests.add(new Test("Blood Sugar"));
	        listOfTests.add(new Test("Blood Pressure"));
	        
	        this.centerName=centerName;
	        this.centerId=Integer.toString(cstart++);
	    }
	}


