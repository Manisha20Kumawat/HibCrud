
package Practice;

import hib.dto.Hospital;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class RestrictionLogic 
{
    public static void main(String[] args) 
    {
        SessionFactory sf=new Configuration().configure().buildSessionFactory();
        Session session=sf.openSession();
        Criteria q=session.createCriteria(Hospital.class);
        
        //q.add(Restrictions.eq("city","indore"));
        q.add(Restrictions.and(Restrictions.eq("city","indore"),Restrictions.eq("hospitalName","phoniex")));
        
        List<Hospital>hs1=q.list();
        if(hs1==null)
        {
            System.out.println("no record found");
        }
        else
        {
            for(Hospital hs:hs1)
            {
                System.out.println(hs.getHospitalName()+" "+hs.getCity()+" "+hs.getRank());
            }
        }
        session.close();
    }
}
