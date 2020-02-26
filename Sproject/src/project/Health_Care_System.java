package project;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Health_Care_System
{
    
    public static void main(String args[]){
    	Health_System h=new Health_System();
    	boolean res=false;
        try{
        	
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            Boolean OuterExit=false;
            do{
                System.out.println("Enter 1 for Admin - add center");
                System.out.println("Enter 2 for Exit");
                char ch=br.readLine().charAt(0);
                switch(ch){
                    case '1':
                           /* System.out.println("Enter The Admin Id");
                            String id=br.readLine();
                            System.out.println("Enter The Admin Password");
                            String pass=br.readLine();
                            if((id.equals("admin")) && pass.equals("password")){*/
                                    Boolean exit=false;
                                    do{
                                        System.out.println("Enter 1 for Add Center");
                                        System.out.println("Enter 2 for Remove Center");
                                        System.out.println("Enter 3 for Exiting from Admin Account");
                                        char ch1=br.readLine().charAt(0);
                                        switch(ch1){
                                            case '1':res=h.addCenter();
                                            System.out.println(res);
                                                break;
                                            case '2':if(h.centers.size()!=0) {
                                                         res=h.removeCenter();
                                            			 System.out.println(res);
                                            }
                                                    else {
                                                         //System.out.println("Center List Is Empty Please Add Center First!");
                                                         throw new CenterListException();
                                                    }
                                                break;
                                            case '3':System.out.println("Exiting from Admin Account");
                                                    exit=true;
                                                    break;
                                            default: System.out.println("Wrong Choice");
                                        }
                                    }while(!exit);
                           /* }
                            else{
                                System.out.println("Credentials Wrong");
                            }*/
                            break;
                    case '2':
                            System.out.println("Exiting From The System\n Good Bye!");
                            OuterExit=true;
                            break;
                    default:
                            System.out.println("Wrong Choice");
                }
            }while(!OuterExit);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
