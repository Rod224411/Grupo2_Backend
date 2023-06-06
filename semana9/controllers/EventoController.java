package pe.edu.upc.demoubicacion.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.demoubicacion.dtos.EventoDTO;
import pe.edu.upc.demoubicacion.entities.Evento;
import pe.edu.upc.demoubicacion.services.IEventoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/eventos")
public class EventoController {
    @Autowired
    private IEventoService eS;

    @PostMapping
    public void insert(@RequestBody EventoDTO dto) {

        ModelMapper m = new ModelMapper();
        Evento e = m.map(dto, Evento.class);
        eS.insert(e);
    }

    @GetMapping
    public List<EventoDTO> list() {
        return eS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, EventoDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("/{id}")
    public EventoDTO listId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        EventoDTO dto = m.map(eS.listId(id), EventoDTO.class);
        return dto;
    }
    @PutMapping
    public void goUpdate(@RequestBody EventoDTO dto) {
        ModelMapper m=new ModelMapper();
        Evento e=m.map(dto,Evento.class);
        eS.insert(e);
    }
}
