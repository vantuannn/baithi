package com.example.lambaithi_01022024.controller;

import com.example.lambaithi_01022024.model.Homestay;
import com.example.lambaithi_01022024.service.HomestayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/homestays")
public class HomestayController {
    @Autowired
    private HomestayService homestayService;

    @GetMapping()
    public String showAllHomestay(Model model) {
        List<Homestay> homestays = homestayService.getAllListHomestays();
        model.addAttribute("homestayslist", homestays);

        return "list";
    }

    @GetMapping("/add-homestay")
    public String showAddHomestayForm(Model model) {
        Homestay homestays = new Homestay();
        model.addAttribute("homestay", homestays);
        return "create";
    }

    @GetMapping("/edit/{id}")
    public String showEditHomestayForm(@PathVariable int id, Model model) {
        model.addAttribute("homestay", homestayService.findById(id));
        return "edit";
    }

    @GetMapping("/search")
    public String showEditRoomForm(@RequestParam("city") String city, Model model) {
        model.addAttribute("homestayslist", homestayService.searchWithKeyword(city));
        return "list";
    }

    @PostMapping("/create")
    public String createRoom(@ModelAttribute Homestay homestay) {
        homestayService.createHomestay(homestay);
        return "redirect:/homestays";
    }

    @PostMapping("/update")
    public String updateHomestay(@ModelAttribute Homestay homestay) {
        homestayService.updateHomestay(homestay);

        return "redirect:/homestays";
    }

    @GetMapping("/delete/{id}")
    public String deleteRoom(@ModelAttribute Homestay homestay) {
        homestayService.deleteById(homestay.getId());
        return "redirect:/homestays";
    }
}