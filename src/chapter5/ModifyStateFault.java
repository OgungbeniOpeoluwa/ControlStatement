package chapter5;

public class ModifyStateFault {
    private int accountNumber;
    private String makeAndModel;
    private String state;

    public ModifyStateFault(int accountNumber, String makeAndModel, String state) {
        this.accountNumber = accountNumber;
        this.makeAndModel = makeAndModel;
        this.state = state;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setMakeAndModel(String makeAndModel) {
        this.makeAndModel = makeAndModel;
    }

    public String getMakeAndModel() {
        return makeAndModel;
    }

    public void setState(String state) {
        String CT = "Connecticut";
        String MA = "Massachusetts";
        String ME = "Maine" ;
        String NH = "New Hampshire";
        String NJ = "New Jersey";
        String NY =  "New York";
        String PA  = "Pennsylvania";
        String VT = "Vermont";

        if(state.equals("CT") || state.equals("MA")||state.equals("ME")|| state.equals("NH") || state.equals("NJ")||state.equals("NY")|| state.equals("PA") || state.equals("VT")){
           this.state = state;
        }
        else{
            System.out.println("Invalid input");
        }
    }

    public String getState() {
        return state;
    }

    boolean isNoFaultState() {
        boolean noFaultState;
        switch (getState()) {
            case "MA":
            case "NJ":
            case "NY":
            case "PA":
                noFaultState = true;
                break;
            default:
                noFaultState = false;
                break;


        }
        return noFaultState;
    }
}







