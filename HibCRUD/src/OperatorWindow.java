
//import hib.dto.AdminLogin;
import hib.dto.BillingCounter1;
import hib.dto.BloodBank1;
import hib.dto.BloodDonorReg;
import hib.dto.Complain;
import hib.dto.Doctor1;
import hib.dto.Feedback;
import hib.dto.Patient1;
import hib.dto.LabDetail;
import hib.dto.NgoLogin;
import hib.dto.OperatorLogin;
import java.awt.Color;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import javax.swing.table.DefaultTableModel;
import org.jdatepicker.DateModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author manis
 */
public class OperatorWindow extends javax.swing.JFrame {

    /**
     * Creates new form OperatorWindow
     */
     DefaultTableModel tm;
    public OperatorWindow() 
    {
        initComponents();
         getContentPane().setBackground(Color.gray);
        
        Date date=new Date();
        DateFormat df=DateFormat.getDateInstance(DateFormat.FULL);
        jLabel1.setText(df.format(date));
        loadData();
        loadData1();
        loadData2();
        loadData3();
        loadData4();
        loadData5();
        loadData6();
    }
    public void loadData()
    {
        Configuration c1=new Configuration();
        Configuration c2=c1.configure();
        SessionFactory sf=c2.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
                       
        Criteria crit=session.createCriteria(Patient1.class);
        
        List<Patient1>data=crit.list();
        tm=(DefaultTableModel)jTable1.getModel();//down casting
        for(Patient1 patient:data)
        {
            Object obj[]={patient.getRegNo(),patient.getPatientName(),patient.getContactNo(),patient.getDob(),patient.getGender(),patient.getStatus(),patient.getAddress(),patient.getCity(),patient.getBloodGroup(),patient.getDiseaseName()};
            tm.addRow(obj);
            jComboBox3.addItem(""+patient.getRegNo());
        }
    }
    
     public void loadData1()
    {
        Configuration c1=new Configuration();
        Configuration c2=c1.configure();
        SessionFactory sf=c2.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
        
        Criteria q=session.createCriteria(Doctor1.class);
        List<Doctor1>data1=q.list();
        tm=(DefaultTableModel)jTable2.getModel();//down casting
        for(Doctor1 doctor:data1)
        {
            Object obj[]={doctor.getDoctId(),doctor.getDoctName(),doctor.getPassword(),doctor.getContact(),doctor.getSpecialization(),doctor.getExperience(),doctor.getEducation(),doctor.getEmail()};
            tm.addRow(obj);
            jComboBox4.addItem(""+doctor.getDoctId());
        }
    }
     
     public void loadData2()
    {
        Configuration c1=new Configuration();
        Configuration c2=c1.configure();
        SessionFactory sf=c2.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
        
        Criteria q=session.createCriteria(BillingCounter1.class);
        List<BillingCounter1>data1=q.list();
        tm=(DefaultTableModel)jTable3.getModel();//down casting
        for(BillingCounter1 bill:data1)
        {
            Object obj[]={ bill.getRegNo(),bill.getPatientName(),bill.getDiseaseName(),bill.getPaymentMode(),bill.getAmount()};
            tm.addRow(obj);
            jComboBox1.addItem(""+bill.getRegNo());
        }
    }
     
