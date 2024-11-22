
package Practice;

import hib.dto.Patient1;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeletePatientRecord 
{
     public static void main(String args[])
    {
        Configuration c1=new Configuration();
        Configuration c2=c1.configure();
        SessionFactory sf=c2.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
        
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the patient registration number to delete the record:");
        int regNo=scan.nextInt();
        
        Patient1 pat =(Patient1)session.get(Patient1.class,regNo);
        
        if(pat==null)
        {
            System.out.println("no record found to delete");
        }
        else
        {
            session.delete(pat);
            tx.commit();
            System.out.println("record deleted");
        }
        session.close();
    }
}
