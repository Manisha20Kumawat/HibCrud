
package hibcrud;

import hib.dto.BloodBank1;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertBloodInfo 
{
     public static void main(String[] args) 
    {
        Configuration c1=new Configuration();
        Configuration c2=c1.configure();
        SessionFactory sf=c2.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
        
        
        //int id=Integer.parseInt(JOptionPane.showInputDialog("Enter the registriction id:"));
        //String bloodGroup=JOptionPane.showInputDialog("Enter the blood group:");
        //float quantity=Float.parseFloat(JOptionPane.showInputDialog("Enter the quantity:"));
                
        //BloodBank bl=new BloodBank(id,bloodGroup,quantity);
        BloodBank1 bl=new BloodBank1(11,"A+",10);
         session.save(bl);
        
         tx.commit();
        session.close();
        System.out.println("record inserted!!!!!");
    }
    
}
