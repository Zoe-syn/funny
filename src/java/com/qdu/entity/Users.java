package com.qdu.entity;
// Generated 2019-11-20 19:43:24 by Hibernate Tools 4.3.1


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Users generated by hbm2java
 */
@Entity
@Table(name="Users"
    ,schema="dbo"
    ,catalog="C2C"
)
public class Users  implements Serializable {


     private String uid;
     private String uname;
     private String upwd;
     private String uquestion;
     private String uanswer;

    public Users() {
    }

	
    public Users(String uid, String uname, String upwd) {
        this.uid = uid;
        this.uname = uname;
        this.upwd = upwd;
    }
    public Users(String uid, String uname, String upwd, String uquestion, String uanswer) {
       this.uid = uid;
       this.uname = uname;
       this.upwd = upwd;
       this.uquestion = uquestion;
       this.uanswer = uanswer;
    }
   
     @Id 

    
    @Column(name="UID", unique=true, nullable=false, length=4)
    public String getUid() {
        return this.uid;
    }
    
    public void setUid(String uid) {
        this.uid = uid;
    }

    
    @Column(name="UName", nullable=false)
    public String getUname() {
        return this.uname;
    }
    
    public void setUname(String uname) {
        this.uname = uname;
    }

    
    @Column(name="UPwd", nullable=false)
    public String getUpwd() {
        return this.upwd;
    }
    
    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }

    
    @Column(name="UQuestion")
    public String getUquestion() {
        return this.uquestion;
    }
    
    public void setUquestion(String uquestion) {
        this.uquestion = uquestion;
    }

    
    @Column(name="UAnswer")
    public String getUanswer() {
        return this.uanswer;
    }
    
    public void setUanswer(String uanswer) {
        this.uanswer = uanswer;
    }




}


