package com.example.backendclase23.controller;

import com.example.backendclase23.modelo.Paciente;
import com.example.backendclase23.servicio.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class PacienteController {
    private final PacienteService pacienteService;

    @Autowired
    public PacienteController(PacienteService pacienteService) {
        this.pacienteService = pacienteService;
    }

    @GetMapping("/index")
    public String traerPaciente(Model model, @RequestParam("email") String email){
        Paciente paciente = pacienteService.buscarXEmail(email);
        model.addAttribute("nombre", paciente.getNombre());
        model.addAttribute("apellido", paciente.getApellido());
        model.addAttribute("email", paciente.getEmail());
        return "index";
    }
    /*
    @RequestParam ->pide al usuario el email desde el front y se guarda en la variable email.
    Model model -> es una de las clases que usa Spring para pasar información a la vista. En este caso la consigna nos pide mostrar nombre y apellido en la vista y con model los indicamos para mostrarse en el html que creamos en la carpeta templates.
    */

}
