package com.example.demo.Controller;

import com.example.demo.Repository.TecnicosRepository;
import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import jakarta.validation.Valid;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;


@Controller
@RequestMapping("/Tecnicos")

public class TecnicosController {

    final TecnicosRepository tecnicosRepository;

    public TecnicosController(TecnicosRepository tecnicosRepository) {

        this.tecnicosRepository = tecnicosRepository;
    }

    @GetMapping(value = {"", "/"})
    public String listaProductos(Model model) {
        model.addAttribute("listaTecnicos", tecnicosRepository.findAll());
        return "Tecnicos/Tecnicos";
    }





}
