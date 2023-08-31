public class NokiaMenuReverse {
    
    public static void main(String[] args) {
        System.out.println("==LIST OF MENU FUNCTIONS==\n");

        System.out.println("1. Phonebook");
        System.out.println("2. Message");
        System.out.println("3. Chat");
        System.out.println("4. Call register");
        System.out.println("5. Tones");
        System.out.println("6. Setting");
        System.out.println("7. Call divert");
        System.out.println("8. Games");
        System.out.println("9. Calculator");
        System.out.println("10. Reminders");
        System.out.println("11. Clocks");
        System.out.println("12. Profiles");
        System.out.println("13. Sim service");
        Scanner userInput = new Scanner(System.in);

        int input = userInput.nextInt();
        int customerInput = input;

        switch (customerInput){
            case 1 : {
                System.out.println("    1. Search");
                System.out.println("    2. Service no's");
                System.out.println("    3. Add name");
                System.out.println("    4. Erase");
                System.out.println("    5. Edit");
                System.out.println("    6. Assign tone");
                System.out.println("    7. send b'card");
                System.out.println("    8. Option");
                System.out.println("    9. Speed dial");
                System.out.println("    10. Service Voice tags");

                int phonebookInput = userInput.nextInt();

                if (phonebookInput ==1) System.out.println("Search");
                if (phonebookInput ==2) System.out.println("Service no");
                if (phonebookInput ==3) System.out.println("Add name");
                if (phonebookInput ==4) System.out.println("Erase");
                if (phonebookInput ==5) System.out.println("Edit");
                if (phonebookInput ==6) System.out.println("Assign tone");
                if (phonebookInput ==7) System.out.println("Send b'card");
                if (phonebookInput ==8) {
                    System.out.println("        .1 Type of memory\n     2. memory status");
                    int speedial =userInput.nextInt();
                    if (speedial ==1) System.out.println("TYPE OF MEMORY");
                    if (speedial ==2) System.out.println("MEMORY STATUS");

                }
                if (phonebookInput ==9) System.out.println("Speed dial");
                if (phonebookInput ==10) System.out.println("Voice tags");
            }

            case 2 : {
                System.out.println("        1.Write message\n         2.      inbox\n     3. outbox\n     4. Picture message\n" +
                        "       5. Template\n       .6 Smiley\n     7. Message setting\n        8. Info service\n" +
                        "       9. voice mailbox number\n       10. service command editor");
                int message = userInput.nextInt();
                if (message ==1) System.out.println("write message");
                if (message ==2) System.out.println("Inbox");
                if (message ==3) System.out.println("Outbox");
                if (message ==4) System.out.println("Picture message");
                if (message ==5) System.out.println("Template");
                if (message ==6) System.out.println("Smiley");
                if (message ==7) {

                    System.out.println("            1. Set");
                    System.out.println("            2. Common");

                    int messageSetting =userInput.nextInt();
                    if (messageSetting == 1){

                        System.out.println("            1. Message centre number");
                        System.out.println("            2. Messages sent as");
                        System.out.println("            3. Message validity");

                    }
                    else if (messageSetting ==2){
                        System.out.println("            1. Delivery report");
                        System.out.println("            2. Reply via same center");
                        System.out.println("            3. Character report");

                    }

                }
                if (message ==8) System.out.println("Info service");
                if (message ==9) System.out.println("Speed dial");
                if (message ==10) System.out.println("Voice tags");
            }

            case 3 : {
                System.out.println("CHAT");
            }

            case 4 : {
                System.out.println("            1.Missed calls");
                System.out.println("            2.Received calls");
                System.out.println("            3. Dialled numbers");
                System.out.println("            4. Erase recent call list");
                System.out.println("            5. show call duration");
                System.out.println("            6. Show call cost");
                System.out.println("            7. call cost settings");
                System.out.println("            8. Prepaid settings");

                int callReg = userInput.nextInt();
                if (callReg ==1) System.out.println("Missed call");
                if (callReg ==2) System.out.println("Received calls");
                if (callReg ==3) System.out.println("Dialled numbers");
                if (callReg ==4) System.out.println("Erase recent call list");
                if (callReg ==5) {
                    System.out.println(             "1. Last call duration");
                    System.out.println(             "2. All call duration");
                    System.out.println(             "3. Received call duration");
                    System.out.println(             "4. Dialled call duration");
                    System.out.println(             "5. clear timers");
                }
                if (callReg ==6) {
                    System.out.println(             "1. Last call cost");
                    System.out.println(             "2. All call cost");
                    System.out.println(             "3. Clear counters");
                }
                if (callReg ==7) {
                    System.out.println(             "1. Call cost limit");
                    System.out.println(             "2. Show costs in");
                }
                if (callReg ==4) System.out.println("Prepaid settings");


            }

            case 5 :{
                System.out.println("                1. Ringing tones");
                System.out.println("                2. Ringing volume");
                System.out.println("                3. Incoming call alert");
                System.out.println("                4. Composer");
                System.out.println("                5. Message alert tone");
                System.out.println("                6. Keypad tones");
                System.out.println("                7. warning and game tones");
                System.out.println("                8. Vibrating alert");
                System.out.println("                9. scree saver");
                int tonePack =userInput.nextInt();
                if (tonePack == 1){
                    System.out.println("                    RINGING TONES");
                }
                if (tonePack == 2){
                    System.out.println("                    RINGING VOLUME");
                }if (tonePack == 3){
                    System.out.println("                    RINGING TONES");
                }if (tonePack == 4){
                    System.out.println("                    INCOMING CALL ALERT");
                }if (tonePack == 5){
                    System.out.println("                    COMPOSER");
                }if (tonePack == 6){
                    System.out.println("                    MESSAGE ALERT TONE");
                }if (tonePack == 7){
                    System.out.println("                    KEYPAD TONES");
                }if (tonePack == 8){
                    System.out.println("                    WARNING AND GAME TONES");
                }if (tonePack == 9){
                    System.out.println("                    SCREEN SAVER");
                }
            }

            case 6 : {
                System.out.println("                1. CALL SETTINGS");
                System.out.println("                2. PHONE SETTINGS");
                System.out.println("                3. SECURITY SETTINGS");
                System.out.println("                4. RESTORE FACTORY SETTINGS");

                int settingPack =userInput.nextInt();
                if (settingPack == 1){
                    System.out.println("                    1. AUTOMATIC REDIAL");
                    System.out.println("                    2. SPEED DAILLING");
                    System.out.println("                    3. CALL WAITING OPTIONS");
                    System.out.println("                    4. OWN NUMBER SENDING");
                    System.out.println("                    5. PERSONAL LINE IN USE");
                    System.out.println("                    6. AUTOMATIC ANSWER");
                }
                if (settingPack == 2){
                    System.out.println("                    1. LANGUAGE");
                    System.out.println("                    2. CELL PHONE DISPLAY");
                    System.out.println("                    3. WELCOME NOTE");
                    System.out.println("                    4. NETWORK SELECTION");
                    System.out.println("                    5. LIGHTS");
                    System.out.println("                    6. CONFIRM SERVICE ACTIONS");
                }
                if (settingPack == 3){
                    System.out.println("                    1. PIN CODE REQUEST");
                    System.out.println("                    2. CALL BARRING SERVICE");
                    System.out.println("                    3. FIXED DIALING");
                    System.out.println("    if (settingPack == 3)                4. CLOSED USER GROUP");
                    System.out.println("                    5. PHONE SECURITY");
                    System.out.println("                    6. CHANGE ACCESS CODE");
                }
                if (settingPack == 3) System.out.println("                  RESTORE FACTORY SETTINGS");

            }

            case 7 :{
                System.out.println("CALL DIVERT");
            }

            case 8 : {
                System.out.println("GAMES");
            }

            case 9 :{
                System.out.println("CALCULATOR");
            }

            case 10 :{
                System.out.println("REMINDER");
            }

            case 11 : {
                System.out.println("                1. ALARM CLOCK");
                System.out.println("                2. CLOCK SETTINGS");
                System.out.println("                3. DATE SETTING");
                System.out.println("                4. STOPWATCH");

                int clock = userInput.nextInt();
                if (clock == 1) {
                    System.out.println("                     ALARM CLOCK");
                }
                if (clock == 2) {
                    System.out.println("                     CLOCK SETTINGS");
                }
                if (clock == 3) {
                    System.out.println("                     DATE SETTING");
                }
                if (clock == 4) {
                    System.out.println("                     STOPWATCH");
                }
            }

            case 12 :{
                System.out.println("PROFILE");
            }

            case 13 :{
                System.out.println("SIM SERVICES");
            }

        }

    }
}
