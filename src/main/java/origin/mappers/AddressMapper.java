package origin.mappers;

import origin.protobufClasses.Address;

public class AddressMapper {
    public static Address mapToProto(origin.shared.Address address)
    {
        return Address.newBuilder()
                .setCountry(address.getCountry())
                .setCity(address.getCity())
                .setZip(address.getZip())
                .setStreet(address.getStreet())
                .build();
    }

    public static origin.shared.Address mapToShared(Address address)
    {
        return new origin.shared.Address(
                address.getCountry(),
                address.getCity(),
                address.getZip(),
                address.getStreet()
        );
    }
}
