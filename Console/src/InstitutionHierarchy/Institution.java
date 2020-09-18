package InstitutionHierarchy;

import java.util.Calendar;

abstract public class Institution {
    String Name;
    String Address;
    int FoundationYear;
    public Institution(String name, String address, int foundationYear) throws IllegalArgumentException{
        if(foundationYear < 0 || foundationYear > Calendar.getInstance().getWeekYear()){
            throw new IllegalArgumentException("Not correct Foundation year");
        }
        this.Address =address;
        this.Name = name;
        this.FoundationYear = foundationYear;
    }

    public String getAddress() {
        return Address;
    }
    public String getName(){
        return Name;
    }
    public int getFoundationYear()
    {
        return  FoundationYear;
    }

    @Override
    public String toString() {
        return "Institution{" +
                "Name='" + Name + '\'' +
                ", Address='" + Address + '\'' +
                ", FoundationYear=" + FoundationYear +
                '}';
    }
}
