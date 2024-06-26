import java.util.ArrayList;

public class UserInterface {
    TextUI UI = new TextUI();


    public void userOptions(Player player) throws InterruptedException {
        StartMenu startMenu = new StartMenu();
        CombatInterface combat = new CombatInterface();
        Explore explore = new Explore();
        Music.clip.stop();
        Music.playMusic("src/Soundtracks/Wii Music - Gaming Background Music (HD).wav");
        UI.displayMsg("Select your option below:");
        UI.displayMsg("1: Party\n2: Bag\n3: Town\n4: Explore\n5: Save\n6: Exit Game");

        boolean whileKey = false;

        while (!whileKey) {

            String option = UI.userInput();
            switch (option) {
                case "1":
                    combat.changePokemonInParty(player);
                    whileKey = true;
                    break;
                case "2"://Bag
                    combat.viewBag();
                    userOptions(player);
                    whileKey = true;
                    break;
                case "3"://Town
                    townOrPokeCenter(player);
                    whileKey = true;
                    break;
                case "4": //explore
                    explore.exploreInterface(player);
                    whileKey = true;
                    break;
                case "5": //Save game
                    whileKey = true;
                    startMenu.savePlayer(player);
                    UI.displayMsg("Your game has been saved!");
                    userOptions(player);
                    break;
                case "6": //Exit game
                    whileKey = true;
                    UI.displayMsg("You have exited the game.");
                    System.exit(0);
                    break;
                default:
                    UI.displayMsg("Oak: That isn't the right input!");

            }
        }
    }

    public void pokeMartOptions(Player player) throws InterruptedException {
        Town town = new Town();
        Music.clip.stop();
        Music.playMusic("src/Soundtracks/Poké Mart [Pokémon： HeartGold & SoulSilver].wav");

        UserInterface user = new UserInterface();
        UI.displayMsg(".  .  .  .  .  .  .  .  .  .  .  .  .  _N_.  .  .  .  .  .  .  .  .  .  .  .  . \n" +
                " : . : . : . : . : . : . : . : . : . : |=|. : . : . : . : . : . : .__ . : . : . \n" +
                ":.:.:.:.:.:.:.:.:.:.' '________________|=|_________________________||_______  _.\n" +
                "::::::::::::'''__..--==-=-=-=-=-=-=-=- |=| -=-=-=-=-=-=-=-=-=-=-=-[!!]=-__.--~-=\n" +
                "::::'''__..--===-=-=-=-=-=-=-=-=-=-=-=-  /-=-=-=-=-=-=-=-=-=-=-=-=__.--~=-=-=-=-\n" +
                "'..--==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-/-=-=-=-=-=-=-=-=-=-__.--~-=-=-=-=-=-=-=\n" +
                " [=====================================/-=-=-=-=-=-=-=-=.--~=-=-=-=-=-=-=-=-=-=-\n" +
                ":.. | _ .  .  .   _______ .  .  .  _  /-=-=-=-=-=-=-=-= [=======================\n" +
                "::: |[_]_________| POKÉMART |________[_][====================| .  ·--·-------·--· .\n" +
                "::: | | ||_____|__¯¯¯¯¯¯¯__|____|| | |/ ║__║__║__║__║ ||  |    |::| | | | |::|  \n" +
                "::: |   ||_____|_____|_____|____||   |  ║__║__║__║__║ ||__|  . |::|-+-+-+-|::|  \n" +
                "::: | . ||_____|_____|_____|____|| .{@} ║__║__║__║__║ | __|    |::|_|_|_|_|::| .\n" +
                "::: |   ||_____|_____|_____|____|| _\\|/_____________  |___| .  |__|=======|__|  \n" +
                "----|___||_____|_____|_____|____||[=================]'----| adl  .   {@}   .  {@\n" +
                ",',',',/ , ' , ' , ' . ` . ` . ` .\\`  ` ` ~ ~ ' ' '/ - = -| \\|/      \\|/      \\|");
        UI.displayMsg("Welcome to the PokéMart!");
        UI.displayMsg("1: Buy items\n2: Sell items\n3: Leave shop");

        boolean whileKey = false;

        while (!whileKey) {

            String option = UI.userInput();
            switch (option) {
                case "1":
                    town.buy(player);
                    break;
                case "2":
                    town.sell(player);
                    whileKey = true;
                    break;
                case "3":
                    UI.displayMsg("Thank you for visiting the PokéMart!");
                    userOptions(player);
                    whileKey = true;
                    break;
                default:
                    UI.displayMsg("Oak: That isn't the right input!");
            }

            user.townOrPokeCenter(player);
        }
    }

