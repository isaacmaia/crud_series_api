package br.com.isaac.crudserie.services;

import br.com.isaac.crudserie.model.Serie;
import br.com.isaac.crudserie.repository.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SerieService {

    @Autowired
    private SerieRepository repository;

    public Serie save(Serie serie){
        return repository.save(serie);
    }

    public Serie findById(long id) throws Exception{
        return repository.findById(id).orElseThrow( () -> new Exception("Not Found!") );
    }

    public List<Serie> findAll(){
        return repository.findAll();
    }

    public Serie update(Serie serie) throws Exception{
        Serie s = repository.findById(serie.getId()).orElseThrow( () -> new Exception("Not Found"));
        s.setNome(serie.getNome());
        s.setGenero(serie.getGenero());
        s.setPais(serie.getPais());
        return repository.save(s);
    }

    public void delete(long id) throws  Exception{
        Serie s = repository.findById(id).orElseThrow( () -> new Exception("Not Found!") );
        repository.delete(s);
    }
}
