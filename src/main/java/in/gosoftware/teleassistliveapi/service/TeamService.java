package in.gosoftware.teleassistliveapi.service;


import in.gosoftware.teleassistliveapi.model.Team;

import java.util.List;
import java.util.Optional;

public interface TeamService {

    Team create(Team team);

    Team edit(Team team);

    List<Team> getAll();

    Optional<Team> getById(Long id);

    void delete(Long id);
}
