import java.util.HashMap;

class checkoutTracker {

    

    HashMap<Integer, CheckOutAble> checkoutLog = new HashMap<>();

    public void checkOutItem(CheckOutAble itemID, int userID){
        //Add userID with corresponding itemID
        checkoutLog.put(userID, itemID);
    }

    public boolean renewItem(int itemID, int userID){
        //placeholder
        return true;
    }

    public boolean checkOutstandingRequest(int itemID, int userID){
        //placeholder
        return true;
    }

    public void returnItem(int itemID, int userID){

    }

    public double outstandingFine(int userID){
        //placeholder
        return userID;

    }
  
}
