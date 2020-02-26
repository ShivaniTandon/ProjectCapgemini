package project;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

import eproject.Test;

public class Health_System implements HealthCare{
	ArrayList<Diagnostic_Center> centers=new ArrayList<>();
	
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
            String cName=br.readLine();
            if (cName.length()!=0){
                centers.add(new Diagnostic_Center(cName));
                System.out.println("Center Added Succesfully");
                flag=true;
            }
            else{
                //System.out.println("Name Shouldn't be Blank");
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
            
                for(Diagnostic_Center a: centers){
                	
                    System.out.print("Center Id- "+a.centerId+"\t");
                    System.out.println("Center Name-"+a.getCenterName());
                    for(Test test:a.listOfTests){
	                    System.out.print("Test Id-"+test.testId+"\t");
	                    System.out.println("Test Name-"+test.getTestName());              
	                     }
                }
                System.out.println("Enter The Center ID");
                String id=br.readLine();
                int found=0;
                for(Diagnostic_Center a:centers){
                    if (a.centerId.equals(id)){
                        centers.remove(a);
                        found=1;
                        System.out.println("Center Removed Succesfully!");
                        flag=true;
                        break;
                    }
                }
                if (found==0){
                    //System.out.println("Center Id is not legal");
                    throw new CenterIdException();
                }
            } catch (Exception e) {
            System.out.println(e);
        }
        return flag;
    }
}
