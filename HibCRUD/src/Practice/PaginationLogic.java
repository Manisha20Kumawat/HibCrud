
package Practice;

import hib.dto.BillingCounter;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
//import org.hibernate.criterion.Order;

public class PaginationLogic 
{
    public static void main(String[] args) 
    {
            SessionFactory sf=new Configuration().configure().buildSessionFactory();
            Session session= sf.openSession();
              
            Criteria q=session.createCriteria(BillingCounter.class);
            
            q.setFirstResult(1);
            q.setMaxResults(2);
            
            List<BillingCounter> bc1=q.list();
            if(bc1==null)
            {
                System.out.println("no record found");
            }
            else
            {
              for(BillingCounter bc:bc1)
              {
                  System.out.println(bc.getRegNo()+" "+bc.getPatientName()+" "+bc.getDiseaseName()+" "+bc.getPaymentMode()+" "+bc.getAmount());
              }
            }
            session.close();
        }
}
