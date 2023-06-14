package pe.edu.upc.semana9.servicesImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.semana9.entities.Evento;
import pe.edu.upc.semana9.repositories.IEventoRepository;
import pe.edu.upc.semana9.services.IEventoService;

import java.util.List;

@Service
public class EventoServiceImplement implements IEventoService {
    @Autowired
    private IEventoRepository eR;
    @Override
    public void insert(Evento evento){
        eR.save(evento);
    }
    @Override
    public List<Evento>list(){
        return  eR.findAll();
    }
    @Override
    public Evento listId(int idEvento){
        return eR.findById(idEvento).orElse(new Evento());
    }
    @Override
    public void delete(int idEvento) {

        eR.deleteById(idEvento);

    }
}

