package Phone;

/**
 * Created by Ehshan on 01/12/2014.
 */

public class MobilePhone extends OldPhone {
    private String[] callLog;

    public MobilePhone(String brand) {
        super(brand);
        callLog = new String[11];
    }

    @Override
    public void call(String number) {
        super.call(number);
        logCall(number);
    }

    public void logCall(String number) {
        if ( number != null ) {
            for ( int i=callLog.length-1; i>0; i-- ) {
                callLog[i] = callLog[i-1];
            }
            callLog[0] = number;
        }
    }

    public void printLastNumbers() {
        System.out.println("Recent Calls:");
        if(callLog[0] == null) {
            System.out.println("You have no recent calls");
            return;
        } else {
            for(int i = 0; i< callLog.length-1; i++) {
                if(callLog[i]!=null) {
                    System.out.println(i+1 + ". " + callLog[i]);
                }
            }
        }
    }



    public void ringAlarm(String message) {
        System.out.println("Alarm: " + message);
    }

    private void playGame(String gameName) {
        System.out.println("Loading " + gameName+"...");
    }

}
