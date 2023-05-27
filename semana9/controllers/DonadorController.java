package pe.edu.upc.trabajof.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.trabajof.dtos.DonadorDTO;
import pe.edu.upc.trabajof.entities.Donador;
import pe.edu.upc.trabajof.services.DonadorService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/donadores")
public class DonadorController {

    @Autowired
    private DonadorService dS;

    @PostMapping
    public void insert(@RequestBody DonadorDTO dto){
        ModelMapper m=new ModelMapper();
        Donador d= m.map(dto, Donador.class);
        dS.insert(d);
    }

    @GetMapping
    public List<DonadorDTO> list(){
        return dS.list().stream().map(x->{
            ModelMapper m= new ModelMapper();
            return m.map(x, DonadorDTO.class);
        }).collect(Collectors.toList());
    }
@DeleteMapping("/{id}")
    public void delete(@PathVariable("id")Integer id){
    dS.delete(id);
    }

    @GetMapping("/{id}")
    public DonadorDTO listId(@PathVariable("id")Integer id){
    ModelMapper m = new ModelMapper();
    DonadorDTO dto=m.map(dS.listId(id), DonadorDTO.class);
    return dto;
    }
@PutMapping
    public void goUpdate(@RequestBody DonadorDTO dto){
        ModelMapper m = new ModelMapper();
        Donador d= m.map(dto, Donador.class);
        dS.insert(d);
    }
}
