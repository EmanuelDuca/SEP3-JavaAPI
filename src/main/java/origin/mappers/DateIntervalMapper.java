package origin.mappers;


import origin.protobufClasses.TimeInterval;

public class DateIntervalMapper {
    public static TimeInterval mapToProto(origin.shared.TimeInterval timeInterval)
    {
        return TimeInterval.newBuilder()
                .setStartDate(timeInterval.getStartDate())
                .setFinishDate(timeInterval.getEndDate())
                .build();
    }

    public static origin.shared.TimeInterval mapToShared(TimeInterval timeInterval)
    {
        return new origin.shared.TimeInterval(
                timeInterval.getStartDate(),
                timeInterval.getFinishDate()

        );
    }

}
