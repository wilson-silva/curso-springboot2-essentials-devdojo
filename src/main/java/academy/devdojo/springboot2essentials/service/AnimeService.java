package academy.devdojo.springboot2essentials.service;

import academy.devdojo.springboot2essentials.domain.Anime;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AnimeService {

    //private final AnimeRepository animeRepository;

    public List<Anime> listAll(){
        return  List.of(new Anime(1L, "Boku no Hero"), new Anime(2L, "Berserk"));
    }

}
