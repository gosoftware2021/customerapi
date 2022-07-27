package in.gosoftware.teleassistliveapi.repo;

import in.gosoftware.teleassistliveapi.model.Reminder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReminderRepo extends JpaRepository<Reminder,Long> {
}
