package pe.edu.upc.semana9.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.semana9.dtos.UbicacionDTO;
import pe.edu.upc.semana9.entities.Ubicacion;
import pe.edu.upc.semana9.services.IUbicacionService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Ubicaciones")
public class UbicacionController {
    @Autowired
    private IUbicacionService dS;

    @PostMapping
    public void insert(@RequestBody UbicacionDTO dto){
        ModelMapper m=new ModelMapper();
        Ubicacion a=m.map(dto,Ubicacion.class);
        dS.insert(a);
    }

    @GetMapping
    public List<UbicacionDTO> list(){
        return dS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,UbicacionDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id")Integer id){
        dS.delete(id);
    }

    @GetMapping("/{id}")
    public UbicacionDTO listId(@PathVariable("id")Integer id){
        ModelMapper m=new ModelMapper();
        UbicacionDTO dto=m.map(dS.listId(id),UbicacionDTO.class);
        return dto;
    }

    @PutMapping
    public void goUpdate(@RequestBody UbicacionDTO dto){
        ModelMapper m=new ModelMapper();
        Ubicacion a=m.map(dto,Ubicacion.class);
        dS.insert(a);
    }
}
