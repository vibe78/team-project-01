
package employees;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author i-am-prinx
 */
public class Employee {
    private int id;
    private String fullName;
    private String email;
    private String mobile;
    private String password;
    private String location;
    private Date dateJoined;
    
    public Employee() {
    }
    
    public Employee(int id, String email, String password, String fullName, String mobile, String location){
        this.id = id;
        this.email = email;
        this.password = password;
        this.fullName = fullName;
        this.mobile = mobile;
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getDateJoined() {
        return dateJoined;
    }

    public void setDateJoined(Date dateJoined) {
        this.dateJoined = dateJoined;
    }
    
    /**
     * help to compare objects of type Employee and also their data member
     * @param object
     * @return boolean
     */
    public boolean equals(Object object){
        
        // if the object is compared with itself
        if ( this == object) return true;
        
        
        /* check if object is an instance of Employee or not
            'null instanceof [type]' also returns false */
        if ( !(object instanceof Employee)) return false;
        
        
        // Typcast object to Employee so data member can be compared
        Employee employee = (Employee) object;
        
        
        // does id equals
        if ( id != employee.id ) return false;
        
        
        // does email equals
        if ( email != null ?    
                !email.equals(employee.email) :    
                employee.email != null
           ) return false;
        
        
        // does fullName equals
        if ( fullName != null ?
                !fullName.equals(employee.fullName) :
                employee.fullName != null
           ) return false;
        
        
        // does password equals
        if ( password != null ?
                !password.equals(employee.password):
                employee.password != null 
           ) return false;
        
        
        // does mobile equals
        if ( mobile != null ?
                !mobile.equals(employee.mobile):
                employee.mobile != null                
           ) return false;
        
        
        // does location equals
        if ( location != null ?
                !location.equals(employee.location) :
                employee.location != null
            ) return false;
        
        
        // does dateJoined equals
        if ( dateJoined != null ?
                !dateJoined.equals(employee.dateJoined) :
                employee.dateJoined != null
            ) return false;
        
        
        // only if all data member compared tallies 
        return true;
    }
    
    public int hashCode(){
        int hash;
        hash = id;
        hash = 29 * hash + (email != null ? email.hashCode() : 0);
        hash = 29 * hash + (password != null ? password.hashCode() : 0);
        hash = 29 * hash + (int) id;
        return hash;
    }
    
    
    /**
     * returns a string representation of object
     */
    @Override
    public String toString(){
        return this.fullName;
    }
}
