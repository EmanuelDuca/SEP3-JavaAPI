package origin.mappers;

import origin.protobufClasses.PetOwner;

public class UserMapper {
    public static PetOwner mapProto(origin.shared.PetOwner user)
    {
        return PetOwner.newBuilder()
                .setUsername(user.getUsername())
                .setPassword(user.getPassword())
                .setFName(user.getF_name())
                .setLName(user.getL_name())
                .setAge(user.getAge())
                .setPhone(user.getPhone())
                .setEmail(user.getEmail())
                .build();
    }

    public static origin.shared.PetOwner mapToShared(PetOwner user)
    {
        return new origin.shared.PetOwner(
                user.getUsername(),
                user.getPassword(),
                user.getFName(),
                user.getLName(),
                user.getAge(),
                user.getPhone(),
                user.getEmail()
        );
    }
}
