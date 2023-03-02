package academy.devdojo.springboot2essentials.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class Anime {

    private Long id;
    private String nome;

}
