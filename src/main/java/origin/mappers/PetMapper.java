package origin.mappers;

import origin.protobufClasses.Pet;

public class PetMapper {
    public static Pet mapToProto(origin.shared.Pet pet)
    {
        return Pet.newBuilder()
                .setPetName(pet.getPetName())
                .setPetType(pet.getPetType())
                .setRace(pet.getRace())
                .setWeight(pet.getWeight())
                .setIsVaccinated(pet.isVaccinated())
                .setNeedWalks(pet.isNeedWalks())
                .setDietDescription(pet.getDietDescription())
                .build();
    }

    public static origin.shared.Pet mapToShared(Pet pet)
    {
        return new origin.shared.Pet(
                pet.getPetName(),
                pet.getPetType(),
                pet.getRace(),
                pet.getWeight(),
                pet.getIsVaccinated(),
                pet. getNeedWalks(),
                pet.getDietDescription()
        );
    }
}
