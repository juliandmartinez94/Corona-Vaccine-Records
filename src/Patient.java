// Domain class Patient with its (4) attributes including the patients vaccine record.
public class Patient {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private CoronaVaccineRecord vaccineRecord;

    //Constructor
    public Patient(String firstName, String lastName, String dateOfBirth, CoronaVaccineRecord coronaVaccineRecord)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.vaccineRecord = coronaVaccineRecord;
    }

    // (4) Getter Methods
    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public String getDateOfBirth()
    {
        return dateOfBirth;
    }
    public CoronaVaccineRecord getCoronaVaccineRecord(){
        return vaccineRecord;
    }

    // (4) Setter Methods
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    public void setDateOfBirth(String dateOfBirth)
    {
        this.dateOfBirth = dateOfBirth;
    }
    public void setCoronaVaccineRecord(CoronaVaccineRecord coronaVaccineRecord){
        this.vaccineRecord = coronaVaccineRecord;
    }

    // toString --> returns string representation of entire object
    public String toString()
    {
        return "Patient{firstName= " + firstName + " ,lastName= " + lastName + " ,dateOfBirth= " + dateOfBirth
                + ", vaccine=" + vaccineRecord + "}";
    }
}
