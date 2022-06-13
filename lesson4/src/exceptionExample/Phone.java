package exceptionExample;

public class Phone {
    protected String phoneType;
    protected String phoneNumber;

    public Phone(String phoneType, String phoneNumber){
        if(phoneType == null || phoneNumber == null){
            throw new IllegalArgumentException("The Type and number can not be null");
        }
        this.phoneType = phoneType;
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneType(){
        return phoneType;
    }
    public void setPhoneType(String phoneType){
        this.phoneType = phoneType;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString(){
        return "Phone Type: " + phoneType + ", Phone Number: " + phoneNumber;
    }
}
