
package hibcrud;

import hib.dto.AdminLogin;
//import hib.dto.BillingCounter;
//import hib.dto.Hospital;
//import java.util.Scanner;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibCRUD {

    public static void main(String[] args) 
    {
        Configuration c1=new Configuration();
        Configuration c2=c1.configure();
        SessionFactory sf=c2.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
        
        int loginId=Integer.parseInt(JOptionPane.showInputDialog("Enter the login id:"));
        String password=JOptionPane.showInputDialog("Enter the password:");
        
        //Scanner sc = new Scanner(System.in);
        //System.out.println("Enter the login id:");
        //int loginId=sc.nextInt();
        //System.out.println("Enter the password:");
        //String password=sc.next();
        
        AdminLogin ad=new AdminLogin(loginId,password);
        
        //AdminLogin ad=new AdminLogin(21,"mani");
        session.save(ad);
        
        //BillingCounter ref=new BillingCounter(101, "kiran", "javacode", "online", 10000.0f);
        //session.save(ref);
        
        //Hospital hp=new Hospital("phoniex","manu","kumu","kir","indore",3,565656,"manisha");
        //session.save(hp);
        
        tx.commit();
        session.close();
        System.out.println("record inserted!!!!!");
    }
    
}
