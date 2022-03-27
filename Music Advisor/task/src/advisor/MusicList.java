package advisor;

import java.util.Objects;
import java.util.Scanner;

public class MusicList {

    String newList = "Mountains [Sia, Diplo, Labrinth]\n" +
            "Runaway [Lil Peep]\n" +
            "The Greatest Show [Panic! At The Disco]\n" +
            "All Out Life [Slipknot]";
    String feature = "Mellow Morning\n" +
            "Wake Up and Smell the Coffee\n" +
            "Monday Motivation\n" +
            "Songs to Sing in the Shower";
    String categories = "Top Lists\n" +
            "Pop\n" +
            "Mood\n" +
            "Latin";
    String playlists = "Walk Like A Badass  \n" +
            "Rage Beats  \n" +
            "Arab Mood Booster  \n" +
            "Sunday Stroll";

    public MusicList() {
        Scanner s = new Scanner(System.in);
        while (true) {
            switch (Objects.requireNonNull(Menu.getByInput(s.nextLine()))) {
                case NEW:
                    getNewList();
                    break;
                case CATEGORIES:
                    getCategories();
                    break;
                case FEATURED:
                    getFeature();
                    break;
                case MOOD:
                    getPlaylists();
                    break;
                case EXIT:
                    System.out.println("---GOODBYE!---");
                    return;
            }
        }
    }

    public void getNewList() {
        System.out.println("---NEW RELEASES---");
        System.out.println(newList);
    }

    public void getCategories() {
        System.out.println("---CATEGORIES---");
        System.out.println(categories);
    }

    public void getFeature() {
        System.out.println("---FEATURED---");
        System.out.println(feature);
    }

    public void getPlaylists() {
        System.out.println("---MOOD PLAYLISTS---");
        System.out.println(playlists);
    }
}


enum Menu {
    NEW("new"),
    FEATURED("featured"),
    CATEGORIES("categories"),
    MOOD("playlists Mood"),
    EXIT("exit");

    final String input;

    Menu(String input) {
        this.input = input;
    }

    public static Menu getByInput(String input) {
        for (Menu value: values()) {
            if (Objects.equals(value.input, input)) {
                return value;
            }
        }
        return null;
    }


}
