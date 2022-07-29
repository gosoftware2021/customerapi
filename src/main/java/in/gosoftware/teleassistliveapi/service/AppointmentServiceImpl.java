package in.gosoftware.teleassistliveapi.service;

import in.gosoftware.teleassistliveapi.exception.NoDataFoundException;
import in.gosoftware.teleassistliveapi.model.Appointment;
import in.gosoftware.teleassistliveapi.repo.AppointmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentServiceImpl implements AppointmentService{

    @Autowired
    AppointmentRepo appointmentRepo;
    @Override
    public Appointment create(Appointment appointment) {
        return appointmentRepo.save(appointment);
    }

    @Override
    public Appointment edit(Appointment appointment) {
        return appointmentRepo.save(appointment);
    }

    @Override
    public List<Appointment> getAll() {
        return appointmentRepo.findAll();
    }

    @Override
    public Appointment getById(Long id) {
        return appointmentRepo.findById(id)
                .orElseThrow(()-> new NoDataFoundException("Appointment Data not found  with this id: "+id));
    }

    @Override
    public void delete(Long id) {
        Appointment appointment=getById(id);
        appointmentRepo.deleteById(appointment.getId());
    }
}
