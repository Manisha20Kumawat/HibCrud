
package Practice;

import hib.dto.Doctor;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateDoctorRecord 
{
    public static void main(String args[])
    {
        Configuration c1=new Configuration();
        Configuration c2=c1.configure();
        SessionFactory sf=c2.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the doctor login id to update the record:");
        int loginId=sc.nextInt();
        
        Doctor dc =(Doctor)session.get(Doctor.class,loginId);
        
        if(dc==null)
        {
            System.out.println("no record found to update");
        }
        else
        {
             System.out.println("---MENU------");
            System.out.println("What do you wanna upadte");
            System.out.println("1,doctor name");
            System.out.println("1,doctor id");
            System.out.println("1,password");
            System.out.println("1,city");
            System.out.println("1,experience");
       
                    
            int choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("Enter updated password");
                    String uPassword = sc.next();
                    dc.setPassword(uPassword);
                    session.update(dc);
                    tx.commit();
                    System.out.println("Field updated!!!");
                    break;
            }
        }
        session.close();
            
        }
    }


