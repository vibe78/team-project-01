package customers;

/**
 *
 * @author i-am-prinx
 */
public class Customer {
    private int id;
    private String fullName;
    private String email;
    private String mobile;
    private String password;
    private String location;
    
    public Customer() {
    }
    
    public Customer(int id, String email, String password, String fullName, String mobile, String location){
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
        if ( !(object instanceof Customer)) return false;
        
        
        // Typcast object to Employee so data member can be compared
        Customer customer = (Customer) object;
        
        
        // does id equals
        if ( id != customer.id ) return false;
        
        
        // does email equals
        if ( email != null ?    
                !email.equals(customer.email) :    
                customer.email != null
           ) return false;
        
        
        // does fullName equals
        if ( fullName != null ?
                !fullName.equals(customer.fullName) :
                customer.fullName != null
           ) return false;
        
        
        // does password equals
        if ( password != null ?
                !password.equals(customer.password):
                customer.password != null 
           ) return false;
        
        
        // does mobile equals
        if ( mobile != null ?
                !mobile.equals(customer.mobile):
                customer.mobile != null                
           ) return false;
        
        
        // does location equals
        if ( location != null ?
                !location.equals(customer.location) :
                customer.location != null
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
}