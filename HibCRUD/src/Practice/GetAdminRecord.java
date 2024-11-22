
package Practice;

import hib.dto.AdminLogin;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetAdminRecord 
{
    public static void main(String args[])
    {
        Configuration c1=new Configuration();
        Configuration c2=c1.configure();
        SessionFactory sf=c2.buildSessionFactory();
        Session session=sf.openSession();
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter login id:");
        int loginId=sc.nextInt();
        
        AdminLogin ad =(AdminLogin)session.get(AdminLogin.class,loginId);
        
        if(ad==null)
        {
            System.out.println("no record found");
        }
        else
        {
            System.out.println(ad.getPassword());
        }
    }
}
