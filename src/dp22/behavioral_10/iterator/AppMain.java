package dp22.behavioral_10.iterator;

/*
http://www.newthinktank.com/2012/10/iterator-design-pattern-tutorial/
*/

public class AppMain {

	public static void main(String[] args) {
		SongsOfThe70s songs70s = new SongsOfThe70s();

		SongsOfThe80s songs80s = new SongsOfThe80s();

		SongsOfThe90s songs90s = new SongsOfThe90s();

		DiscJockeyToPlayAllSongs madMike = new DiscJockeyToPlayAllSongs(songs70s, songs80s, songs90s);

		// madMike.showTheSongs();

		madMike.showTheSongs2();

	}

}
