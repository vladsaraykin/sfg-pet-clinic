package com.springframework.sfgpetclinic.controllers;

import com.springframework.sfgpetclinic.model.Vet;
import com.springframework.sfgpetclinic.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Set;

@RequestMapping({"/vets", "/vets.html"})
@Controller
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"", "/"})
    public String listVets(Model model) {
        model.addAttribute("vets", vetService.findAll());
        return "vets/vets";
    }

    @GetMapping("/api/vets")
    public @ResponseBody Set<Vet> getVetJson() {

        return vetService.findAll();
    }
}
