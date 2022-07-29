package in.gosoftware.teleassistliveapi.service;

import in.gosoftware.teleassistliveapi.exception.NoDataFoundException;
import in.gosoftware.teleassistliveapi.model.Team;
import in.gosoftware.teleassistliveapi.repo.TeamRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class TeamServiceImpl implements TeamService{

    @Autowired
    TeamRepo teamRepo;
    @Override
    public Team create(Team team) {
        return teamRepo.save(team);
    }

    @Override
    public Team edit(Team team) {
        return teamRepo.save(team);
    }

    @Override
    public List<Team> getAll() {
        return teamRepo.findAll();
    }

    @Override
    public Team getById(Long id) {
        return teamRepo.findById(id)
                .orElseThrow(()->new NoDataFoundException("No User Found with this id:"+id));
    }

    @Override
    public void delete(Long id) {
        Team team=getById(id);
        teamRepo.deleteById(team.getId());

    }
}
