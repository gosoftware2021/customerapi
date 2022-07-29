package in.gosoftware.teleassistliveapi.service;

import in.gosoftware.teleassistliveapi.model.Appointment;

import java.util.List;
import java.util.Optional;

public interface AppointmentService {

    Appointment create(Appointment appointment);

    Appointment edit(Appointment appointment);

    List<Appointment> getAll();

    Appointment getById(Long id);

    void delete(Long id);
}
