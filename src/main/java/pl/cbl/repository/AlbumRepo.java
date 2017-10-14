package pl.cbl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.cbl.data.MusicAlbum;

public interface AlbumRepo extends JpaRepository<MusicAlbum, Long>{

}
