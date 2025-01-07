package com.wecp.progressive.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wecp.progressive.entity.Team;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface TeamRepository extends JpaRepository<Team, Integer> {

    Optional<Team> findByTeamId(int teamId);
    Optional<Team> findByTeamName(String teamName);
}
