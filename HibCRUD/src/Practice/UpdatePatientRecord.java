
package Practice;

import hib.dto.Patient;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdatePatientRecord 
{
     public static void main(String args[])
    {
        Configuration c1=new Configuration();
        Configuration c2=c1.configure();
        SessionFactory sf=c2.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the patient registration number to update the record:");
        int regNo=sc.nextInt();
        
        Patient pt =(Patient)session.get(Patient.class,regNo);
        
        if(pt==null)
        {
            System.out.println("no record found to update");
        }
        else
        {
             System.out.println("---MENU------");
            System.out.println("What do you wanna upadte");
            System.out.println("1,patient name");
            System.out.println("2,patient regNo");
            System.out.println("3,contact");
            System.out.println("4,age");
            System.out.println("5,gender");
            System.out.println("6,patient details");
            System.out.println("7,desease name");
                    
            int choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("Enter updated patient name");
                    String uPatientName = sc.next();
                    pt.setPatientName(uPatientName);
                    session.update(pt);
                    tx.commit();
                    System.out.println("Field updated!!!");
                    break;
            }
        }
        session.close();
            
        }
}
