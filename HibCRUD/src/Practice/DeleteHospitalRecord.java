
package Practice;

import hib.dto.Hospital;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteHospitalRecord
{
    public static void main(String args[])
    {
        Configuration c1=new Configuration();
        Configuration c2=c1.configure();
        SessionFactory sf=c2.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the hospital registration number to delete the record:");
        int hospRegNo=sc.nextInt();
        
        Hospital hs =(Hospital)session.get(Hospital.class,hospRegNo);
        
        if(hs==null)
        {
            System.out.println("no record found to delete");
        }
        else
        {
            session.delete(hs);
            tx.commit();
            System.out.println("record deleted");
        }
        session.close();
    }
}