     public void loadData3()
    {
        Configuration c1=new Configuration();
        Configuration c2=c1.configure();
        SessionFactory sf=c2.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
        
        Criteria q=session.createCriteria(BloodBank1.class);
        List<BloodBank1>data=q.list();
        tm=(DefaultTableModel)jTable4.getModel();//down casting
        for(BloodBank1 bank:data)
        {
            Object obj[]={bank.getRegNo(),bank.getBloodGroup(),bank.getQuantity()};
            tm.addRow(obj);
            jComboBox5.addItem(""+bank.getRegNo());
        }
    }
       public void loadData4()
    {
        Configuration c1=new Configuration();
        Configuration c2=c1.configure();
        SessionFactory sf=c2.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
        
        Criteria q=session.createCriteria(NgoLogin.class);
        List<NgoLogin>data=q.list();
        tm=(DefaultTableModel)jTable5.getModel();//down casting
        for(NgoLogin ngo:data)
        {
            Object obj[]={ngo.getLoginId(),ngo.getPassword(),ngo.getNgoName(),ngo.getNgoId(),ngo.getNgoEstablishedYear(),ngo.getContact(),ngo.getDateOfRegistration(),ngo.getAddress(),ngo.getCity(),ngo.getEmail()};
            tm.addRow(obj);
            jComboBox6.addItem(""+ngo.getLoginId());
        }
    }
        public void loadData5()
    {
        Configuration c1=new Configuration();
        Configuration c2=c1.configure();
        SessionFactory sf=c2.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
        
        Criteria q=session.createCriteria(Complain.class);
        List<Complain>data=q.list();
        tm=(DefaultTableModel)jTable6.getModel();//down casting
        for(Complain complain:data)
        {
            Object obj[]={complain.getRegNo(),complain.getName(),complain.getContactNo(),complain.getDate(),complain.getComplain()};
            tm.addRow(obj);
            jComboBox7.addItem(""+complain.getRegNo());
        }
    }
         public void loadData6()
    {
        Configuration c1=new Configuration();
        Configuration c2=c1.configure();
        SessionFactory sf=c2.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
        
        Criteria q=session.createCriteria(Feedback.class);
        List<Feedback>data=q.list();
        tm=(DefaultTableModel)jTable7.getModel();//down casting
        for(Feedback feedback:data)
        {
            Object obj[]={feedback.getRegNo(),feedback.getName(),feedback.getDate(),feedback.getFeedback()};
            tm.addRow(obj);
            jComboBox8.addItem(""+feedback.getRegNo());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel21 = new javax.swing.JPanel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jComboBox3 = new javax.swing.JComboBox<>();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jComboBox4 = new javax.swing.JComboBox<>();
        jButton6 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton7 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jComboBox5 = new javax.swing.JComboBox<>();
        jButton10 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jComboBox6 = new javax.swing.JComboBox<>();
        jButton11 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jComboBox7 = new javax.swing.JComboBox<>();
        jButton12 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        jComboBox8 = new javax.swing.JComboBox<>();
        jButton13 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel17 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jPasswordField4 = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel17 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jTextField22 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jPanel15 = new javax.swing.JPanel();
        jScrollPane19 = new javax.swing.JScrollPane();
        jPanel18 = new javax.swing.JPanel();
        jTextField5 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jButton14 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jDatePicker1 = new org.jdatepicker.JDatePicker();
        jLabel23 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel24 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel26 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel27 = new javax.swing.JLabel();
        jComboBox9 = new javax.swing.JComboBox<>();
        jLabel28 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jPanel26 = new javax.swing.JPanel();
        jTextField23 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jButton21 = new javax.swing.JButton();
        jLabel53 = new javax.swing.JLabel();
        jComboBox12 = new javax.swing.JComboBox<>();
        jTextField27 = new javax.swing.JTextField();
        jPanel22 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jTextField25 = new javax.swing.JTextField();
        jPanel24 = new javax.swing.JPanel();
        jScrollPane15 = new javax.swing.JScrollPane();
        jPanel25 = new javax.swing.JPanel();
        jTextField16 = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jButton19 = new javax.swing.JButton();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jButton20 = new javax.swing.JButton();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jScrollPane16 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jComboBox10 = new javax.swing.JComboBox<>();
        jTextField19 = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jScrollPane17 = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();
        jLabel48 = new javax.swing.JLabel();
        jTextField21 = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jLabel50 = new javax.swing.JLabel();
        jComboBox11 = new javax.swing.JComboBox<>();
        jTextField26 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane13 = new javax.swing.JScrollPane();
        jPanel6 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jPasswordField3 = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTabbedPane1.setForeground(new java.awt.Color(51, 51, 51));
        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "regNo", "patientName", "contactNo", "dob", "gender", "status", "address", "city", "bloodGroup", "diseaseName"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        jButton5.setText("DELETE");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select regNo" }));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButton5)
                .addContainerGap(230, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Patient Details", jPanel8);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "doctId", "doctName", "password", "contNo", "experience", "specialization", "education", "email"
            }
        ));
        jScrollPane4.setViewportView(jTable2);

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select user" }));

