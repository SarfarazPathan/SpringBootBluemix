package apples.bluemix.ctp.spring.controller;

import apples.bluemix.ctp.spring.domain.Team;
import apples.bluemix.ctp.spring.repositories.TeamRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TeamRest
{
    private static final Logger log = LoggerFactory.getLogger(TeamRest.class);

    @Autowired
    TeamRepository teamRepository;

    @RequestMapping("/allteams")
    public List<Team> allTeams ()
    {
        return teamRepository.findAll();
    }

    @RequestMapping("/todaysDate")
    public String helloWorld ()
    {
        return new java.util.Date().toString();
    }
}
