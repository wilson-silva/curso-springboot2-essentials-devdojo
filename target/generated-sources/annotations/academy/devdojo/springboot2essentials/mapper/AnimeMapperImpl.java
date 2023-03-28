package academy.devdojo.springboot2essentials.mapper;

import academy.devdojo.springboot2essentials.domain.Anime;
import academy.devdojo.springboot2essentials.requests.AnimePostRequestBody;
import academy.devdojo.springboot2essentials.requests.AnimePutRequestBody;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-28T15:23:53-0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 11.0.17 (Eclipse Adoptium)"
)
@Component
public class AnimeMapperImpl extends AnimeMapper {

    @Override
    public Anime toAnime(AnimePostRequestBody animePostRequestBody) {
        if ( animePostRequestBody == null ) {
            return null;
        }

        Anime anime = new Anime();

        anime.setName( animePostRequestBody.getNamePost() );

        return anime;
    }

    @Override
    public Anime toAnime(AnimePutRequestBody animePutRequestBody) {
        if ( animePutRequestBody == null ) {
            return null;
        }

        Anime anime = new Anime();

        anime.setId( animePutRequestBody.getId() );
        anime.setName( animePutRequestBody.getName() );

        return anime;
    }
}
