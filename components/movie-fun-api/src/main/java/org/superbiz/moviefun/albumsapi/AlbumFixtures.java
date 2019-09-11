package org.superbiz.moviefun.albumsapi;

import org.springframework.stereotype.Component;

import java.util.List;

import static java.util.Arrays.asList;

@Component
public class AlbumFixtures {

    public List<AlbumInfo> load() {
        return asList(
                new AlbumInfo("artist1", "title1", 1998, 9),
                new AlbumInfo("artist2", "title12", 1997, 8),
                new AlbumInfo("Radiohead", "Kid A", 2000, 9)

        );
    }
}