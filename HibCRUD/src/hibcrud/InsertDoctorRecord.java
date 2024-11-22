
package hibcrud;

import hib.dto.Doctor1;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertDoctorRecord 
{
      public static void main(String[] args) 
    {
        
        Configuration c1=new Configuration();
        Configuration c2=c1.configure();
        SessionFactory sf=c2.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
        
        
        int docId=Integer.parseInt(JOptionPane.showInputDialog("Enter the doctor id:"));
        String doctName=JOptionPane.showInputDialog("Enter the doctor name:");
        String password=JOptionPane.showInputDialog("Enter the password:");
        long contact=Long.parseLong(JOptionPane.showInputDialog("Enter the contact:"));
        String experience=JOptionPane.showInputDialog("Enter experience:");
        String specialization=JOptionPane.showInputDialog("Enter the specialization:");
        String education=JOptionPane.showInputDialog("Enter the education:");
        String email=JOptionPane.showInputDialog("Enter the email:");
        
        Doctor1 dc=new Doctor1(docId,doctName,password,contact,experience,specialization,education,email);
        
         session.save(dc);
        
        //Doctor1 ref=new Doctor1(121, "manisha", "abc123", 34567890, "5","abc","mbbs","abc@123");
        //session.save(ref);
        
        tx.commit();
        session.close();
        System.out.println("record inserted!!!!!");
    }
    
}
