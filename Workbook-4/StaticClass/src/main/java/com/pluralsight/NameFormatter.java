package com.pluralsight;

public class NameFormatter {
    private NameFormatter() {
    }

    public static String format(String Prefix, String FirstName, String MiddleName, String LastName, String Suffix) {

        LastName = LastName.length() > 0 ? LastName : "";
        Prefix = Prefix.length() > 0 ? Prefix : "";
        FirstName = FirstName.length() > 0 ? FirstName : "";
        MiddleName = MiddleName.length() > 0 ? MiddleName : "";
        Suffix = Suffix.length() > 0 ? Suffix : "";

        //FirstName && LastName ONLY
        if ((FirstName.length() > 0 && LastName.length() > 0) && (Prefix.length() + MiddleName.length() + Suffix.length() == 0)) {
            return format(FirstName, LastName);
        }

        //LastName && FirstName && MiddleName && Suffix ONLY
        if((FirstName.length() > 0 && LastName.length() > 0 && MiddleName.length()>0 && Suffix.length()>0) &&(Prefix.length()==0)){
            return String.format("%1s %1s %1s, %1s", LastName, FirstName, MiddleName, Suffix);
        }

        // WHOLE NAME
        return String.format("%1s %1s %1s %1s, %1s", LastName, Prefix, FirstName, MiddleName, Suffix);

    }

    public static String format(String FirstName, String LastName) {
        return String.format("%1s %1s", LastName, FirstName);
    }


    public static String format(String fullName) {
       String[] partOfNames = fullName.split(" ");
       for(String x:partOfNames){
           Capitalize(x);
       }

        String name = "";

       //FirtName && LastName Only
       if(partOfNames.length==2){
           String FirstName = partOfNames[0];
           String LastName = partOfNames[1];
           name = format(FirstName, LastName);
       }

       //FirstName && MiddleName && LastName && Suffix Only
       if(partOfNames.length==4){
           String Firstname = partOfNames[0];
           String MiddleName = partOfNames[1];
           String LastName = partOfNames[2];
           String Suffix = partOfNames[3];

           name = format("", Firstname, MiddleName, LastName, Suffix);
       }

       //Prefix && FirstName && MiddleName && LastName && Suffix
        if(partOfNames.length==5){
            String Prefix = partOfNames[0];
            String Firstname = partOfNames[1];
            String MiddleName = partOfNames[2];
            String LastName = partOfNames[3];
            String Suffix = partOfNames[4];
            name = format(Prefix, Firstname, MiddleName, LastName, Suffix);
        }


       return name;
    }


    private static String Capitalize(String name){
        return String.valueOf(name.charAt(0)).toUpperCase() + name.substring(1, name.length()).toLowerCase();
    }
}
