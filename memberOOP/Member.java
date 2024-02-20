package memberOOP;

public class Member {
    private String id;
    private int password;
    private int verifyPassword;
    private String name;
    private int socialSecurityNumber;
    private int phoneNumber;
    private String address;

    public void setId(String id){
       this.id = id;
    }
    public String getId(){
        return this.id;
    }

    public void setPassword(int password){
        this.password = password;
    }
    public int getPassword(){
        return this.password;
    }
    public void setVerifyPassword(int verifyPassword){
        this.verifyPassword = verifyPassword;
    }
    public int getVerifyPassword(){
        return this.verifyPassword;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setSocialSecurityNumber(int socialSecurityNumber){
        this.socialSecurityNumber = socialSecurityNumber;
    }
    public int getSocialSecurityNumber(){
        return this.socialSecurityNumber;
    }
    public void setPhoneNumber(int phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public int getPhoneNumber(){
        return this.phoneNumber;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return this.address;
    }
}
