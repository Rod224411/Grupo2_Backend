package pe.edu.upc.semana9.servicesImplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.semana9.entities.Cuentabancaria;
import pe.edu.upc.semana9.repositories.ICuentabancariaRepository;
import pe.edu.upc.semana9.services.ICuentabancariaService;

import java.util.List;
@Service
public class CuentabancariaServiceImplement implements ICuentabancariaService {
    @Autowired
    private ICuentabancariaRepository bC;

    @Override
    public void insert(Cuentabancaria cuentabancaria) {
        bC.save(cuentabancaria);
    }

    @Override
    public List<Cuentabancaria> list() {
        return bC.findAll();
    }

    @Override
    public void delete(int idCuentabancaria) {
        bC.deleteById(idCuentabancaria);
    }

    @Override
    public Cuentabancaria listId(int idCuentabancaria) {
        return bC.findById(idCuentabancaria).orElse(new Cuentabancaria());
    }
}
