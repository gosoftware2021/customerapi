package in.gosoftware.teleassistliveapi.service;


import in.gosoftware.teleassistliveapi.model.Reminder;

import java.util.List;
import java.util.Optional;

public interface ReminderService {

    Reminder create(Reminder reminder);

    Reminder edit(Reminder reminder);

    List<Reminder> getAll();

    Optional<Reminder> getById(Long id);

    void delete(Long id);
}
