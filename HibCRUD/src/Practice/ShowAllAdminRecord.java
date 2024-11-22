
package Practice;

import hib.dto.AdminLogin;
import java.util.List;
//import java.util.Scanner;
//import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ShowAllAdminRecord 
{
    
    public static void main(String args[])
    {
        Configuration c1=new Configuration();
        Configuration c2=c1.configure();
        SessionFactory sf=c2.buildSessionFactory();
        Session session=sf.openSession();
        
        Query q=session.createQuery("from AdminLogin");
        //Criteria q=session.createCriteria(AdminLogin.class);
        
        List<AdminLogin>ad1=q.list();
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
        
        



