package pe.edu.upc.trabajof.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.trabajof.entities.Donador;
import pe.edu.upc.trabajof.repositories.DonadorRepository;
import pe.edu.upc.trabajof.services.DonadorService;

import java.util.List;

@Service
public class DonadorServiceImplement implements DonadorService {
    @Autowired
    private DonadorRepository dR;

    @Override
    public void insert(Donador donador) {
        dR.save(donador);
    }

    @Override
    public List<Donador> list() {
        return dR.findAll();
    }

    @Override
    public void delete(int idDonador) {
        dR.deleteById(idDonador);
    }

    @Override
    public Donador listId(int idDonador) {
        return dR.findById(idDonador).orElse(new Donador());
    }

    @Override
    public List<Donador> find(int id) {
        return dR.buscarDonador(id);
    }
}
