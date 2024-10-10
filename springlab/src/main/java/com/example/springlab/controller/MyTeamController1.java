package com.example.springlab.controller;

import com.example.springlab.domain.TeamDTO;
import com.example.springlab.domain.TeamMemberVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MyTeamController1 {

    @RequestMapping("/myTeam1")
    public String myTeam(String action, Model model) {
        TeamDTO myteam = new TeamDTO();
        myteam.setTeamName("먹코살코");

        List<TeamMemberVO> teamMembers = new ArrayList<>();
        teamMembers.add(new TeamMemberVO("김슬기", "SG", "고기"));
        teamMembers.add(new TeamMemberVO("장현수", "JHS", "피자"));
        teamMembers.add(new TeamMemberVO("정지용", "정지빵", "리조또"));
        teamMembers.add(new TeamMemberVO("한규현", "굼바", "라멘"));

        myteam.setTeamMember(teamMembers);

        model.addAttribute("myteam", myteam);
        model.addAttribute("action", action);
        return "myTeamView";
    }
}
