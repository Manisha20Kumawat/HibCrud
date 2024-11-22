
package Practice;

import hib.dto.Hospital;
import java.util.List;
//import java.util.Scanner;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ShowAllHospitalRecord 
{
    public static void main(String args[])
    {
        Configuration c1=new Configuration();
        Configuration c2=c1.configure();
        SessionFactory sf=c2.buildSessionFactory();
        Session session=sf.openSession();
        
        //Scanner sc=new Scanner(System.in);
        //System.out.println("Enter the hospital registration number:");
        //int hospRegNo=sc.nextInt();
        Criteria q=session.createCriteria(Hospital.class);
        //Hospital hs =(Hospital)session.get(Hospital.class,hospRegNo);
        List<Hospital> hs1=q.list();
        if(hs1==null)
        {
            System.out.println("no record found");
        }
        else
        {
            for(Hospital hs:hs1)
            {
            System.out.println(hs.getHospitalName()+" "+hs.getHospitalId()+" "+hs.getPassword()+" "+hs.getCity()+" "+hs.getRank()+" "+hs.getContact()+" "+hs.getEmail());
            }
        }
        session.close();
    }
}
