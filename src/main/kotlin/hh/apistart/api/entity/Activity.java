package hh.apistart.api.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "activity", catalog = "postgres", schema = "onstart")
@Getter
@Setter
public class Activity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    @Basic
    @Column(name = "category_id", nullable = true)
    private Long categoryId;
    @Basic
    @Column(name = "distance", nullable = true, precision = 0)
    private Float distance;
    @Basic
    @Column(name = "duration", nullable = true)
    private Integer duration;
    @Basic
    @Column(name = "movingtime", nullable = true)
    private Integer movingtime;
    @Basic
    @Column(name = "start_at", nullable = false)
    private Timestamp startAt;
    @Basic
    @Column(name = "title", nullable = true, length = 255)
    private String title;
    @Basic
    @Column(name = "track_id", nullable = false, length = 255)
    private String trackId;
    @Basic
    @Column(name = "avrspeed", nullable = true, precision = 0)
    private Double avrspeed;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Activity activity = (Activity) o;

        if (id != null ? !id.equals(activity.id) : activity.id != null) return false;
        if (categoryId != null ? !categoryId.equals(activity.categoryId) : activity.categoryId != null) return false;
        if (distance != null ? !distance.equals(activity.distance) : activity.distance != null) return false;
        if (duration != null ? !duration.equals(activity.duration) : activity.duration != null) return false;
        if (movingtime != null ? !movingtime.equals(activity.movingtime) : activity.movingtime != null) return false;
        if (startAt != null ? !startAt.equals(activity.startAt) : activity.startAt != null) return false;
        if (title != null ? !title.equals(activity.title) : activity.title != null) return false;
        if (trackId != null ? !trackId.equals(activity.trackId) : activity.trackId != null) return false;
        if (avrspeed != null ? !avrspeed.equals(activity.avrspeed) : activity.avrspeed != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (categoryId != null ? categoryId.hashCode() : 0);
        result = 31 * result + (distance != null ? distance.hashCode() : 0);
        result = 31 * result + (duration != null ? duration.hashCode() : 0);
        result = 31 * result + (movingtime != null ? movingtime.hashCode() : 0);
        result = 31 * result + (startAt != null ? startAt.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (trackId != null ? trackId.hashCode() : 0);
        result = 31 * result + (avrspeed != null ? avrspeed.hashCode() : 0);
        return result;
    }
}
