package net.codetest.backendjava.crud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee  {

    private Long id;
   
    private String firstName;
  
    private String secondName;

   
    private String surName;

  
    private String secondSurName;

    
    private String professionalCard;

    
   
    private String address;

   
    private String phone;

   
    private String mobile;

   
    private String emailId;

  
    private String approverId;

    
    private String directorId;

   
    private String active;

   
    private String creationUser;

    
    private String creationDate;

   
    private String lastModificationUser;

    
    private String lastModificationDate;

   
    private String rolCat;

   
    private String hierarchyLevel;

    
    private String expeditionPlaceId;

   
    private String typeIdentification;

    
   
    private String numberIdentification;
 
     
   
    private String idCity;

     
   
    private String idDepartment;
 
    public Employee() {
  
    }
 
    public Employee(
       
         String firstName,
  
         String secondName,
    
       
         String surName,
    
      
         String secondSurName,
    
        
         String professionalCard,
    
        
       
         String address,
    
       
         String phone,
    
       
         String mobile,
    
       
         String emailId,
    
      
         String approverId,
    
        
         String directorId,
    
       
         String active,
    
       
         String creationUser,
    
        
         String creationDate,
    
       
         String lastModificationUser,
    
        
         String lastModificationDate,
    
       
         String rolCat,
    
       
         String hierarchyLevel,
    
        
         String expeditionPlaceId,
    
       
         String typeIdentification,
    
        
       
         String numberIdentification,
     
         
       
         String idCity,

         String idDepartment
    

        ) {

           this.firstName=firstName;
  
           this.secondName=secondName;
       
          
           this.surName=surName;
       
         
           this.secondSurName=secondSurName;
       
           
           this.professionalCard=professionalCard;
       
           
          
           this.address=address;
       
          
           this.phone=phone;
       
          
           this.mobile=mobile;
       
          
           this.emailId=emailId;
       
         
           this.approverId=approverId;
       
           
           this.directorId=directorId;
       
          
           this.active=active;
       
          
           this.creationUser=creationUser;
       
           
           this.creationDate=creationDate;
       
          
           this.lastModificationUser=lastModificationUser;
       
           
           this.lastModificationDate=lastModificationDate;
       
          
           this.rolCat=rolCat;
       
          
           this.hierarchyLevel=hierarchyLevel;
       
           
           this.expeditionPlaceId=expeditionPlaceId;
       
          
           this.typeIdentification=typeIdentification;
       
           
          
           this.numberIdentification=numberIdentification;
        
            
          
           this.idCity=idCity;
   
           this.idDepartment=idDepartment;
  }
  

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
      public Long getId() {
      return id;
  }
  public void setId(Long id) {
      this.id = id;
  }

   
  @Column(name = "PRIMER_NOMBRE", nullable = false)
  public String getFirstName() {
      return firstName;
  }
  public void setFirstName(String firstName) {
      this.firstName = firstName;
  }

  

 


  
  @Column(name = "CORREO_ELECTRONICO", nullable = false)
  public String getEmailId() {
      return emailId;
  }
  public void setEmailId(String emailId) {
      this.emailId = emailId;
  }

  
  @Column(name = "ACTIVO", nullable = false)
  public String getActive() {
      return active;
  }
  
  @Column(name = "DIRECCION", nullable = false)
  public String getAddress() {
      return address;
  
     }
     @Column(name = "APROBADOR_ID", nullable = false)
  public String getApproverId() {
      return approverId;
  }
  
  @Column(name = "FECHA_CREACION", nullable = false)
  public String getCreationDate() {
      return creationDate;
  }
  
  @Column(name = "USUARIO_CREACION", nullable = false)
  public String getCreationUser() {
      return creationUser;
  }
  
  @Column(name = "DIRECTOR_ID", nullable = false)
  public String getDirectorId() {
      return directorId;
  }
  
  @Column(name = "LUGAR_EXPEDICION_ID", nullable = false)
  public String getExpeditionPlaceId() {
      return expeditionPlaceId;
  }
  
  @Column(name = "NIVEL_JERARQUIA_CAT", nullable = false)
  public String getHierarchyLevel() {
      return hierarchyLevel;
  }
  
  @Column(name = "CIUDAD_ID", nullable = false)
  public String getIdCity() {
      return idCity;
  }
  
  @Column(name = "DEPARTAMENTO_ID", nullable = false)
  public String getIdDepartment() {
      return idDepartment;
  }
  
  @Column(name = "FECHA_ULTIMA_MODIFICACION", nullable = false)
  public String getLastModificationDate() {
      return lastModificationDate;
  }
  
  @Column(name = "USUARIO_ULTIMA_MODIFICACION", nullable = false)
  public String getLastModificationUser() {
      return lastModificationUser;
  }
  
  @Column(name = "CELULAR", nullable = false)
  public String getMobile() {
      return mobile;
  }
  
  @Column(name = "NUMERO_IDENTIFICACION", nullable = false)
  public String getNumberIdentification() {
      return numberIdentification;
  }
  
  @Column(name = "TELEFONO", nullable = false)
  public String getPhone() {
      return phone;
  }
  
  @Column(name = "TARJETA_PROFESIONAL", nullable = false)
  public String getProfessionalCard() {
      return professionalCard;
  }
  
  @Column(name = "ROL_CAT", nullable = false)
  public String getRolCat() {
      return rolCat;
  }
  
 
  
  @Column(name = "SEGUNDO_APELLIDO", nullable = false)
  public String getSecondSurName() {
      return secondSurName;
  }
  
  @Column(name = "PRIMER_APELLIDO", nullable = false)
  public String getSurName() {
      return surName;
  }
  @Column(name = "SEGUNDO_NOMBRE", nullable = false)
  public String getSecondName() {
      return secondName;
  }
  @Column(name = "TIPO_IDENTIFICACION", nullable = false)
  public String getTypeIdentification() {
      return typeIdentification;
  }
  public void setActive(String active) {
      this.active = active;
  }
  public void setAddress(String address) {
      this.address = address;
  }
  public void setApproverId(String approverId) {
      this.approverId = approverId;
  }
  public void setCreationDate(String creationDate) {
      this.creationDate = creationDate;
  }
  public void setCreationUser(String creationUser) {
      this.creationUser = creationUser;
  }
  public void setDirectorId(String directorId) {
      this.directorId = directorId;
  }
  public void setExpeditionPlaceId(String expeditionPlaceId) {
      this.expeditionPlaceId = expeditionPlaceId;
  }
  public void setHierarchyLevel(String hierarchyLevel) {
      this.hierarchyLevel = hierarchyLevel;
  }
  public void setIdCity(String idCity) {
      this.idCity = idCity;
  }
  public void setIdDepartment(String idDepartment) {
      this.idDepartment = idDepartment;
  }
  public void setLastModificationDate(String lastModificationDate) {
      this.lastModificationDate = lastModificationDate;
  }
  public void setLastModificationUser(String lastModificationUser) {
      this.lastModificationUser = lastModificationUser;
  }
  public void setMobile(String mobile) {
      this.mobile = mobile;
  }
  public void setNumberIdentification(String numberIdentification) {
      this.numberIdentification = numberIdentification;
  }
  public void setPhone(String phone) {
      this.phone = phone;
  }
  public void setProfessionalCard(String professionalCard) {
      this.professionalCard = professionalCard;
  }
  public void setRolCat(String rolCat) {
      this.rolCat = rolCat;
  }
  public void setSecondName(String secondName) {
      this.secondName = secondName;
  }
  public void setSecondSurName(String secondSurName) {
      this.secondSurName = secondSurName;
  }
  public void setSurName(String surName) {
      this.surName = surName;
  }
  public void setTypeIdentification(String typeIdentification) {
      this.typeIdentification = typeIdentification;
  }
  

  @Override
  public String toString() {
      return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + secondName + ", emailId=" + emailId
     + "]";
  }

}

