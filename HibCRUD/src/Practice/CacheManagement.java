
package Practice;

import hib.dto.BillingCounter;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

public class CacheManagement 
{
     public static void main(String[] args) 
    {
            SessionFactory sf=new Configuration().configure().buildSessionFactory();
            Session session= sf.openSession();
              
            Criteria q=session.createCriteria(BillingCounter.class);
            ProjectionList pl=Projections.projectionList();
            //pl.add(Projections.property("patientName"));
            //pl.add(Projections.property("paymentMode"));
            pl.add(Projections.sum("amount"));
            pl.add(Projections.max("amount"));
            pl.add(Projections.min("amount"));
            pl.add(Projections.count("paymentMode"));
            pl.add(Projections.countDistinct("paymentMode"));
               q.setProjection(pl);
            List<Object[]> bc1=q.list();
            if(bc1==null)
            {
                System.out.println("no record found");
            }
            else
            {
              for(Object bc[]:bc1)
              {
                   System.out.println(bc[0]+" "+bc[1]+" "+bc[2]+" "+bc[3]+" "+bc[4]);
              }
            }
            session.close();
        }
}
