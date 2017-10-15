package pl.cbl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pl.cbl.data.MusicAlbum;

@Repository
public interface AlbumRepo extends JpaRepository<MusicAlbum, Long>{

}
