package fullstack.com.br.cardapio.adapter.controller;

import fullstack.com.br.cardapio.adapter.entity.Comidas;
import fullstack.com.br.cardapio.core.repository.ComidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("comida")
public class ComidaController {

@Autowired
 private ComidaRepository comidaRepository;
@GetMapping
    public List<Comidas> getAll(){
    List<Comidas> comidasList = comidaRepository.findAll();
  return comidasList;
    }
}
