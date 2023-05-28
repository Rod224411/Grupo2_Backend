package pe.edu.upc.huaycosos.controllers;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.huaycosos.dtos.BankAccountDTO;
import pe.edu.upc.huaycosos.entities.BankAccount;
import pe.edu.upc.huaycosos.services.IBankAccountService;

import java.util.List;
import java.util.stream.Collectors;
@RestController
@RequestMapping("/bankaccounts")
public class BankAccountController {
    @Autowired
    private IBankAccountService bS;
    @PostMapping
    public void insert(@RequestBody BankAccountDTO dto){
        ModelMapper m=new ModelMapper();
        BankAccount b=m.map(dto,BankAccount.class);
        bS.insert(b);
    }
    @GetMapping
    public List<BankAccountDTO> list(){
        return bS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x, BankAccountDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id")Integer id){
        bS.delete(id);
    }
    @GetMapping("/{id}")
    public BankAccountDTO listId(@PathVariable("id")Integer id){
         ModelMapper m = new ModelMapper();
         BankAccountDTO dto=m.map(bS.listId(id),BankAccountDTO.class);
         return dto;
    }
    @PutMapping
    public void goUpdate(@RequestBody BankAccountDTO dto){
        ModelMapper m =new ModelMapper();
        BankAccount b=m.map(dto,BankAccount.class);
        bS.insert(b);
    }

}
