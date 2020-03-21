package healthcareproject;
import java.time.LocalDateTime;
import java.util.ArrayList;

import project.Appointment;
import project.Test;
import project.User;

public class DiagnosticCenter {
		
	    static int cstart=1; 
	    String centerId;
	    private String centerName;

		public String getCenterName() {
			return centerName;
		}

		public void setCenterName(String centerName) {
			this.centerName = centerName;
		}

		ArrayList<Test> listOfTests=new ArrayList<>(); //for storing the list of tests
	    ArrayList<Appointment> appointmentList=new ArrayList<>();//for displaying appointment list
	    
	    
	    public DiagnosticCenter(String centerName)
	    {
	        listOfTests.add(new Test("Blood Group"));
	        listOfTests.add(new Test("Blood Sugar"));
	        listOfTests.add(new Test("Blood Pressure"));
	        
	        appointmentList.add(new Appointment(new User("User A"),1,new Test("Test Id 0"),LocalDateTime.of(2020,03,12,10,00,00),true));
	        appointmentList.add(new Appointment(new User("User B"),2,new Test("Test Id 2"),LocalDateTime.of(2020,04,23,10,30,00),true));
	        
	        this.centerName=centerName;
	        this.centerId=Integer.toString(cstart++);
	    }
	}


