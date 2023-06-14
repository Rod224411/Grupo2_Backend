package pe.edu.upc.semana9.servicesImplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.semana9.entities.Ubicacion;
import pe.edu.upc.semana9.repositories.IUbicacionRepository;
import pe.edu.upc.semana9.services.IUbicacionService;

import java.util.List;
@Service
public class UbicacionServiceImplement implements IUbicacionService {
    @Autowired
    private IUbicacionRepository aR;

    @Override //a sido genereado gracias a la interfas
    public void insert(Ubicacion ubicacion) {
        aR.save(ubicacion);

    }

    @Override
    public List<Ubicacion> list() {
        return aR.findAll();
    }

    @Override
    public void delete(int idUbicacion) {
        aR.deleteById(idUbicacion);

    }

    @Override
    public Ubicacion listId(int idUbicacion) {
        return aR.findById(idUbicacion).orElse(new Ubicacion());
    }
}