    public void townOrPokeCenter(Player player) throws InterruptedException {
        Town town = new Town();
        Music.clip.stop();
        Music.playMusic("src/Soundtracks/Pokemon Blue⧸Red - Pallet Town.wav");

        System.out.println("                                                          |>>>\n" +
                "                   _                      _                |\n" +
                "    ____________ .' '.    _____/----/-\\ .' './========\\   / \\\n" +
                "   //// ////// /V_.-._\\  |.-.-.|===| _ |-----| u    u |  /___\\\n" +
                "  // /// // ///==\\ u |.  || | ||===||||| |T| |   ||   | .| u |_ _ _ _ _ _\n" +
                " ///////-\\////====\\==|:::::::::::::::::::::::::::::::::::|u u| U U U U U\n" +
                " |----/\\u |--|++++|..|'''''''''''::::::::::::::''''''''''|+++|+-+-+-+-+-+\n" +
                " |u u|u | |u ||||||..|              '::::::::'           |===|>=== _ _ ==\n" +
                " |===|  |u|==|++++|==| PokéCenter   .::::::::.    PokéMart    | T |..| V |..\n" +
                " |u u|u | |u ||HH||         \\|/    .::::::::::.\n" +
                " |===|_.|u|_.|+HH+|_              .::::::::::::.              _\n" +
                "                __(_)___         .::::::::::::::.         ___(_)__\n" +
                "---------------/  / \\  /|       .:::::;;;:::;;:::.       |\\  / \\  \\-------\n" +
                "______________/_______/ |      .::::::;;:::::;;:::.      | \\_______\\________\n" +
                "|       |     [===  =] /|     .:::::;;;::::::;;;:::.     |\\ [==  = ]   |\n" +
                "|_______|_____[ = == ]/ |    .:::::;;;:::::::;;;::::.    | \\[ ===  ]___|____\n" +
                "     |       |[  === ] /|   .:::::;;;::::::::;;;:::::.   |\\ [=  ===] |\n" +
                "_____|_______|[== = =]/ |  .:::::;;;::::::::::;;;:::::.  | \\[ ==  =]_|______\n" +
                " |       |    [ == = ] /| .::::::;;:::::::::::;;;::::::. |\\ [== == ]      |\n" +
                "_|_______|____[=  == ]/ |.::::::;;:::::::::::::;;;::::::.| \\[  === ]______|_\n" +
                "   |       |  [ === =] /.::::::;;::::::::::::::;;;:::::::.\\ [===  =]   |\n" +
                "___|_______|__[ == ==]/.::::::;;;:::::::::::::::;;;:::::::.\\[=  == ]___|_____");
        UI.displayMsg("Welcome to Celadon City!\nWhat place would you like to visit?");
        UI.displayMsg("1: PokéCenter\n2: PokéMart\n3: Leave town");
        switch (UI.userInput()) {
            case "1":
                town.pokeCenter(player);
                break;
            case "2":
                pokeMartOptions(player);
                break;
            case "3":
                userOptions(player);
                break;
            default:
                System.out.println("Oak: That isn't the right input!");
                townOrPokeCenter(player);
                break;

        }

    }

    public void startMenu() throws InterruptedException {
        TextUI ui = new TextUI();

        System.out.println("****************************************************************************************************");
        ui.displayMsg("   ▄███████▄  ▄██████▄     ▄█   ▄█▄    ▄████████  ▄█     █▄   ▄██████▄     ▄████████  ▄█       ████████▄  \n" +
                "  ███    ███ ███    ███   ███ ▄███▀   ███    ███ ███     ███ ███    ███   ███    ███ ███       ███   ▀███      \n" +
                "  ███    ███ ███    ███   ███▐██▀     ███    █▀  ███     ███ ███    ███   ███    ███ ███       ███    ███     \n" +
                "  ███    ███ ███    ███  ▄█████▀     ▄███▄▄▄     ███     ███ ███    ███  ▄███▄▄▄▄██▀ ███       ███    ███      \n" +
                "▀█████████▀  ███    ███ ▀▀█████▄    ▀▀███▀▀▀     ███     ███ ███    ███ ▀▀███▀▀▀▀▀   ███       ███    ███     \n" +
                "  ███        ███    ███   ███▐██▄     ███    █▄  ███     ███ ███    ███ ▀███████████ ███       ███    ███        \n" +
                "  ███        ███    ███   ███ ▀███▄   ███    ███ ███ ▄█▄ ███ ███    ███   ███    ███ ███▌    ▄ ███   ▄███        \n" +
                " ▄████▀       ▀██████▀    ███   ▀█▀   ██████████  ▀███▀███▀   ▀██████▀    ███    ███ █████▄▄██ ████████▀          \n" +
                "                          ▀                                               ███    ███ ▀                    ");
        System.out.println("*****************************************************************************************************");
        System.out.println("WELCOME TO THE WORLD OF POKÉMON!");
        System.out.println("\nSelect an option below:");
        ui.displayMsg("\n1: Continue game\n2: New game\n3: Exit Game");
        ui.displayMsg("*****************************************************************************************************");

        startMenuOptions();
    }

    public void startMenuOptions() throws InterruptedException {
        StartMenu menu = new StartMenu();
        switch (UI.userInput()) {
            case "1":
                menu.continueGame();
                break;
            case "2":
                menu.newGame();
                break;
            case "3":
                UI.displayMsg("You have exited the game.");
                System.exit(0);
                break;

            default:
                UI.displayMsg("Oak: That isn't the right input!");
                startMenuOptions();

        }
    }


}
