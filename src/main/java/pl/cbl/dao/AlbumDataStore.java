package pl.cbl.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import pl.cbl.data.MusicAlbum;

@Component
public class AlbumDataStore {

	private List<MusicAlbum> lista;

	public List<MusicAlbum> getLista() {
		return lista;
	}

	public void setLista(List<MusicAlbum> lista) {
		this.lista = lista;
	}
	
	
	public void addAlbum(MusicAlbum music) {
	lista.add(music);
		
		
	}
	
}
