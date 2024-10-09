package com.example.springlab.controller;

import com.example.springlab.domain.LottoVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Random;

@Controller
public class LottoController {

    private final Random random = new Random();
    @GetMapping("/lotto")
    public String processLotto(@RequestParam("lottoNum") Integer lottoNum, Model model) {

        int generatedNum = (int) (Math.random() * 6) + 1;
        boolean isWin = (generatedNum == lottoNum);

        if(isWin){
            LottoVO lottoVO = new LottoVO(true, "sun.png");
            model.addAttribute("lottoVO", lottoVO);
            return "lottoView";
        }
        else {
            LottoVO lottoVO = new LottoVO(false, "rain.png");
            model.addAttribute("lottoVO", lottoVO);
            return "lottoView";
        }
    }
}
