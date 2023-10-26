package origin.shared;

public class Pet {
    private String petName;
    private String petType;
    private String Race;
    private int weight;
    private boolean isVaccinated = false;
    private boolean needWalks = true;
    private String dietDescription ="";

    public Pet(String petName, String petType, String race, int weight, boolean isVaccinated, boolean needWalks, String dietDescription) {
        this.petName = petName;
        this.petType = petType;
        Race = race;
        this.weight = weight;
        this.isVaccinated = isVaccinated;
        this.needWalks = needWalks;
        this.dietDescription = dietDescription;
    }

    public Pet() {
    }

    public Pet(String petName, String petType) {
        this.petName = petName;
        this.petType = petType;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    public String getRace() {
        return Race;
    }

    public void setRace(String race) {
        Race = race;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isVaccinated() {
        return isVaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        isVaccinated = vaccinated;
    }

    public boolean isNeedWalks() {
        return needWalks;
    }

    public void setNeedWalks(boolean needWalks) {
        this.needWalks = needWalks;
    }

    public String getDietDescription() {
        return dietDescription;
    }

    public void setDietDescription(String dietDescription) {
        this.dietDescription = dietDescription;
    }
}
