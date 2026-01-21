/**
 * OOPSBannerApp UC1-OOPS Banner Display Application
 *
 */

public class OOPSBannerApp {
    public static void main(String args[]) {
        System.out.println("OOPS");

        //OOPSBannerApp UC2-OOPS Banner Display Application

        System.out.println("*********" + "   " + "*********" + "   " + "*********" + "   " + "*********");
        System.out.println("*       *" + "   " + "*       *" + "   " + "*       *" + "   " + "*        ");
        System.out.println("*       *" + "   " + "*       *" + "   " + "*       *" + "   " + "*        ");
        System.out.println("*       *" + "   " + "*       *" + "   " + "*********" + "   " + "*********");
        System.out.println("*       *" + "   " + "*       *" + "   " + "*        " + "   " + "        *");
        System.out.println("*       *" + "   " + "*       *" + "   " + "*        " + "   " + "        *");
        System.out.println("*********" + "   " + "*********" + "   " + "*        " + "   " + "*********");


        System.out.println();

        //OOPSBannerApp UC3-OOPS Banner Display (used String.join())
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


        System.out.println();

    //OOPSBannerApp UC4-OOPS Banner print using String.join() and a loop

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
    }
}


