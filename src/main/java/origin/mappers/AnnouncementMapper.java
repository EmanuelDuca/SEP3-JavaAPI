package origin.mappers;


import origin.protobufClasses.Announcement;

public class AnnouncementMapper {
    public static Announcement mapToProto(origin.shared.Announcement announcement)
    {
        return Announcement.newBuilder()
                .setPetOwnerUsername(announcement.getPetOwnerUsername())
                .setDescription(announcement.getDescription())
                .setTimeInterval(DateIntervalMapper.mapToProto(announcement.getTimeInterval()))
                .setPet(PetMapper.mapToProto(announcement.getPet()))
                .setAddress(AddressMapper.mapToProto(announcement.getAddress()))
                .setDateOfCreation(announcement.getDateOfCreation())
                .build();
    }

    public static origin.shared.Announcement mapToShared(Announcement announcement)
    {
        return new origin.shared.Announcement(
                announcement.getPetOwnerUsername(),
                announcement.getDescription(),
                DateIntervalMapper.mapToShared(announcement.getTimeInterval()),
                PetMapper.mapToShared(announcement.getPet()),
                AddressMapper.mapToShared(announcement.getAddress())
        );
    }
}
