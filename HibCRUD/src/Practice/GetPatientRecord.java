
package Practice;

import hib.dto.Patient;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetPatientRecord 
{
    public static void main(String args[])
    {
        Configuration c1=new Configuration();
        Configuration c2=c1.configure();
        SessionFactory sf=c2.buildSessionFactory();
        Session session=sf.openSession();
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the patient registration number:");
        int regNo=sc.nextInt();
        
        Patient pt =(Patient)session.get(Patient.class,regNo);
        
        if(pt==null)
        {
            System.out.println("no record found");
        }
        else
        {
            System.out.println(pt.getPatientName()+" "+pt.getContactNo()+" "+pt.getAge()+" "+pt.getGender()+" "+pt.getPatientDetails()+" "+pt.getDiseaseName());
        }
    }
}
