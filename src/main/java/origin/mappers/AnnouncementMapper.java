package origin.mappers;


import origin.protobufClasses.Announcement;
import origin.shared.AnnouncementEntity;

public class AnnouncementMapper {
    public static Announcement mapToProto(AnnouncementEntity announcementEntity)
    {
        return Announcement.newBuilder()
                .setPetOwnerUsername(announcementEntity.getPetOwnerUsername())
                .setDescription(announcementEntity.getDescription())
                .setTimeInterval(DateIntervalMapper.mapToProto(announcementEntity.getTimeInterval()))
                .setPet(PetMapper.mapToProto(announcementEntity.getPet()))
                .setAddress(AddressMapper.mapToProto(announcementEntity.getAddress()))
                .setDateOfCreation(announcementEntity.getDateOfCreation())
                .build();
    }

    public static AnnouncementEntity mapToShared(Announcement announcement)
    {
        return new AnnouncementEntity(
                announcement.getPetOwnerUsername(),
                announcement.getDescription(),
                DateIntervalMapper.mapToShared(announcement.getTimeInterval()),
                PetMapper.mapToShared(announcement.getPet()),
                AddressMapper.mapToShared(announcement.getAddress())
        );
    }
}
