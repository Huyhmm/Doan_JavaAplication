package com.example.quytuthien.controller;

import com.example.quytuthien.entity.ToChuc;
import com.example.quytuthien.service.ToChucService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/tochuc")
public class ToChucController {
    @Autowired
    private ToChucService toChucService;

    @GetMapping
    public String lietKeTatCaToChuc(Model model) {
        List<ToChuc> dsToChuc = toChucService.layTatCaToChuc();
        model.addAttribute("dsToChuc", dsToChuc);
        return "tochuc/list";
    }

    @GetMapping("/add")
    public String themToChucForm(Model model) {
        model.addAttribute("tochuc", new ToChuc());
        return "tochuc/list";
    }
    @PostMapping("/add")
    public String themToChuc(@Valid @ModelAttribute("tochuc") ToChuc toChuc,
                             BindingResult br) throws IOException
    {
        if (br.hasErrors()) {
            return "tochuc/add";
        }
        return "redirect:/tochuc";
    }


}
