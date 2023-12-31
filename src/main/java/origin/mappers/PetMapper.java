package origin.mappers;

import origin.protobufClasses.Pet;
import origin.shared.PetEntity;

public class PetMapper {
    public static Pet mapToProto(PetEntity petEntity)
    {
        return Pet.newBuilder()
                .setPetName(petEntity.getPetName())
                .setPetType(petEntity.getPetType())
                .setRace(petEntity.getRace())
                .setWeight(petEntity.getWeight())
                .setIsVaccinated(petEntity.isVaccinated())
                .setNeedWalks(petEntity.isNeedWalks())
                .setDietDescription(petEntity.getDietDescription())
                .build();
    }

    public static PetEntity mapToShared(Pet pet)
    {
        return new PetEntity(
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
