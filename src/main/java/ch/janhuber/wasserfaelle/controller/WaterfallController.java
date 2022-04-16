package ch.janhuber.wasserfaelle.controller;

import ch.janhuber.wasserfaelle.entity.Waterfall;
import ch.janhuber.wasserfaelle.repository.WaterfallRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WaterfallController {

    @Autowired
    WaterfallRepository waterfallRepository;

    @RequestMapping("/")
    public String welcome(Model model) {
        Iterable<Waterfall> waterfalls = waterfallRepository.findAll();
        model.addAttribute("waterfalls", waterfalls);
        return "index";
    }

    @RequestMapping(path = "/waterfalls/{waterfallId}")
    public String getLocationById(@PathVariable(value = "waterfallId", required = true) Long waterfallId, Model model) {
        Waterfall waterfall = waterfallRepository.findById(waterfallId).get();
        model.addAttribute("waterfall", waterfall);
        return "waterfall";
    }



}
