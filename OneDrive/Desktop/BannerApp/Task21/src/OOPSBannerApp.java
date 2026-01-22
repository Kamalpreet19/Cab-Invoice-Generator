/**
 * OOPSBannerApp UC1-OOPS Banner Display Application
 *
 */
import java.util.HashMap;
public class OOPSBannerApp {
    //public static void main(String args[]) {
        /*
        System.out.println("OOPS");








        //OOPSBannerApp UC2-OOPS Banner Display Application

        System.out.println("*********" + "   " + "*********" + "   " + "*********" + "   " + "*********");
        System.out.println("*       *" + "   " + "*       *" + "   " + "*       *" + "   " + "*        ");
        System.out.println("*       *" + "   " + "*       *" + "   " + "*       *" + "   " + "*        ");
        System.out.println("*       *" + "   " + "*       *" + "   " + "*********" + "   " + "*********");
        System.out.println("*       *" + "   " + "*       *" + "   " + "*        " + "   " + "        *");
        System.out.println("*       *" + "   " + "*       *" + "   " + "*        " + "   " + "        *");
        System.out.println("*********" + "   " + "*********" + "   " + "*        " + "   " + "*********");


        System.out.println();*/







        //OOPSBannerApp UC3-OOPS Banner Display (used String.join())
        /*
        System.out.println(String.join("   ",
                "*********", "*********", "*********", "*********"));

        System.out.println(String.join("   ",
                "*       *", "*       *", "*       *", "*        "));

        System.out.println(String.join("   ",
                "*       *", "*       *", "*       *", "*        "));

        System.out.println(String.join("   ",
                "*       *", "*       *", "*********", "*********"));

        System.out.println(String.join("   ",
                "*       *", "*       *", "*        ", "        *"));

        System.out.println(String.join("   ",
                "*       *", "*       *", "*        ", "        *"));

        System.out.println(String.join("   ",
                "*********", "*********", "*        ", "*********"));


        System.out.println();*/







    //OOPSBannerApp UC4-OOPS Banner print using String.join() and a loop
     /*
    String[] banner = {
            String.join("   ",
                    "*********", "*********", "*********", "*********"),

            String.join("   ",
                    "*       *", "*       *", "*       *", "*        "),

            String.join("   ",
                    "*       *", "*       *", "*       *", "*        "),

            String.join("   ",
                    "*       *", "*       *", "*********", "*********"),

            String.join("   ",
                    "*       *", "*       *", "*        ", "        *"),

            String.join("   ",
                    "*       *", "*       *", "*        ", "        *"),

            String.join("   ",
                    "*********", "*********", "*        ", "*********")
    };

        for(String line:banner){
        System.out.println(line);

    }


        System.out.println();*/











        //OOPSBannerApp UC5- Prints OOPS banner using inline array and loop.
        /*
        String[] banner2 = {
                String.join("   ", "*********", "*********", "*********", "*********"),
                String.join("   ", "*       *", "*       *", "*       *", "*        "),
                String.join("   ", "*       *", "*       *", "*       *", "*        "),
                String.join("   ", "*       *", "*       *", "*********", "*********"),
                String.join("   ", "*       *", "*       *", "*        ", "        *"),
                String.join("   ", "*       *", "*       *", "*        ", "        *"),
                String.join("   ", "*********", "*********", "*        ", "*********")
        };


        for (String line : banner2) {
            System.out.println(line);
        }
        System.out.println();*/






        //OOPSBannerApp UC6- Refactor Banner Logic into Functions
    /*
        public static String[] getOPattern() {
            return new String[]{
                    "    ***    ",
                    " **     ** ",
                    "**       **",
                    "**       **",
                    "**       **",
                    " **     ** ",
                    "    ***    "
            };

            }


    public static String[] getPPattern() {
        return new String[]{
                "*********",
                "*       *",
                "*       *",
                "*********",
                "*        ",
                "*        ",
                "*        "

        };

    }

    public static String[] getSPattern() {
        return new String[]{
                "*********",
                "*        ",
                "*        ",
                "*********",
                "        *",
                "        *",
                "*********",

        };

    }

    public static void main(String args[]){

            String[] oPattern=getOPattern();
            String[] pPattern=getPPattern();
            String[] sPattern=getSPattern();




            for(int i=0;i<oPattern.length;i++){
                System.out.println(oPattern[i] + " " + oPattern[i] + " " + pPattern[i] + " " + sPattern[i]);

            }*/




//OOPSBannerApp UC7- Store Character Pattern in a Class
    /*
static class  CharacterPatternMap{
        private char characters;
        private String[] patterns;

        CharacterPatternMap(char characters, String[] patterns){
            this.characters=characters;
            this.patterns=patterns;
        }

        public char getCharacters(){
            return characters;
        }

        public String[] getPatterns(){
            return patterns;
        }

}



    public static void main(String args[]){
    String[] oPattern={
            "    ***    ",
            " **     ** ",
            "**       **",
            "**       **",
            "**       **",
            " **     ** ",
            "    ***    "

    };

    String[] pPattern={
            "*********",
            "*       *",
            "*       *",
            "*********",
            "*        ",
            "*        ",
            "*        "

    };


    String[] sPattern={
            "*********",
            "*        ",
            "*        ",
            "*********",
            "        *",
            "        *",
            "*********"
    };



    CharacterPatternMap O=new CharacterPatternMap('O', oPattern);
    CharacterPatternMap P=new CharacterPatternMap('P', pPattern);
    CharacterPatternMap S=new CharacterPatternMap('S', sPattern);

    CharacterPatternMap[] bannerChars={O,O,P,S};

    for(int i=0;i<7;i++){
        StringBuilder line=new StringBuilder();

        for(CharacterPatternMap ch:bannerChars){
            line.append(ch.getPatterns()[i]).append("   ");
        }

        System.out.println(line.toString());
    }*/




    //OOPSBannerApp UC8- Use Map for Character Patterns and Render via Function

    static HashMap<Character, String[]> patternMap = new HashMap<>();
    public static void buildPatterns() {
        String[] oPattern = {
                "    ***    ",
                " **     ** ",
                "**       **",
                "**       **",
                "**       **",
                " **     ** ",
                "    ***    "

        };

        String[] pPattern = {
                "*********",
                "*       *",
                "*       *",
                "*********",
                "*        ",
                "*        ",
                "*        "

        };


        String[] sPattern = {
                "*********",
                "*        ",
                "*        ",
                "*********",
                "        *",
                "        *",
                "*********"
        };


        patternMap.put('O', oPattern);
        patternMap.put('P', pPattern);
        patternMap.put('S', sPattern);
    }


    public static void printBanner(String message) {

        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            for (int i = 0; i < message.length(); i++) {
                char ch = message.charAt(i);
                String[] pattern = patternMap.get(ch);
                line.append(pattern[row]).append("   ");
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        buildPatterns();
        printBanner("OOPS");






    }

}


