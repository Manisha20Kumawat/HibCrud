
package Practice;

import hib.dto.BillingCounter;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateBillingRecord 
{
    public static void main(String args[])
    {
        Configuration c1=new Configuration();
        Configuration c2=c1.configure();
        SessionFactory sf=c2.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the billibg counter registration number to update the record:");
        int regNo=sc.nextInt();
        
        BillingCounter bc =(BillingCounter)session.get(BillingCounter.class,regNo);
        
        if(bc==null)
        {
            System.out.println("no record found to update");
        }
        else
        {
             System.out.println("---MENU------");
            System.out.println("What do you wanna upadte");
            System.out.println("1,patient name");
            System.out.println("2,disease name");
            System.out.println("3,payment mode");
            System.out.println("4,amount");
            
                    
            int choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("Enter updated patient name");
                    String uPatientName = sc.next();
                    bc.setPatientName(uPatientName);
                    session.update(bc);
                    tx.commit();
                    System.out.println("Field updated!!!");
                    break;
            }
        }
        session.close();
            
        }

}
