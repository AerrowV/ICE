import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        //Music music = new Music();
        //Music.playMusic("src/Pokémon-Theme-Song.wav");

        FileIO file = new FileIO();
        file.loadPokemonFromFile("Data\\Pokemon.csv");

        UserInterface userInterface = new UserInterface();
        userInterface.startMenu();
    }


}