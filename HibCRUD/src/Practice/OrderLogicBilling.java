
package Practice;

import hib.dto.BillingCounter;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;

public class OrderLogicBilling 
{
    public static void main(String[] args) 
    {
            SessionFactory sf=new Configuration().configure().buildSessionFactory();
            Session session= sf.openSession();
            
            //Query q=session.createQuery("from BillingCounter order by patientName in asc");
            
            Criteria q=session.createCriteria(BillingCounter.class);
            
            //q.addOrder(Order.asc("regNo"));
            //q.addOrder(Order.desc("regNo"));
            q.addOrder(Order.asc("patientName"));
            List<BillingCounter> bc1=q.list();
            if(bc1==null)
            {
                System.out.println("no record found");
            }
            else
            {
              for(BillingCounter bc:bc1)
              {
                  System.out.println(bc.getRegNo()+" "+bc.getPatientName());
              }
            }
            session.close();
        }
    }

