package pe.edu.upc.trabajof.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.trabajof.entities.Donacion;
import pe.edu.upc.trabajof.repositories.DonacionRepository;
import pe.edu.upc.trabajof.services.DonacionService;

import java.util.List;

@Service

public class DonacionServiceImplement implements DonacionService {

    @Autowired
    private DonacionRepository donacionR;

    @Override
    public void insert(Donacion donacion) {
        donacionR.save(donacion);
    }

    @Override
    public List<Donacion> list() {
        return donacionR.findAll();
    }
}
