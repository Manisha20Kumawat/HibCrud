
package hibcrud;

import hib.dto.Hospital;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertHospitalRecord 
{
    public static void main(String[] args) 
    {
        Configuration c1=new Configuration();
        Configuration c2=c1.configure();
        SessionFactory sf=c2.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
        
        //int loginId=Integer.parseInt(JOptionPane.showInputDialog("Enter the login id:"));
        //String password=JOptionPane.showInputDialog("Enter the password:");
        
        String hospitalName=JOptionPane.showInputDialog("Enter the hospital name:");
        String hospitalId=JOptionPane.showInputDialog("Enter the hospital id:");
        String hospRegNo=JOptionPane.showInputDialog("Enter the hospital registration number:");
        String password=JOptionPane.showInputDialog("Enter the password:");
        String city=JOptionPane.showInputDialog("Enter city:");
        int rank=Integer.parseInt(JOptionPane.showInputDialog("Enter the rank of hospital:"));
        long contact=Long.parseLong(JOptionPane.showInputDialog("Enter the contact:"));
        String email=JOptionPane.showInputDialog("Enter the email:");
        
        //Scanner sc = new Scanner(System.in);
        //System.out.println("Enter the login id:");
        //int loginId=sc.nextInt();
        //System.out.println("Enter the password:");
        //String password=sc.next();
        
        Hospital hs=new Hospital(hospitalName,hospitalId,hospRegNo,password,city,rank,contact,email);
        
        //AdminLogin ad=new AdminLogin(10,"manisha");
        session.save(hs);
        
        //BillingCounter ref=new BillingCounter(121, "manisha", "javacode", "online", 10000.0f);
        //session.save(ref);
        
        tx.commit();
        session.close();
        System.out.println("record inserted!!!!!");
    }
    
}
