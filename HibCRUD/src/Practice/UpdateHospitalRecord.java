
package Practice;

import hib.dto.Hospital;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateHospitalRecord 
{
    public static void main(String args[])
    {
        Configuration c1=new Configuration();
        Configuration c2=c1.configure();
        SessionFactory sf=c2.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the hospital registration number to update the record:");
        int hospRegNo=sc.nextInt();
        
        Hospital hs =(Hospital)session.get(Hospital.class,hospRegNo);
        
        if(hs==null)
        {
            System.out.println("no record found to update");
        }
        else
        {
             System.out.println("---MENU------");
            System.out.println("What do you wanna upadte");
            System.out.println("1,hospital name");
            System.out.println("1,hospital id");
            System.out.println("1,password");
            System.out.println("1,city");
            System.out.println("1,conatct");
            System.out.println("1,email");
                    
            int choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("Enter updated password");
                    String uPassword = sc.next();
                    hs.setPassword(uPassword);
                    session.update(hs);
                    tx.commit();
                    System.out.println("Field updated!!!");
                    break;
            }
        }
        session.close();
            
        }
    }

