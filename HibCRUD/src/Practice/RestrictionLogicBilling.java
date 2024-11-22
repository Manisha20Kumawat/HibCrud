
package Practice;

import hib.dto.BillingCounter;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class RestrictionLogicBilling 
{
     public static void main(String[] args) 
    {
        SessionFactory sf=new Configuration().configure().buildSessionFactory();
        Session session=sf.openSession();
        Criteria q=session.createCriteria(BillingCounter.class);
        
        //q.add(Restrictions.eq("paymentMode","online"));
        q.add(Restrictions.and(Restrictions.eq("paymentMode","online"),Restrictions.eq("diseaseName","javacode")));
        //q.add(Restrictions.like("patientName","%a%"));
        //q.add(Restrictions.like("patientName","%a"));
        //q.add(Restrictions.like("patientName","a%"));
        List<BillingCounter>bc1=q.list();
        if(bc1==null)
        {
            System.out.println("no record found");
        }
        else
        {
            for(BillingCounter bc:bc1)
            {
                System.out.println(bc.getPatientName()+" "+bc.getPaymentMode()+" "+bc.getDiseaseName()+" "+bc.getAmount());
            }
        }
        session.close();
    }
}
