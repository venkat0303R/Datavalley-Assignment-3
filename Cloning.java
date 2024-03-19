
class Organization implements Cloneable {
    private String organizationCode;
    private String organizationName;
    private String organizationAddress;

    public Organization(String organizationCode, String organizationName, String organizationAddress) {
        this.organizationCode = organizationCode;
        this.organizationName = organizationName;
        this.organizationAddress = organizationAddress;
    }

    public void printDetails() {
        System.out.println("Organization Code: " + organizationCode);
        System.out.println("Organization Name: " + organizationName);
        System.out.println("Organization Address: " + organizationAddress);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class Cloning {
    public static void main(String[] args) {
        Organization org1 = new Organization("145", "Aquarin Corp", "8-9-33/5 Gandistreet");
        
        try {
            Organization org2 = (Organization) org1.clone();
            org2.printDetails();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
