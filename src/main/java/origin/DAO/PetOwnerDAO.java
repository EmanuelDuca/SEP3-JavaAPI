package origin.DAO;

import origin.DAOInterfaces.PetOwnerDAOInterface;
import origin.shared.PetOwnerEntity;

import java.util.Collection;

public class PetOwnerDAO implements PetOwnerDAOInterface {
    public PetOwnerDAO() {
    }

    @Override
    public PetOwnerEntity registerUser(PetOwnerEntity petOwnerEntity)
    {
        return petOwnerEntity;
    }

    @Override
    public PetOwnerEntity loginPetOwner(PetOwnerEntity petOwnerEntity) {
        return null;
    }

    @Override
    public PetOwnerEntity findPetOwner(String username) {
        return null;
    }

    @Override
    public void updatePetOwnerInformation(PetOwnerEntity petOwnerEntity) {

    }

    @Override
    public Collection<PetOwnerEntity> getAllPetOwners() {
        return null;
    }

    @Override
    public Collection<PetOwnerEntity> getPetOwners(String searchField) {
        return null;
    }
}
