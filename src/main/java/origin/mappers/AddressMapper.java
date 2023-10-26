package origin.mappers;

import origin.protobufClasses.Address;
import origin.shared.AddressEntity;

public class AddressMapper {
    public static Address mapToProto(AddressEntity addressEntity)
    {
        return Address.newBuilder()
                .setCountry(addressEntity.getCountry())
                .setCity(addressEntity.getCity())
                .setZip(addressEntity.getZip())
                .setStreet(addressEntity.getStreet())
                .build();
    }

    public static AddressEntity mapToShared(Address address)
    {
        return new AddressEntity(
                address.getCountry(),
                address.getCity(),
                address.getZip(),
                address.getStreet()
        );
    }
}
