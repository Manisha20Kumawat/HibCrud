
package Practice;

import hib.dto.BillingCounter;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ShowAllBillingRecord 
{
    public static void main(String args[])
    {
        Configuration c1=new Configuration();
        Configuration c2=c1.configure();
        SessionFactory sf=c2.buildSessionFactory();
        Session session=sf.openSession();
        
        //Scanner sc=new Scanner(System.in);
        //System.out.println("Enter the hospital registration number:");
        //int hospRegNo=sc.nextInt();
        Criteria q=session.createCriteria(BillingCounter.class);
        //Hospital hs =(Hospital)session.get(Hospital.class,hospRegNo);
        List<BillingCounter> bc1=q.list();
        if(bc1==null)
        {
            System.out.println("no record found");
        }
        else
        {
            for(BillingCounter bc:bc1)
            {
                System.out.println(bc.getPatientName()+" "+bc.getDiseaseName()+" "+bc.getPaymentMode()+" "+bc.getAmount());
            
            }
        }
        session.close();
    }
}
