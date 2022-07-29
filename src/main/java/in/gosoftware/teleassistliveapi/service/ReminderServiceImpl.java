package in.gosoftware.teleassistliveapi.service;

import in.gosoftware.teleassistliveapi.exception.NoDataFoundException;
import in.gosoftware.teleassistliveapi.model.Reminder;
import in.gosoftware.teleassistliveapi.repo.ReminderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReminderServiceImpl implements ReminderService{

    @Autowired
    ReminderRepo reminderRepo;
    @Override
    public Reminder create(Reminder reminder) {
        return reminderRepo.save(reminder);
    }

    @Override
    public Reminder edit(Reminder reminder) {
        return reminderRepo.save(reminder);
    }

    @Override
    public List<Reminder> getAll() {
        return reminderRepo.findAll();
    }

    @Override
    public Reminder getById(Long id) {
        return reminderRepo.findById(id)
                .orElseThrow(()->new NoDataFoundException("No User Found with this id:"+id));
    }

    @Override
    public void delete(Long id) {

        Reminder reminder=getById(id);


        reminderRepo.deleteById(reminder.getId());

    }
}
