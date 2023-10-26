package origin.shared;


public class AnnouncementEntity {
    private final String petOwnerUsername ;
    private String description;
    private TimeIntervalEntity timeIntervalEntity;
    private PetEntity petEntity;
    private AddressEntity addressEntity;
    private final String dateOfCreation;

    public AnnouncementEntity(String petOwnerUsername, String description, TimeIntervalEntity timeIntervalEntity, PetEntity petEntity, AddressEntity addressEntity) {
        this.petOwnerUsername = petOwnerUsername;
        this.description = description;
        this.timeIntervalEntity = timeIntervalEntity;
        this.petEntity = petEntity;
        this.addressEntity = addressEntity;
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

    public TimeIntervalEntity getTimeInterval() {
        return timeIntervalEntity;
    }

    public void setTimeInterval(TimeIntervalEntity timeIntervalEntity) {
        this.timeIntervalEntity = timeIntervalEntity;
    }

    public PetEntity getPet() {
        return petEntity;
    }

    public void setPet(PetEntity petEntity) {
        this.petEntity = petEntity;
    }

    public AddressEntity getAddress() {
        return addressEntity;
    }

    public void setAddress(AddressEntity addressEntity) {
        this.addressEntity = addressEntity;
    }

    public String getDateOfCreation() {
        return dateOfCreation;
    }

}
