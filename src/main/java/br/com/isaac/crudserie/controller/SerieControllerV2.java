package br.com.isaac.crudserie.controller;


import br.com.isaac.crudserie.model.Serie;
import br.com.isaac.crudserie.services.SerieService;
import br.com.isaac.crudserie.services.SerieServiceV2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/series/v2")
public class SerieControllerV2 {


    @Autowired
    private SerieServiceV2 service;

    @PostMapping
    public Serie save(@RequestBody Serie serie){
        return service.save(serie);
    }

    @GetMapping
    public List<Serie> findAll(){
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Serie findById(@PathVariable("id") long id) throws Exception{
        return service.findById(id);
    }

    @PutMapping
    public Serie update(@RequestBody Serie serie) throws Exception{
        return service.update(serie);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") long id) throws Exception {
        service.delete(id);
    }

    @GetMapping("/query/{nome}")
    public List<Serie> listByName(@PathVariable("nome") String nome){
        return service.listByName(nome);
    }


}
