
package Practice;

import hib.dto.Hospital;
import java.util.Scanner;
import org.hibernate.ObjectNotFoundException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class LoadHospitalRecord 
{
    public static void main(String args[])
    {
        Configuration c1=new Configuration();
        Configuration c2=c1.configure();
        SessionFactory sf=c2.buildSessionFactory();
        Session session=sf.openSession();
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the hospital registration number:");
        int hospRegNo=sc.nextInt();
        
        try
        {
        Hospital hs =(Hospital)session.load(Hospital.class,hospRegNo);
          System.out.println(hs.getHospitalName()+" "+hs.getHospitalId()+" "+hs.getPassword()+" "+hs.getCity()+" "+hs.getRank()+" "+hs.getContact()+" "+hs.getEmail());
        }
        catch(ObjectNotFoundException ex)
        {
            System.out.println("no record found");
        }
      
        
    }
}
