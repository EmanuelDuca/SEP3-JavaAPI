package origin.shared;


public class Announcement {
    private final String petOwnerUsername ;
    private String description;
    private TimeInterval timeInterval;
    private  Pet pet;
    private Address address;
    private final String dateOfCreation;

    public Announcement(String petOwnerUsername, String description, TimeInterval timeInterval, Pet pet, Address address) {
        this.petOwnerUsername = petOwnerUsername;
        this.description = description;
        this.timeInterval = timeInterval;
        this.pet = pet;
        this.address = address;
        this.dateOfCreation= String.valueOf(System.currentTimeMillis());
    }

    public String getPetOwnerUsername() {
        return petOwnerUsername;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TimeInterval getTimeInterval() {
        return timeInterval;
    }

    public void setTimeInterval(TimeInterval timeInterval) {
        this.timeInterval = timeInterval;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getDateOfCreation() {
        return dateOfCreation;
    }

}
