package academy.devdojo.springboot2essentials.controller;

import academy.devdojo.springboot2essentials.domain.Anime;
import academy.devdojo.springboot2essentials.service.AnimeService;
import academy.devdojo.springboot2essentials.util.DateUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("animes")
@Log4j2
@RequiredArgsConstructor
public class AnimeController {
    private final DateUtil dateUtil;
    private final AnimeService animeService;

    @GetMapping
    public ResponseEntity<List<Anime>> list(){
        log.info(dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
        return ResponseEntity.ok(animeService.listAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Anime> findById(@PathVariable Long id){
        return ResponseEntity.ok(animeService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Anime> save(@RequestBody Anime anime){
        animeService.save(anime);
        return ResponseEntity.status(HttpStatus.CREATED).body(anime);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        animeService.delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @PutMapping
    public ResponseEntity<Void> replace(@RequestBody Anime anime){
        animeService.replace(anime);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}
