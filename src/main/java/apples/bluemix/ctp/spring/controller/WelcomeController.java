package apples.bluemix.ctp.spring.controller;

import apples.bluemix.ctp.spring.domain.Team;
import apples.bluemix.ctp.spring.repositories.TeamRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class WelcomeController
{
    private static final Logger log = LoggerFactory.getLogger(WelcomeController.class);

    @Autowired
    TeamRepository teamRepository;

    @RequestMapping(value="/", method = RequestMethod.GET)
    public String listTeams (Model model)
    {
        List<Team> teams = teamRepository.findAll();

        log.info("Teams = " + teams.size());

        model.addAttribute("teams", teams);
        model.addAttribute("teamcount", teams.size());

        return "welcome";

    }
}
