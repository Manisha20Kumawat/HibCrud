
package Practice;

import hib.dto.AdminLogin;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ShowAllAdminRecord1 
{
    public static void main(String[] args) {
        {
            SessionFactory sf=new Configuration().configure().buildSessionFactory();
            Session session=sf.openSession();
            
            Criteria q= session.createCriteria(AdminLogin.class);
                    //select*from tablename
                    
            List<AdminLogin> ad1=q.list();
            if(ad1==null)
            {
                System.out.println("no record found"); 
            }
            else
            {
                for(AdminLogin ad:ad1)
                {
                    System.out.println(ad.getLoginId()+" "+ad.getPassword());
                }
            }
            session.close();
        }
    }
}
