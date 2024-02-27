public class Party {
    int noOfGuests; //establishes noOfGuests Variable
    public int getNoOfGuests(){ return noOfGuests;} //get method for noOfGuests
    public void setNoOfGuests(int noOfGuests){this.noOfGuests = noOfGuests;} //set method for noOfGuests
    //method to display party invite
    String displayInvitation(){
        System.out.println("Please come to my party!");
        return null;
    }
}