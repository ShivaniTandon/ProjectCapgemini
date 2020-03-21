package healthcareproject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

import project.Appointment;
import project.Test;

public class HealthSystem implements HealthCare{
	
	ArrayList<DiagnosticCenter> centers=new ArrayList<>();
	
	public boolean validCenterName(String cName) {
		boolean res=true;
		if(!(cName.charAt(0)>=65 && cName.charAt(0)<=90)) {
			res=false;
		}
		return res;
	}
	public boolean validSize(String cName){
		boolean res=true;
		if(cName.length()==0) {
			res=false;
		}
		return res;
	}
	
    public boolean addCenter(){
    	boolean flag=false;
        try {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter The Center Name to be Added");
            System.out.println("Enter the valid name with the first letter as capital.");
            String cName=br.readLine();
            if (cName.length()!=0){
            		centers.add(new DiagnosticCenter(cName));
                    System.out.println("Center Added Succesfully");
                    flag=true;
            	}
            else if(cName.length()==0){
            	//if the center name is blank, then it throws the exception.
                throw new CenterNameException(cName);
                }
        } catch (Exception e) {
            System.out.println(e);
        }
        return flag;
    }
    
    public boolean removeCenter(){
    	boolean flag=false;
        try {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("The Centers Are:");
            
                for(DiagnosticCenter a: centers){
                	
                    System.out.print("\nCenter Id- "+a.centerId+"\t");
                    System.out.println("Center Name-"+a.getCenterName());
                    for(Test test:a.listOfTests){
	                    System.out.print("Test Id-"+test.testId+"\t");
	                    System.out.println("Test Name-"+test.getTestName());              
	                     }
                    for(Appointment a1: a.appointmentList){
	                	System.out.println("Appointment Id       : " +a1.getAppId());
	                	System.out.println("Name                 : " +a1.getUser().getUserName());
	                	System.out.println("Test                 : " +a1.getTest().getTestName());
	                	System.out.println("Appointment Schedule : " +a1.getDate());
	                	System.out.println();
	                }
                }
                System.out.println("Enter The Center ID");
                String id=br.readLine();
                int found=0;
                for(DiagnosticCenter a:centers){
                    if (a.centerId.equals(id)){
                        centers.remove(a);
                        found=1;
                        System.out.println("Center Removed Succesfully!");
                        flag=true;
                        break;
                    }
                }
                if (found==0){
                	//if the Center Id does not matches the Center Id present in the list it throws exception.
                    throw new CenterIdException();
                }
            } catch (Exception e) {
            System.out.println(e);
        }
        return flag;
    }
}
