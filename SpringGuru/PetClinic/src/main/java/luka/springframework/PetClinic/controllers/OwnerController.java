package luka.springframework.PetClinic.controllers;

import luka.springframework.PetClinic.Services.OwnerService;
import luka.springframework.PetClinic.Services.map.OwnerMapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")
@Controller
public class OwnerController {

    private final OwnerMapService ownerMapService;

    @Autowired
    public OwnerController(OwnerMapService ownerMapService) {
        this.ownerMapService = ownerMapService;
    }

    @RequestMapping({"","/", "/index", "/index.html"})
    public String listOwners(Model model){
        model.addAttribute("owners",
                ownerMapService.findAll());
        return "owners/index";
    }

    @RequestMapping("/find")
    public String findOwners(){
        return "notImplemented";
    }
}
