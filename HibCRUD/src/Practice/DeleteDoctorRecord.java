
package Practice;

import hib.dto.Doctor1;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteDoctorRecord 
{
    public static void main(String args[])
    {
        Configuration c1=new Configuration();
        Configuration c2=c1.configure();
        SessionFactory sf=c2.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
        

        System.out.println("Enter the doctor id number to delete the record:");
        Scanner scb=new Scanner(System.in);
        int doctId=scb.nextInt();
        
        Doctor1 doct =(Doctor1)session.get(Doctor1.class,doctId);
        
        if(doct==null)
        {
            System.out.println("no record found to delete");
        }
        else
        {
            session.delete(doct);
            tx.commit();
            System.out.println("record deleted");
        }
        session.close();
    }
}
