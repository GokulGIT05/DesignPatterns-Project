package dp22.behavioral_10.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class SongsOfThe80s implements SongIterator {

	// ArrayList holds SongInfo objects

	SongInfo[] bestSongs;

	int index = 0;

	public SongsOfThe80s() {

		bestSongs = new SongInfo[3];
		
		addSong("Roam", "B 52s", 1989);
		addSong("Cruel Summer", "Bananarama", 1984);
		addSong("Head Over Heels", "Tears For Fears", 1985);

	}

	// Add a SongInfo object to the end of the ArrayList

	public void addSong(String songName, String bandName, int yearReleased) {

		SongInfo songInfo = new SongInfo(songName, bandName, yearReleased);

		bestSongs[index] = songInfo;
		index++;

	}

	
	  // Get rid of this
	  
	  // Return the ArrayList filled with SongInfo Objects
	// Not recommended way
	  public SongInfo[] getBestSongs() {
	  
	  return bestSongs;
	  
	  }
	 

	// NEW By adding this method I'll be able to treat all

	// collections the same

	public Iterator createIterator() {

		return Arrays.asList(bestSongs).iterator();

	}

}
