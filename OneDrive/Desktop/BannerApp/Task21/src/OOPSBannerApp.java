/**
 * OOPSBannerApp UC1-OOPS Banner Display Application
 *
 */

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

            }


    }

}


