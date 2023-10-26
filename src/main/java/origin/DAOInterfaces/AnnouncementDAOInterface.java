package origin.DAOInterfaces;

import origin.shared.AnnouncementEntity;

import java.util.Collection;

public interface AnnouncementDAOInterface {
    AnnouncementEntity createAnnouncement(AnnouncementEntity announcementEntity);

    void updateAnnouncement(AnnouncementEntity announcementEntity);

    AnnouncementEntity getAnnouncement(String petOwnerUsername, String dateOfCreation);

    Collection<AnnouncementEntity> getAllAnnouncements();

    Collection<AnnouncementEntity> getAnnouncements(String searchField);

    void deleteAnnouncement(AnnouncementEntity announcementEntity);
}
