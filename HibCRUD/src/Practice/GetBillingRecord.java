
package Practice;

import hib.dto.BillingCounter;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetBillingRecord
{
    public static void main(String args[])
    {
        Configuration c1=new Configuration();
        Configuration c2=c1.configure();
        SessionFactory sf=c2.buildSessionFactory();
        Session session=sf.openSession();
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the billing counter registration number:");
        int regNo=sc.nextInt();
        
        BillingCounter bc =(BillingCounter)session.get(BillingCounter.class,regNo);
        
        if(bc==null)
        {
            System.out.println("no record found");
        }
        else
        {
            System.out.println(bc.getPatientName()+" "+bc.getDiseaseName()+" "+bc.getPaymentMode()+" "+bc.getAmount());
        }
    }
}
