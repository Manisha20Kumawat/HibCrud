
package hibcrud;

import hib.dto.BillingCounter;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertBillingRecord 
{
     public static void main(String[] args) 
    {
        Configuration c1=new Configuration();
        Configuration c2=c1.configure();
        SessionFactory sf=c2.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
        
        
        int regNo=Integer.parseInt(JOptionPane.showInputDialog("Enter the registriction id:"));
        String patientName=JOptionPane.showInputDialog("Enter the patient name:");
        String diseaseName=JOptionPane.showInputDialog("Enter the disease name:");
        String paymentMode=JOptionPane.showInputDialog("Enter the payment mode:");
        float amount=Float.parseFloat(JOptionPane.showInputDialog("Enter amount:"));
        
        BillingCounter bc=new BillingCounter(regNo,patientName,diseaseName,paymentMode,amount);
        
         session.save(bc);
        
        //BillingCounter ref=new BillingCounter(121, "manisha", "javacode", "online", 10000.0f);
        //session.save(ref);
        
        tx.commit();
        session.close();
        System.out.println("record inserted!!!!!");
    }
    
}
