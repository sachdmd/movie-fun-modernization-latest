package org.superbiz.moviefun.albumsapi;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.client.RestOperations;
import org.springframework.web.util.UriComponentsBuilder;
import org.superbiz.moviefun.moviesapi.MovieInfo;

import java.util.HashMap;
import java.util.List;

import static org.springframework.http.HttpMethod.GET;

public class AlbumsClient {
    private String albumsUrl;
    private RestOperations restOperations;

    private static ParameterizedTypeReference<List<AlbumInfo>> albumbsListType = new ParameterizedTypeReference<List<AlbumInfo>>() {
    };

    public AlbumsClient(String albumsUrl, RestOperations restOperations) {
        this.albumsUrl = albumsUrl;
        this.restOperations = restOperations;
    }

    public void addAlbum(AlbumInfo album) {
        restOperations.postForEntity(albumsUrl, album, AlbumInfo.class);
    }

    /*public void deleteMovieId(Long albumId) {
        restOperations.delete(albumsUrl + "/" + albumId);
    }

    public String index(HashMap model) {
        return restOperations.getForObject(albumsUrl + "/count", model,String.class);
    }


    public int count(String field, String key) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(albumsUrl + "/count")
                .queryParam("field", field)
                .queryParam("key", key);

        return restOperations.getForObject(builder.toUriString(), Integer.class);
    }


    public List<MovieInfo> findAll(int start, int pageSize) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(moviesUrl)
                .queryParam("start", start)
                .queryParam("pageSize", pageSize);

        return restOperations.exchange(builder.toUriString(), GET, null, movieListType).getBody();
    }

    public List<MovieInfo> findRange(String field, String key, int start, int pageSize) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(moviesUrl)
                .queryParam("field", field)
                .queryParam("key", key)
                .queryParam("start", start)
                .queryParam("pageSize", pageSize);

        return restOperations.exchange(builder.toUriString(), GET, null, movieListType).getBody();
    }*/

    public List<AlbumInfo> getAlbums() {
        return restOperations.exchange(albumsUrl, GET, null, albumbsListType).getBody();
    }
}
