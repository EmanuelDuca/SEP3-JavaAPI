package origin.shared;

public class AddressEntity {
    private String country;
    private String city;
    private String zip;
    private String street;

    public AddressEntity() {
    }

    public AddressEntity(String country, String city, String zip, String street) {
        this.country = country;
        this.city = city;
        this.zip = zip;
        this.street = street;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
