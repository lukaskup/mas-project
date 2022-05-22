import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class User implements Serializable {
    private static List<User> extent;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private Address address;
    private List<Blog> blogs;

    static{
        extent = Extensions.load("FileExtension.txt");
        if(extent == null){
            extent = new ArrayList<>();
        }
    }

    public User(String firstName, String lastName, String phoneNumber, String email, Address address, List<Blog> blogs) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.blogs = blogs;
        extent.add(this);
    }

    public static void writeExtent(){
        Extensions.save(User.extent, "FileExtension.txt");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    //unique
    public void setPhoneNumber(String phoneNumber) throws Exception {
        for(User user : extent){
            if(user.phoneNumber.equals(phoneNumber)){
                throw new Exception("there is already user with this phone number");
            }
        }

        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Blog> getBlogs() { return blogs; }

    public void setBlog(List<Blog> blogs) {
        this.blogs = blogs;
    }
}
