package dev.sevier.RevShopApp.entity;
import jakarta.persistence.*;

@Entity
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ACCOUNT_ID_SEQ")
    @SequenceGenerator(name = "ACCOUNT_ID_SEQ", sequenceName = "ACCOUNT_ID_SEQ", allocationSize = 1)
    private Integer account_id;
    private String username;
    private String password;
    private String email;
    private String address1;
    private String address2;
    private String city;
    private String state;
    private String zipcode;
  
    public Account(){

    }
    /**
     * @param username
     * @param password
     */
    public Account(String username, String password){
        this.username = username;
        this.password = password;
        this.email = email;
    }
    /**
     * 
     * @param account_id
     * @param username
     * @param password
     */
    public Account(Integer account_id, String username, String password) {
        this.account_id = account_id;
        this.username = username;
        this.password = password;
    }
    /**
     * @return account_id
     */
    public Integer getAccount_id() {
        return account_id;
    }
    /**
     * @param account_id
     */
    public void setAccount_id(Integer account_id) {
        this.account_id = account_id;
    }
    
    public String getUsername() {
        return username;
    }
 
    public void setUsername(String username) {
        this.username = username;
    }
  
    public String getPassword() {
        return password;
    }
  
    public void setPassword(String password) {
        this.password = password;
    }
 
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Account other = (Account) obj;
        if (account_id == null) {
            if (other.account_id != null)
                return false;
        } else if (!account_id.equals(other.account_id))
            return false;
        if (password == null) {
            if (other.password != null)
                return false;
        } else if (!password.equals(other.password))
            return false;
        if (username == null) {
            if (other.username != null)
                return false;
        } else if (!username.equals(other.username))
            return false;
        return true;
    }


    @Override
    public String toString() {
        return "Account{" +
                "account_id=" + account_id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}