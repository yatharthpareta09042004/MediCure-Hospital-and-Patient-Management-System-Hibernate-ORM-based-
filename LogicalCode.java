package spring.dao;

import java.util.List;
import org.springframework.orm.hibernate3.HibernateTemplate;
import spr.hib.soft.AdminLogin;
import spr.hib.soft.Bill;
import spr.hib.soft.Doctor;
import spr.hib.soft.Patient;
import spr.hib.soft.PatientBed;
import spr.hib.soft.PatientComplain;
import spr.hib.soft.PatientReport;
import spr.hib.soft.Prescription;
import spr.hib.soft.VisitorPass;


public class LogicalCode {
    
    private HibernateTemplate template;
    

    public HibernateTemplate getTemplate() {
        return template;
    }

    public void setTemplate(HibernateTemplate template) {
        this.template = template;
    }
    public boolean checkAdminLogin(String aId,String aPassword)
    {
        List<AdminLogin>list=
        template.find("from AdminLogin where aId=? and aPassword=?",aId,aPassword);
       if(list.isEmpty())
           return false;
       else
       return true;
    }
    
    public boolean checkPatientLogin(String patientId,String password)
    {
        List<Patient>list=
        template.find("from Patient where patientId=? and password=?",patientId,password);
       if(list.isEmpty())
           return false;
       else
       return true;
    }
    
    public boolean verification(String aId,String aPassword)
    {
    List<AdminLogin>list=
        template.find("from AdminLogin where aId=? and aPassword=?",aId,aPassword);
       if(list.isEmpty())
           return false;
       else
       return true;
    
    }
    
     public boolean verification1(String patientId,String password)
    {
    List<Patient>list=
        template.find("from Patient where patientId=? and password=?",patientId,password);
       if(list.isEmpty())
           return false;
       else
       return true;
    
    }
    
     public boolean changePassword(String aId,String newPassword)
    {
    List<AdminLogin>record=
        template.find("from AdminLogin where aId=?", aId);
       for(AdminLogin data:record)
       {
       
       data.setaPassword(newPassword);
               template.update(data);
               
               }
        return true;
    }
        
         public boolean changePassword1(String patientId,String newPassword)
    {
    List<Patient>record=
        template.find("from Patient where patientId=?", patientId);
       for(Patient data:record)
       {
       
       data.setPassword(newPassword);
               template.update(data);
               
               }
        return true;
    
    }
    
         public List showPatientData()
         {
             List<Patient> list=template.find("from Patient");
             return list;
         }
         
         public List showPatientBed()
         {
            List<PatientBed> list=template.find("from PatientBed");
             return list;  
         }
         
          public List showPatientReport()
         {
            List<PatientReport> list=template.find("from PatientReport");
             return list;  
         }
          
         public List showPrescription()
         {
             List<Prescription> list=template.find("from Prescription");
             return list;  
         }
         
          public List showBill()
         {
             List<Bill> list=template.find("from Bill");
             return list;  
         }
          
            public List showDoctor()
         {
             List<Doctor> list=template.find("from Doctor");
             return list;  
         }
            
                public List showPatientComplain()
         {
             List<PatientComplain> list=template.find("from PatientComplain");
             return list;  
         }
                
      
    
    
    
    
   public void createPatient( Patient patient)
   {
       template.save(patient);
       
   }
   
   
   public void patientBedRecord( PatientBed pBed)
   {
       template.save(pBed);
       
   }
   
   public void patientReport( PatientReport report)
   {
       template.save(report);
       
   }
   
   public void patientPrescription( Prescription precrip)
   {
       template.save(precrip);
       
   }
   
   public void Bill( Bill bl)
   {
       template.save(bl);
       
   }
   
   public void Doctor( Doctor doctor)
   {
       template.save(doctor);
       
   }
   
    public void PatientComplain( PatientComplain comp)
   {
       template.save(comp);
       
   }
    
    public void VisitorPass( VisitorPass visit)
   {
       template.save(visit);
       
   } 
    
      public void deleteRecord(String patientId)
   {
       List<Patient> record=template.find("From Patient where id=?",patientId);
       for(Patient data:record)
       {
           template.delete(data);
       }
   }
      
        public void deleteBillRecord(String patientId)
   {
       List<Bill> record=template.find("From Bill where patientid=?",patientId);
       for(Bill data:record)
       {
           template.delete(data);
       }
   }
        
          public void deletePatientReport(String patientId)
   {
       List<PatientReport> record=template.find("From PatientReport where patientid=?",patientId);
       for(PatientReport data:record)
       {
           template.delete(data);
       }
   }
          
          
          public void deletePatientPrescription(String patientId)
   {
       List<Prescription> record=template.find("From Prescription where patientid=?",patientId);
       for(Prescription data:record)
       {
           template.delete(data);
       }
   }
          
         public void deleteDoctor(String doctorId)
   {
       List<Doctor> record=template.find("From Doctor where doctorid=?",doctorId);
       for(Doctor data:record)
       {
           template.delete(data);
       }
   }
         
                public void deletePatientBed(String patientId)
   {
       List<PatientBed> record=template.find("From PatientBed where patientid=?",patientId);
       for(PatientBed data:record)
       {
           template.delete(data);
       }
   }
          
      
   public List callPatientRecord()
   {
       List<Patient> list=template.find("from Patient");
       return list;
   }
      
    public void updateProfile(String patientId,String name,String gender,int age,String contactNo,String address,int pincode,String city,long aadharNo,String disease)
    {
       List<Patient>record=template.find("from Patient where id=?",patientId);
       for(Patient data:record)
       {
           data.setName(name);
           data.setDisease(disease);
           data.setContactNo(contactNo);
           data.setCity(city);
           data.setAge(age);
           data.setGender(gender);
           data.setAadharNo(aadharNo);
           data.setPincode(pincode);
           
           template.update(data);
       }
    }
    
     public List patientBedRecord()
   {
       List<PatientBed> list=template.find("from PatientBed");
       return list;
   }
     
     public void updateBedProfile(String patientId,int bedNo,String disease,String alotDate)
    {
       List<PatientBed>record=template.find("from PatientBed where patientId=?",patientId);
       for(PatientBed data:record)
       {
           data.setBedNo(bedNo);
           data.setDisease(disease);
           data.setAlotDate(alotDate);
           template.update(data);
       }
    } 
      
     public void updatePatientReport(String patientId,String disease,String patientReport,String doctor)
    {
       List<PatientReport>rep=template.find("from PatientReport where patientId=?",patientId);
       for(PatientReport data:rep)
       {
           
           data.setDisease(disease);
           data.setPatientReport(patientReport);
           data.setDoctor(doctor);
           template.update(data);
       }
    } 
     
     
      
     public void updatePrescription(String patientId,String prescription)
    {
       List<Prescription>prep=template.find("from Prescription where patientId=?",patientId);
       for(Prescription data:prep)
       {
           
           data.setPrescription(prescription);
          
           template.update(data);
       }
    }  
     
     public void updatePatientBill(String patientId,String bill,String billDescription)
    {
       List<Bill>bil=template.find("from Bill where id=?",patientId);
       for(Bill data:bil)
       {
           data.setBill(bill);
           data.setBillDescription(billDescription);
          
           template.update(data);
       }
    }   
     
     public void updateDoctorProfile(String doctorId,String name,String degree,String experience,String speacility)
    {
       List<Doctor>doc=template.find("from Doctor where doctorId=?",doctorId);
       for(Doctor data:doc)
       {
           data.setName(name);
           data.getDegree();
           data.getExperience();
           data.getSpeciality();
           template.update(data);
       }
    }    
       
    
   }
   