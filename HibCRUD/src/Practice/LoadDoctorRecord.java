
package Practice;

import hib.dto.Doctor;
import java.util.Scanner;
import org.hibernate.ObjectNotFoundException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class LoadDoctorRecord 
{
     public static void main(String args[])
    {
        Configuration c1=new Configuration();
        Configuration c2=c1.configure();
        SessionFactory sf=c2.buildSessionFactory();
        Session session=sf.openSession();
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the doctor id:");
        int doctId=sc.nextInt();
        
        try
        {
        Doctor dc =(Doctor)session.load(Doctor.class,doctId);
          System.out.println(dc.getDoctorName()+" "+dc.getPassword()+" "+dc.getSpecialization()+" "+dc.getExperience()+" "+dc.getContact());

          }
        catch(ObjectNotFoundException ex)
        {
            System.out.println("no record found");
        }
      
    } 

}
