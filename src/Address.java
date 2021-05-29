import java.util.ArrayList;
import java.util.List;

public class Address {
    private static List<Address> extent = new ArrayList<>();
    private String street;
    private String streetNumber;
    private String postCode;
    private String city;
    private Country country;

    public Address(String street, String streetNumber, String postCode, String city, Country country) {
        this.street = street;
        this.streetNumber = streetNumber;
        this.postCode = postCode;
        this.city = city;
        this.country = country;
        extent.add(this);
    }

    static{
        extent = Extensions.load("FileExtension.txt");
        if(extent == null){
            extent = new ArrayList<>();
        }
    }

    public static void writeExtent(){
        Extensions.save(Address.extent, "FileExtension.txt");
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
