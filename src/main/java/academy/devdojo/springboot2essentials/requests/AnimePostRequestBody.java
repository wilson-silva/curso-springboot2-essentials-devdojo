package academy.devdojo.springboot2essentials.requests;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class AnimePostRequestBody {

    @NotEmpty
    private String namePost;
}
