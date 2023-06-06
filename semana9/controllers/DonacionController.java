package pe.edu.upc.trabajof.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.trabajof.dtos.DonacionDTO;
import pe.edu.upc.trabajof.entities.Donacion;
import pe.edu.upc.trabajof.services.DonacionService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/donaciones")
public class DonacionController {

    @Autowired
    private DonacionService donacionS;

    @PostMapping
    public void insert(@RequestBody DonacionDTO dto){
        ModelMapper m=new ModelMapper();
        Donacion d= m.map(dto, Donacion.class);
        donacionS.insert(d);
    }

    @GetMapping
    public List<DonacionDTO> list(){
        return donacionS.list().stream().map(x->{
            ModelMapper m= new ModelMapper();
            return m.map(x, DonacionDTO.class);
        }).collect(Collectors.toList());
    }
}
