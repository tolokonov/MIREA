package com.company.pr_12.task_4;

public class Telephone{
    public String countryCode;
    public String firstTriad;
    public String secondTriad;
    public String tetrad;

    public Telephone(String telephoneNumber) {
        if (telephoneNumber.startsWith("+")) {
            this.telephone_0(telephoneNumber);
        } else if (telephoneNumber.startsWith("8")) {
            this.telephone_1(telephoneNumber);
        }
    }

    public void telephone_0(String telephoneNumber){
        char[] charArray = telephoneNumber.toCharArray();
        tetrad = (charArray[telephoneNumber.length() - 4] + "") + (charArray[telephoneNumber.length() - 3] + "") +
                (charArray[telephoneNumber.length() - 2] + "") + (charArray[telephoneNumber.length() - 1] + "");
        secondTriad = (charArray[telephoneNumber.length() - 7] + "") + (charArray[telephoneNumber.length() - 6] + "")
                + (charArray[telephoneNumber.length() - 5] + "");
        firstTriad = (charArray[telephoneNumber.length() - 10] + "") + (charArray[telephoneNumber.length() - 9] + "") +
                (charArray[telephoneNumber.length() - 8] + "");
        countryCode = telephoneNumber.substring(0, telephoneNumber.length()-10);
    }

    public void telephone_1(String telephoneNumber){
        char[] charArray = telephoneNumber.toCharArray();
        tetrad = (charArray[telephoneNumber.length() - 4] + "") + (charArray[telephoneNumber.length() - 3] + "") +
                (charArray[telephoneNumber.length() - 2] + "") + (charArray[telephoneNumber.length() - 1] + "");
        secondTriad = (charArray[telephoneNumber.length() - 7] + "") + (charArray[telephoneNumber.length() - 6] + "")
                + (charArray[telephoneNumber.length() - 5] + "");
        firstTriad = (charArray[telephoneNumber.length() - 10] + "") + (charArray[telephoneNumber.length() - 9] + "") +
                (charArray[telephoneNumber.length() - 8] + "");
        countryCode = "+7";
    }

    @Override
    public String toString() {
        return "Telephone: " +
                "countryCode - " + countryCode +
                ", firstTriad - " + firstTriad +
                ", secondTriad - " + secondTriad +
                ", tetrad - " + tetrad;
    }
}