        jButton6.setText("DELETE");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jButton6)
                .addContainerGap(229, Short.MAX_VALUE))
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 777, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(304, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6))
                .addGap(31, 31, 31))
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addGap(29, 29, 29)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(73, Short.MAX_VALUE)))
        );

        jTabbedPane2.addTab("Doctor Details", jPanel9);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "regNo", "patientName", "diseaseName", "paymentMode", "amount"
            }
        ));
        jScrollPane5.setViewportView(jTable3);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select   RegNo" }));

        jButton7.setText("DELETE");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5)
                .addContainerGap())
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jButton7)
                .addContainerGap(267, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Billing Counter Details", jPanel10);

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "regNo", "bloodGroup", "quantity"
            }
        ));
        jScrollPane6.setViewportView(jTable4);

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select id" }));

        jButton10.setText("DELETE");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 769, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(241, 241, 241)
                        .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jButton10)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Blood Bank Details", jPanel11);

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "loginId", "password", "ngoName", "ngoId", "ngoEstablismentDate", "contact", "dateOfRegistration", "address", "city", "email"
            }
        ));
        jScrollPane7.setViewportView(jTable5);

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select id" }));

        jButton11.setText("DELETE");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(234, 234, 234)
                .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jButton11)
                .addContainerGap(235, Short.MAX_VALUE))
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel12Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 777, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(313, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11))
                .addGap(22, 22, 22))
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel12Layout.createSequentialGroup()
                    .addGap(53, 53, 53)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(49, Short.MAX_VALUE)))
        );

        jTabbedPane2.addTab("NGO Details", jPanel12);

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "regNo", "name", "contactNo", "date", "complainDetail"
            }
        ));
        jScrollPane8.setViewportView(jTable6);

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select regNo" }));

        jButton12.setText("DELETE");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(242, 242, 242)
                .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton12)
                .addContainerGap(215, Short.MAX_VALUE))
            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel13Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane8)
                    .addContainerGap()))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(309, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12))
                .addGap(26, 26, 26))
            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel13Layout.createSequentialGroup()
                    .addGap(59, 59, 59)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(55, Short.MAX_VALUE)))
        );

        jTabbedPane2.addTab("Complain", jPanel13);

        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "regNo", "name", "date", "feedback"
            }
        ));
        jScrollPane9.setViewportView(jTable7);

        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select regNo" }));

        jButton13.setText("DELETE");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(248, 248, 248)
                .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jButton13)
                .addContainerGap(236, Short.MAX_VALUE))
            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel14Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane9)
                    .addContainerGap()))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(308, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton13))
                .addGap(27, 27, 27))
            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel14Layout.createSequentialGroup()
                    .addGap(59, 59, 59)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(55, Short.MAX_VALUE)))
        );

        jTabbedPane2.addTab("Feedback", jPanel14);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addGap(75, 75, 75))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addGap(17, 17, 17))
        );

        jTabbedPane1.addTab("VIEW", jPanel1);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel10.setFont(new java.awt.Font("Bernard MT Condensed", 2, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 243));
        jLabel10.setText("Doctor Name");

        jTextField2.setBackground(new java.awt.Color(204, 255, 255));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jPasswordField4.setBackground(new java.awt.Color(204, 255, 255));

        jLabel11.setFont(new java.awt.Font("Bernard MT Condensed", 2, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 243));
        jLabel11.setText("Doctor Id");

        jLabel12.setFont(new java.awt.Font("Bernard MT Condensed", 2, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 243));
        jLabel12.setText("Password");

        jTextField3.setBackground(new java.awt.Color(204, 255, 255));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Bernard MT Condensed", 2, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 0, 243));
        jLabel13.setText("Contact");

        jLabel14.setFont(new java.awt.Font("Bernard MT Condensed", 2, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 0, 243));
        jLabel14.setText("Experience");

        jLabel15.setFont(new java.awt.Font("Bernard MT Condensed", 2, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 0, 243));
        jLabel15.setText("Specialization");

        jLabel16.setFont(new java.awt.Font("Bernard MT Condensed", 2, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 0, 243));
        jLabel16.setText("Education");

        jTextField4.setBackground(new java.awt.Color(204, 255, 255));
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane10.setViewportView(jTextArea2);

        jLabel17.setFont(new java.awt.Font("Bernard MT Condensed", 2, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 0, 243));
        jLabel17.setText("Email");

        jButton3.setText("Submit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton8.setText("Reset");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jTextField22.setBackground(new java.awt.Color(204, 255, 255));
        jTextField22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField22ActionPerformed(evt);
            }
        });

        jTextField24.setBackground(new java.awt.Color(204, 255, 255));
        jTextField24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField24ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel17Layout.createSequentialGroup()
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel17Layout.createSequentialGroup()
                                    .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel15))
                                    .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel17Layout.createSequentialGroup()
                                            .addGap(120, 120, 120)
                                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                                            .addGap(58, 58, 58)
                                            .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jPasswordField4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(jButton3)
                        .addGap(36, 36, 36)
                        .addComponent(jButton8)))
                .addGap(69, 427, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPasswordField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton8))
                .addContainerGap(181, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel17);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(305, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane3.addTab("Doctor Entry", jPanel7);

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.setForeground(new java.awt.Color(255, 255, 0));
        jPanel18.setOpaque(false);
        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField5.setBackground(new java.awt.Color(204, 255, 255));
        jPanel18.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 290, -1));

        jLabel18.setFont(new java.awt.Font("Bernard MT Condensed", 2, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 0, 252));
        jLabel18.setText("DOB");
        jPanel18.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 40, -1));

        jButton9.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jButton9.setText("Submit");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel18.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 500, -1, -1));

        jLabel20.setFont(new java.awt.Font("Bernard MT Condensed", 2, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 0, 252));
        jLabel20.setText("ContactNo");
        jPanel18.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 90, -1));

        jLabel21.setFont(new java.awt.Font("Bernard MT Condensed", 2, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 0, 252));
        jLabel21.setText("PatientName");
        jPanel18.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 80, -1));

        jButton14.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jButton14.setText("Reset");
        jPanel18.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 500, -1, -1));

        jLabel22.setFont(new java.awt.Font("Bernard MT Condensed", 2, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 0, 243));
        jLabel22.setText("RegNo");
        jPanel18.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 40, 20));

        jTextField6.setBackground(new java.awt.Color(204, 255, 255));
        jPanel18.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 290, -1));

        jTextField7.setBackground(new java.awt.Color(204, 255, 255));
        jPanel18.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 290, -1));
        jPanel18.add(jDatePicker1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 290, -1));

        jLabel23.setFont(new java.awt.Font("Bernard MT Condensed", 2, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 0, 252));
        jLabel23.setText("Gender");
        jPanel18.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 50, -1));

        jRadioButton1.setText("FEMALE");
        jPanel18.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, -1, -1));

        jRadioButton2.setText("MALE");
        jPanel18.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, -1, -1));

        jLabel24.setFont(new java.awt.Font("Bernard MT Condensed", 2, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 0, 252));
        jLabel24.setText("Marital Status");
        jPanel18.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 80, -1));

        jCheckBox1.setText("MARRIED");
        jPanel18.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, -1, -1));

        jCheckBox2.setText("UNMARRIED");
        jPanel18.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, -1, -1));

        jLabel25.setFont(new java.awt.Font("Bernard MT Condensed", 2, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 0, 252));
        jLabel25.setText("Address");
        jPanel18.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 80, -1));

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane12.setViewportView(jTextArea3);

        jPanel18.add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 290, -1));

        jLabel26.setFont(new java.awt.Font("Bernard MT Condensed", 2, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 0, 252));
        jLabel26.setText("City");
        jPanel18.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 40, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select city", "indore", "bhopal", "ujjain" }));
        jPanel18.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, 280, -1));

        jLabel27.setFont(new java.awt.Font("Bernard MT Condensed", 2, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 0, 252));
        jLabel27.setText("Blood group");
        jPanel18.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, 80, -1));

        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select blood group", "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-" }));
        jPanel18.add(jComboBox9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, 220, -1));

        jLabel28.setFont(new java.awt.Font("Bernard MT Condensed", 2, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 0, 252));
        jLabel28.setText("DiseaseName");
        jPanel18.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, 80, -1));

        jTextField8.setBackground(new java.awt.Color(204, 255, 255));
        jPanel18.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 450, 290, -1));

        jLabel30.setFont(new java.awt.Font("Bernard MT Condensed", 2, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 0, 243));
        jLabel30.setText("RegNo");
        jPanel18.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 40, 20));

        jScrollPane19.setViewportView(jPanel18);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(322, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane19, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane3.addTab("Patient Entry", jPanel15);

        jLabel19.setFont(new java.awt.Font("Bernard MT Condensed", 2, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 0, 243));
        jLabel19.setText("Patient Name");

        jTextField9.setBackground(new java.awt.Color(204, 255, 255));
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Bernard MT Condensed", 2, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 0, 243));
        jLabel29.setText("RegNo");

        jLabel31.setFont(new java.awt.Font("Bernard MT Condensed", 2, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 0, 243));
        jLabel31.setText("Disease Name");

        jTextField10.setBackground(new java.awt.Color(204, 255, 255));
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Bernard MT Condensed", 2, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 0, 243));
        jLabel32.setText("Payment Mode");

        jLabel33.setFont(new java.awt.Font("Bernard MT Condensed", 2, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 0, 243));
        jLabel33.setText("Amount");

        jTextField11.setBackground(new java.awt.Color(204, 255, 255));
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });

        jTextField12.setBackground(new java.awt.Color(204, 255, 255));
        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });

        jTextField13.setBackground(new java.awt.Color(204, 255, 255));
        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });

        jButton15.setText("Submit");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setText("Reset");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(jButton15)
                        .addGap(29, 29, 29)
                        .addComponent(jButton16)))
                .addContainerGap(148, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton15)
                    .addComponent(jButton16))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(356, 356, 356))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(262, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Billing Counter Entry", jPanel16);

        jPanel26.setBackground(new java.awt.Color(255, 255, 255));
        jPanel26.setForeground(new java.awt.Color(255, 255, 0));
        jPanel26.setOpaque(false);
        jPanel26.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField23.setBackground(new java.awt.Color(204, 255, 255));
        jTextField23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField23ActionPerformed(evt);
            }
        });
        jPanel26.add(jTextField23, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 290, -1));

        jButton4.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jButton4.setText("Submit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel26.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, -1, -1));

        jLabel51.setFont(new java.awt.Font("Bernard MT Condensed", 2, 14)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 0, 252));
        jLabel51.setText("Quantity");
        jPanel26.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 90, -1));

        jLabel52.setFont(new java.awt.Font("Bernard MT Condensed", 2, 14)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 0, 252));
        jLabel52.setText("BloodGroup");
        jPanel26.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 80, 80, -1));

        jButton21.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jButton21.setText("Reset");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanel26.add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, -1, -1));

        jLabel53.setFont(new java.awt.Font("Bernard MT Condensed", 2, 14)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 0, 243));
        jLabel53.setText("Id");
        jPanel26.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 40, 20));

        jComboBox12.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select blood group", "A+", "A-", "B+", "B-", "AB+AB-", "O+", "O-" }));
        jPanel26.add(jComboBox12, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 290, -1));

        jTextField27.setBackground(new java.awt.Color(204, 255, 255));
        jTextField27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField27ActionPerformed(evt);
            }
        });
        jPanel26.add(jTextField27, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 290, -1));

        jScrollPane11.setViewportView(jPanel26);

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(311, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(236, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Blood Bank Entry", jPanel20);

        jLabel34.setFont(new java.awt.Font("Bernard MT Condensed", 2, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 0, 243));
        jLabel34.setText("Lab Name");

        jLabel35.setFont(new java.awt.Font("Bernard MT Condensed", 2, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 0, 243));
        jLabel35.setText("Lab No");

        jTextField14.setBackground(new java.awt.Color(204, 255, 255));
        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Bernard MT Condensed", 2, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 0, 243));
        jLabel36.setText("Floor No");

        jTextField15.setBackground(new java.awt.Color(204, 255, 255));
        jTextField15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField15ActionPerformed(evt);
            }
        });

        jButton17.setText("Submit");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setText("Reset");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Bernard MT Condensed", 2, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 0, 243));
        jLabel37.setText("Lab Details");

        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jScrollPane14.setViewportView(jTextArea4);

        jTextField25.setBackground(new java.awt.Color(204, 255, 255));
        jTextField25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField25ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                            .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE))
                        .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGap(87, 87, 87)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(252, Short.MAX_VALUE))
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(jButton17)
                .addGap(18, 18, 18)
                .addComponent(jButton18)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton17)
                    .addComponent(jButton18))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane3.addTab("Lab Details", jPanel22);

        jPanel25.setBackground(new java.awt.Color(255, 255, 255));
        jPanel25.setForeground(new java.awt.Color(255, 255, 0));
        jPanel25.setOpaque(false);
        jPanel25.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField16.setBackground(new java.awt.Color(204, 255, 255));
        jPanel25.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 290, -1));

        jLabel38.setFont(new java.awt.Font("Bernard MT Condensed", 2, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 0, 252));
        jLabel38.setText("Age");
        jPanel25.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 30, -1));

        jButton19.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jButton19.setText("Submit");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel25.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 680, -1, -1));

        jLabel39.setFont(new java.awt.Font("Bernard MT Condensed", 2, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 0, 252));
        jLabel39.setText("ContactNo");
        jPanel25.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 90, -1));

        jLabel40.setFont(new java.awt.Font("Bernard MT Condensed", 2, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 0, 252));
        jLabel40.setText("Name");
        jPanel25.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 40, -1));

        jButton20.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jButton20.setText("Reset");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jPanel25.add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 680, -1, -1));

        jTextField17.setBackground(new java.awt.Color(204, 255, 255));
        jPanel25.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 290, -1));

        jTextField18.setBackground(new java.awt.Color(204, 255, 255));
        jPanel25.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 290, -1));

        jLabel41.setFont(new java.awt.Font("Bernard MT Condensed", 2, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 0, 252));
        jLabel41.setText("Gender");
        jPanel25.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 50, -1));

        jRadioButton3.setText("FEMALE");
        jPanel25.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, -1, -1));

        jRadioButton4.setText("MALE");
        jPanel25.add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, -1, -1));

        jLabel42.setFont(new java.awt.Font("Bernard MT Condensed", 2, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 0, 252));
        jLabel42.setText("Email");
        jPanel25.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 213, 50, -1));

        jLabel43.setFont(new java.awt.Font("Bernard MT Condensed", 2, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 0, 252));
        jLabel43.setText("Address");
        jPanel25.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 80, -1));

        jTextArea5.setColumns(20);
        jTextArea5.setRows(5);
        jScrollPane16.setViewportView(jTextArea5);

        jPanel25.add(jScrollPane16, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 500, 290, -1));

        jLabel44.setFont(new java.awt.Font("Bernard MT Condensed", 2, 14)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 0, 252));
        jLabel44.setText("City");
        jPanel25.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 40, -1));

        jLabel45.setFont(new java.awt.Font("Bernard MT Condensed", 2, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 0, 252));
        jLabel45.setText("Blood group");
        jPanel25.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 80, -1));

        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select blood group", "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-" }));
        jPanel25.add(jComboBox10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 220, -1));

        jTextField19.setBackground(new java.awt.Color(204, 255, 255));
        jPanel25.add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, 290, -1));

        jLabel46.setFont(new java.awt.Font("Bernard MT Condensed", 2, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 0, 243));
        jLabel46.setText("UserId");
        jPanel25.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 40, 20));

        jTextField20.setBackground(new java.awt.Color(204, 255, 255));
        jPanel25.add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 640, 290, -1));

        jLabel47.setFont(new java.awt.Font("Bernard MT Condensed", 2, 14)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 0, 252));
        jLabel47.setText("Did you ever donate blood before?");
        jPanel25.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 210, -1));

        jTextArea6.setColumns(20);
        jTextArea6.setRows(5);
        jScrollPane17.setViewportView(jTextArea6);

        jPanel25.add(jScrollPane17, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 290, 60));

        jLabel48.setFont(new java.awt.Font("Bernard MT Condensed", 2, 14)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 0, 252));
        jLabel48.setText("Occupation");
        jPanel25.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 80, -1));

        jTextField21.setBackground(new java.awt.Color(204, 255, 255));
        jPanel25.add(jTextField21, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 290, -1));

        jLabel49.setFont(new java.awt.Font("Bernard MT Condensed", 2, 14)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 0, 252));
        jLabel49.setText("MedicalHistory");
        jPanel25.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 510, 100, -1));

        jCheckBox3.setText("YES");
        jPanel25.add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 460, -1, -1));

        jCheckBox4.setText("NO");
        jPanel25.add(jCheckBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 460, -1, -1));

        jLabel50.setFont(new java.awt.Font("Bernard MT Condensed", 2, 14)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 0, 252));
        jLabel50.setText("DonorSignature");
        jPanel25.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 640, 90, -1));

        jComboBox11.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select city", "indore", "bhopal", "ujjain" }));
        jPanel25.add(jComboBox11, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 280, -1));

        jTextField26.setBackground(new java.awt.Color(204, 255, 255));
        jPanel25.add(jTextField26, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 290, -1));

        jScrollPane15.setViewportView(jPanel25);

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane15, javax.swing.GroupLayout.DEFAULT_SIZE, 937, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane15, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane3.addTab("Blood Donor Reg", jPanel24);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 765, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("ENTRY", jPanel2);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setForeground(new java.awt.Color(255, 255, 0));
        jPanel6.setOpaque(false);
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setBackground(new java.awt.Color(204, 255, 255));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel6.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 290, -1));

        jLabel5.setFont(new java.awt.Font("Bernard MT Condensed", 2, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 252));
        jPanel6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 260, 20));

        jButton1.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, -1, -1));

        jPasswordField1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel6.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 290, -1));

        jLabel6.setBackground(new java.awt.Color(204, 204, 255));
        jLabel6.setFont(new java.awt.Font("Bernard MT Condensed", 2, 14)); // NOI18N
        jPanel6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 7, 250, 20));

        jLabel7.setFont(new java.awt.Font("Bernard MT Condensed", 2, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 252));
        jLabel7.setText("NewPassword");
        jPanel6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 90, -1));

        jLabel8.setFont(new java.awt.Font("Bernard MT Condensed", 2, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 252));
        jLabel8.setText("OldPassword");
        jPanel6.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 80, -1));

        jPasswordField2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel6.add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 290, -1));

        jPasswordField3.setBackground(new java.awt.Color(204, 255, 255));
        jPanel6.add(jPasswordField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 290, -1));

        jButton2.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, -1, -1));

        jLabel9.setFont(new java.awt.Font("Bernard MT Condensed", 2, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 243));
        jLabel9.setText("Id");
        jPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 77, 20, 20));

        jLabel54.setFont(new java.awt.Font("Bernard MT Condensed", 2, 14)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 0, 252));
        jLabel54.setText("ConfirmNewPassword");
        jPanel6.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 130, 20));

        jScrollPane13.setViewportView(jPanel6);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 784, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("SETTING", jPanel3);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MediaContent/billlogo.png"))); // NOI18N
        jLabel4.setText("jLabel2");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MediaContent/close-icon-16_2.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(102, 204, 255));

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MediaContent/logout_icon.png"))); // NOI18N
        jLabel2.setOpaque(true);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 410, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 873, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked

        int result=JOptionPane.showConfirmDialog(this,"do you wanna exit?","EXIT MESSAGE",JOptionPane.YES_NO_OPTION);
        if(result==0)
        {
            dispose();
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTextField1.setText("");
        jPasswordField3.setText("");
        jPasswordField2.setText("");
        jPasswordField1.setText("");

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String id=jTextField1.getText();
        String oldPass=new String(jPasswordField3.getPassword());
        String newPass=new String(jPasswordField2.getPassword());
        String cNewPass=new String(jPasswordField1.getPassword());

        if(oldPass.equals(""))
        {
            jLabel5.setText("old password is required");
            //JOptionPane.showMessageDialog(this, old password is required);
        }
        else if(newPass.equals(""))
        {
            jLabel5.setText("new password is required");
        }
        else if(cNewPass.equals(""))
        {
            jLabel5.setText("confirm new password is required");
        }
        else
        {
            Configuration c1=new Configuration();
            Configuration c2=c1.configure();
            SessionFactory sf=c2.buildSessionFactory();
            Session session=sf.openSession();
            Transaction tx=session.beginTransaction();

            Criteria crit=session.createCriteria(OperatorLogin.class);

            crit.add(Restrictions.and(Restrictions.eq("loginId",id),Restrictions.eq("password",oldPass)));
            List<OperatorLogin>data=crit.list();
            if(data.isEmpty())
            {
                jLabel5.setText("invalid id/old password");
            }
            else
            {
                if(newPass.equals(cNewPass))
                {
                    OperatorLogin ad =(OperatorLogin)session.get(OperatorLogin.class,id);
                    ad.setPassword(newPass);
                    session.update(ad);
                    tx.commit();
                    session.close();
                    JOptionPane.showMessageDialog(this,"Password Changed");
                    new OperatorWindow().setVisible(true);
                    dispose();
                }
            
                else
                {
                    jLabel5.setText("new password and confirmed new password doesn't match");
                }
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

        
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
        jTextField15.setText("");
        jTextField14.setText("");
        jTextField25.setText("");
        //jSpinner2.setValue(0);
        jTextArea4.setText("");
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
        int labNo=Integer.parseInt(jTextField25.getText());
        String labName=jTextField14.getText();

        //String floorNo=(String)jSpinner2.getValue();
        String floorNo=(String)jTextField15.getText();
        String labDetails=jTextArea4.getText();

        Configuration c1=new Configuration();
        Configuration c2=c1.configure();
        SessionFactory sf=c2.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();

        //Patient pt=new Patient();
        LabDetail la=new LabDetail(labNo,labName,floorNo,labDetails);
        session.save(la);
        tx.commit();
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jTextField15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField15ActionPerformed

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        int regNo=Integer.parseInt(jTextField9.getText());
        String patientName=jTextField10.getText();
        String diseaseName=jTextField11.getText();
        String paymentMode=jTextField12.getText();
        float amount=Float.parseFloat(jTextField13.getText());

        Configuration c1=new Configuration();
        Configuration c2=c1.configure();
        SessionFactory sf=c2.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();

        BillingCounter1 bc=new BillingCounter1(regNo,patientName,diseaseName,paymentMode,amount);
        session.save(bc);
        tx.commit();
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText("");
        jTextField2.setText("");
        jPasswordField1.setText("");
        jTextField3.setText("");
        //jSpinner1.setValue(0);
        jTextField24.setText("");
        jTextArea1.setText("");
        jTextArea2.setText("");
        jPasswordField2.setText("");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int doctId=Integer.parseInt(jTextField2.getText());
        String doctName=jTextField3.getText();
        char ch[]=jPasswordField4.getPassword();
        String pass=new String(ch);
        long contNo=Long.parseLong(jTextField4.getText());

        String experience=jTextField24.getText();
        String specialization=jTextArea1.getText();
        String education=jTextArea2.getText();
        String email=jTextField22.getText();
        
        Configuration c1=new Configuration();
        Configuration c2=c1.configure();
        SessionFactory sf=c2.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();

        //Patient pt=new Patient();
        Doctor1 pt=new Doctor1(doctId,doctName,pass,contNo,experience,specialization,education,email);
        session.save(pt);
        tx.commit();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        String txt=(String)jComboBox8.getSelectedItem();
        int regNo=Integer.parseInt(txt);
        //String regNo=(String)jComboBox8.getSelectedItem();
        Configuration c1=new Configuration();
        Configuration c2=c1.configure();
        SessionFactory sf=c2.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();

        Feedback fb=(Feedback)session.get(Feedback.class ,regNo);
        session.delete(fb);
        tx.commit();
       // tm.setRowCount(0);
        //jComboBox8.removeAllItems();
        //loadData6();

    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        String txt=(String)jComboBox7.getSelectedItem();
        int regNo=Integer.parseInt(txt);
        //String regNo=(String)jComboBox7.getSelectedItem();
        Configuration c1=new Configuration();
        Configuration c2=c1.configure();
        SessionFactory sf=c2.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();

        Complain cm=(Complain)session.get(Complain.class ,regNo);
        session.delete(cm);
        tx.commit();
        //tm.setRowCount(0);
        //jComboBox7.removeAllItems();
        //loadData5();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        String txt=(String)jComboBox6.getSelectedItem();
        int loginId=Integer.parseInt(txt);
        //String regNo=(String)jComboBox6.getSelectedItem();
        Configuration c1=new Configuration();
        Configuration c2=c1.configure();
        SessionFactory sf=c2.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();

        NgoLogin nl=(NgoLogin)session.get(NgoLogin.class ,loginId);
        session.delete(nl);
        tx.commit();
        //tm.setRowCount(0);
        //jComboBox6.removeAllItems();
        //loadData4();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        String txt=(String)jComboBox5.getSelectedItem();
        int regNo=Integer.parseInt(txt);
        //String regNo=(String)jComboBox5.getSelectedItem();
        Configuration c1=new Configuration();
        Configuration c2=c1.configure();
        SessionFactory sf=c2.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();

        BloodBank1 bl=(BloodBank1)session.get(BloodBank1.class ,regNo);
        session.delete(bl);
        tx.commit();
        //tm.setRowCount(0);
        //jComboBox5.removeAllItems();
        //loadData3();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        String txt=(String)jComboBox1.getSelectedItem();
        int regNo=Integer.parseInt(txt);
        //String regNo=(String)jComboBox1.getSelectedItem();
        Configuration c1=new Configuration();
        Configuration c2=c1.configure();
        SessionFactory sf=c2.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();

        BillingCounter1 bc=(BillingCounter1)session.get(BillingCounter1.class ,regNo);
        session.delete(bc);
        tx.commit();
        //tm.setRowCount(0);
        //jComboBox1.removeAllItems();
        //loadData2();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        //int doctId=(Integer)jComboBox4.getSelectedItem();
        String txt=(String)jComboBox4.getSelectedItem();
        int doctId=Integer.parseInt(txt);
        Configuration c1=new Configuration();
        Configuration c2=c1.configure();
        SessionFactory sf=c2.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();

        Doctor1 dt=(Doctor1)session.get(Doctor1.class ,doctId);
        session.delete(dt);
        tx.commit();
        //tm.setRowCount(0);
        //jComboBox4.removeAllItems();
        //loadData1();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        String txt=(String)jComboBox3.getSelectedItem();
        int regNo=Integer.parseInt(txt);
        // String regNo=(String)jComboBox3.getSelectedItem();
         Configuration c1=new Configuration();
         Configuration c2=c1.configure();
         SessionFactory sf=c2.buildSessionFactory();
         Session session=sf.openSession();
         Transaction tx=session.beginTransaction();
          
        Patient1 pt=(Patient1)session.get(Patient1.class ,regNo);
        session.delete(pt);
        tx.commit();
        //tm.setRowCount(0);
        //jComboBox3.removeAllItems();
        //loadData();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
        int userId=Integer.parseInt(jTextField26.getText());
        String name=jTextField18.getText();
        long contact=Long.parseLong(jTextField17.getText());
        
        String age =(String)jTextField16.getText();
        //String age=(String)jSpinner3.getValue();
        String gender="";
        if(jRadioButton3.isSelected())
        gender="FEMALE";
        if(jRadioButton4.isSelected())
        gender="MALE";
        String email=jTextField21.getText();
        String address=jTextArea6.getText();
        String city=(String)jComboBox11.getSelectedItem();
        String bloodGroup=(String)jComboBox10.getSelectedItem();
        String occupation=jTextField19.getText();
        String bloodDonationHistory="";
        if(jCheckBox3.isSelected())
        bloodDonationHistory="MARRIED";
        if(jCheckBox4.isSelected())
        bloodDonationHistory="UNMARRIED";
        String medicalHistory=jTextArea5.getText();
        String donorSignature=jTextField20.getText();

        Configuration c1=new Configuration();
        Configuration c2=c1.configure();
        SessionFactory sf=c2.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();

        BloodDonorReg bl=new BloodDonorReg(userId,name,contact,age,gender,email,address,city,bloodGroup,occupation,medicalHistory,donorSignature);
        session.save(bl);
        tx.commit();
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        int result=JOptionPane.showConfirmDialog(this,"do you wanna sign out?","SIGN OUT MESSAGE",JOptionPane.YES_NO_OPTION);
     if(result==0)
             {
                 new LoginWindow().setVisible(true);
                 dispose();
             }

    }//GEN-LAST:event_jLabel2MouseClicked

    private void jTextField22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField22ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        int regNo=Integer.parseInt(jTextField5.getText());
        String name=jTextField6.getText();
        long contNo=Long.parseLong(jTextField7.getText());
        DateModel dm=jDatePicker1.getModel();
        String dob=dm.getDay()+""+dm.getMonth()+""+dm.getYear();
        String gender="";
        if(jRadioButton1.isSelected())
            gender="FEMALE";
        if(jRadioButton2.isSelected())
            gender="MALE";
        String status="";
        if(jCheckBox1.isSelected())
            status="MARRIED";
        if(jCheckBox2.isSelected())
            status="UNMARRIED";
        
        String address=jTextArea3.getText();
        String city=(String)jComboBox2.getSelectedItem();
        String bloodGroup=(String)jComboBox9.getSelectedItem();
        String diseaseName=jTextField8.getText();
        
        Configuration c1=new Configuration();
            Configuration c2=c1.configure();
            SessionFactory sf=c2.buildSessionFactory();
            Session session=sf.openSession();
            Transaction tx=session.beginTransaction();

            //Patient pt=new Patient();
            
             Patient1 pt=new Patient1(regNo,name,contNo,dob,gender,status,address,city,bloodGroup,diseaseName);
             session.save(pt);
              tx.commit();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jTextField23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField23ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        int regNo=Integer.parseInt(jTextField27.getText());
        //id=Integer.parseInt(jTextField23.getText());
        //int id=Integer.parseInt(jTextField1.getText());
        String bloodGroup=(String)jComboBox12.getSelectedItem();
        //float quantity=(Float)(jTextField23.getText());
        float quantity = Float.parseFloat(jTextField23.getText());
        //float quantity=(Float)(jSpinner4.getValue());

        Configuration c1=new Configuration();
        Configuration c2=c1.configure();
        SessionFactory sf=c2.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();

        BloodBank1 pt=new BloodBank1(regNo,bloodGroup,quantity);
        session.save(pt);
        tx.commit();

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        jTextField1.setText("");

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jTextField24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField24ActionPerformed

    private void jTextField25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField25ActionPerformed

    private void jTextField27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField27ActionPerformed
                          
           
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OperatorWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox10;
    private javax.swing.JComboBox<String> jComboBox11;
    private javax.swing.JComboBox<String> jComboBox12;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JComboBox<String> jComboBox9;
    private org.jdatepicker.JDatePicker jDatePicker1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField jPasswordField3;
    private javax.swing.JPasswordField jPasswordField4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable7;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea jTextArea6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
        }

