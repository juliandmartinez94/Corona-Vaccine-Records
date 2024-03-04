// Domain class CoronaVaccineRecord with its (5) attributes that make up a patients corona vaccine records
public class CoronaVaccineRecord {
    private String nameVaccineManufacturer;
    private String dateFirstShot; // format mm/dd/yyy
    private String dateSecondShot;
    private String dateBoosterShot;
    private String vaccineSite;

    // Constructor
    public CoronaVaccineRecord(String nameVaccineManufacturer, String dateFirstShot,
                               String dateSecondShot, String dateBoosterShot,
                               String vaccineSite)
    {
        this.nameVaccineManufacturer = nameVaccineManufacturer;
        this.dateFirstShot = dateFirstShot;
        this.dateSecondShot = dateSecondShot;
        this.dateBoosterShot = dateBoosterShot;
        this.vaccineSite = vaccineSite;

    }
    //(5) Getter Methods
    public String getNameVaccineManufacturer()
    {
        return nameVaccineManufacturer;
    }
    public String getDateFirstShot()
    {
        return dateFirstShot;
    }
    public String getDateSecondShot()
    {
        return dateSecondShot;
    }
    public String getDateBoosterShot()
    {
        return dateBoosterShot;
    }
    public String getVaccineSite()
    {
        return  vaccineSite;
    }

    // (5) Setter Methods for each attribute

    public void setNameVaccineManufacturer(String vaccineManufacturer)
    {
        this.nameVaccineManufacturer = nameVaccineManufacturer;
    }
    public void setDateFirstShot(String dateFirstShot)
    {
        this.dateFirstShot = dateFirstShot;
    }
    public void setDateSecondShot(String dateSecondShot)
    {
        this.dateSecondShot = dateSecondShot;
    }
    public void setDateBoosterShot(String dateBoosterShot)
    {
        this.dateBoosterShot = dateBoosterShot;
    }
    public void setVaccineSite(String vaccineSite)
    {
        this.vaccineSite = vaccineSite;
    }

    // toString --> returns string representation of entire object

    public String toString()
    {
        return "CoronaVaccineRecord {manufacturer= " + nameVaccineManufacturer + ", dateFirstShot= " + dateFirstShot
                + ", dateSecondShot= " + dateSecondShot + ", dateBoosterShot= " + dateBoosterShot
                + ", vaccinationSite= " + vaccineSite + " }";
    }
}
