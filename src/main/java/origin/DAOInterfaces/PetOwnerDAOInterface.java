package origin.DAOInterfaces;


import origin.shared.PetOwner;

import java.util.Collection;

public interface PetOwnerDAOInterface {
    PetOwner registerUser(PetOwner petOwner);

    PetOwner loginPetOwner(PetOwner petOwner);

    PetOwner findPetOwner(String username);

    void updatePetOwnerInformation(PetOwner petOwner);

    Collection<PetOwner> getAllPetOwners();

    Collection<PetOwner> getPetOwners(String searchField);
}
