
package Practice;

import hib.dto.AdminLogin;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateAdminRecord
{
    
    public static void main(String args[])
    {
        SessionFactory sf=new Configuration().configure().buildSessionFactory();
        //Configuration c1=new Configuration();
        //Configuration c2=c1.configure();
        //SessionFactory sf=c2.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter login id to update the record:");
        int loginId=sc.nextInt();
        
        AdminLogin ad =(AdminLogin)session.get(AdminLogin.class,loginId);
        
        if(ad==null)
        {
            System.out.println("no record found to update");
        }
        else
        {
            System.out.println("---MENU------");
            System.out.println("What do you wanna upadte");
            System.out.println("1,password");
            System.out.println("2,login id");
            
            
            int choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("Enter updated password");
                    String uPassword = sc.next();
                    ad.setPassword(uPassword);
                    session.update(ad);
                    tx.commit();
                    System.out.println("Field updated!!!");
                    break;
                    
                case 2:
                    System.out.println("Enter updated login id");
                    int uLoginId=sc.nextInt();
                    ad.setLoginId(uLoginId);
                    session.update(ad);
                    tx.commit();
                    System.out.println("Field updated!!!");
                    break;
            }
        }
        session.close();
    }
}




