
package Practice;

import hib.dto.BillingCounter;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteBillingRecord 
{
    public static void main(String args[])
    {
        Configuration c1=new Configuration();
        Configuration c2=c1.configure();
        SessionFactory sf=c2.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
        
        Scanner scd=new Scanner(System.in);
        System.out.println("Enter the billing counter registration number to delete the record:");
        int regNo=scd.nextInt();
        
        BillingCounter bc =(BillingCounter)session.get(BillingCounter.class,regNo);
        
        if(bc==null)
        {
            System.out.println("no record found to delete");
        }
        else
        {
            session.delete(bc);
            tx.commit();
            System.out.println("record deleted");
        }
        session.close();
    }
}
