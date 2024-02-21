package memberOOP;

public class Member {
    private String id;
    private int password;
    private int verifyPassword;
    private String name;
    private int socialSecurityNumber;
    private int phoneNumber;
    private String address;


//  회원가입에서 사용하는 생성자
    public Member(String id, int password, int verifyPassword, String name, int socialSecurityNumber,
                  int phoneNumber, String address) {
        this.id = id;
        this.password = password;
        this.verifyPassword = verifyPassword;
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getName(){
        return this.name;
    }

//  카우프 지수에서 사용하는 생성자
    public Member(double height, double weight){
        this.height = height;
        this.weight = weight;
    }
    private double height;
    private double weight;


    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return this.weight;
    }


    @Override
    public String toString() {
        return "Member{" +
                "id='" + id + '\'' +
                ", password=" + password +
                ", verifyPassword=" + verifyPassword +
                ", name='" + name + '\'' +
                ", socialSecurityNumber=" + socialSecurityNumber +
                ", phoneNumber=" + phoneNumber +
                ", address='" + address + '\'' +
                '}';
    }
}
