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
    private IUbicacionRepository dR;
    @Override
    public void insert(Ubicacion ubicacion) {
        dR.save(ubicacion);
    }

    @Override
    public List<Ubicacion> list() {
        return dR.findAll();
    }

    @Override
    public void delete(int idUbicacion) {
        dR.deleteById(idUbicacion);
    }

    @Override
    public Ubicacion listId(int idUbicacion) {
        return dR.findById(idUbicacion).orElse(new Ubicacion());
    }
}
