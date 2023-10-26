package origin.DAOInterfaces;

import origin.shared.Announcement;

import java.util.Collection;

public interface AnnouncementDAOInterface {
    Announcement createAnnouncement(Announcement announcement);

    void updateAnnouncement(Announcement announcement);

    Announcement getAnnouncement(String petOwnerUsername, String dateOfCreation);

    Collection<Announcement> getAllAnnouncements();

    Collection<Announcement> getAnnouncements(String searchField);

    void deleteAnnouncement(Announcement announcement);
}
