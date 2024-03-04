/**
 * Julian Martinez 3966887
 * Title: Creating and Using Objects
 * Semester: COP 2210, Fall 2023
 * Professor's Name(s): Prof. Charters , Niki Zarkub
 * Description of Program's Functionality:
 *      This program asks 3 different patients for the input of their Corona vaccination record as well as their
 *      personal information. The system will then output the three different patients vaccination records and
 *      identifiers.
 */

// Driver Class with scanner keyboard as a global variable.

import java.util.Scanner;
public class CountyVaccinations {
    public static Scanner keyboard = new Scanner(System.in);

    //Main method initiates each Patient info and vaccine record as well as report vaccinations for each

    public static void main(String[] args){

        CoronaVaccineRecord vaccineRecord1 = createAVaccineRecord();
        Patient patient1 = createAPatient(vaccineRecord1);

        CoronaVaccineRecord vaccineRecord2 = createAVaccineRecord();
        Patient patient2 = createAPatient(vaccineRecord2);

        CoronaVaccineRecord vaccineRecord3 = createAVaccineRecord();
        Patient patient3 = createAPatient(vaccineRecord3);

        reportVaccinations(patient1);
        reportVaccinations(patient2);
        reportVaccinations(patient3);
    }
    // createAVaccineRecord method will ask patient for vaccination data and return the data.
    public static CoronaVaccineRecord createAVaccineRecord(){
        System.out.println("+++++++++ Let's collect the vaccination data: +++++++++");
        System.out.println("What is the name of your vaccine manufacturer? ");
        String nameVaccineManufacturer = keyboard.nextLine();
        System.out.println("When was your first shot? (mm/dd/yyyy) ");
        String dateFirstShot = keyboard.nextLine();
        System.out.println("When was your second shot? (mm/dd/yyyy) ");
        String dateSecondShot = keyboard.nextLine();
        System.out.println("When was your booster shot? (mm/dd/yyy) ");
        String dateBoosterShot = keyboard.nextLine();
        System.out.println("Where was the site of the vaccination? (ex: CVS, Walgreens, etc.) ");
        String vaccineSite = keyboard.nextLine();

        // Object
        CoronaVaccineRecord coronaVaccineRecord = new CoronaVaccineRecord(nameVaccineManufacturer, dateFirstShot,
                dateSecondShot, dateBoosterShot, vaccineSite);

        return coronaVaccineRecord;
    }
    // createAPatient method with argument vaccineRecord will ask patient for personal information and return it along
    // with the vaccineRecord argument.
    public static Patient createAPatient(CoronaVaccineRecord vaccineRecord){
        System.out.println("******* Let's collect the patient's data: ******");
        System.out.println("What is your first name? ");
        String firstName = keyboard.nextLine();
        System.out.println("What is your last name? ");
        String lastName = keyboard.nextLine();
        System.out.println("What is your date of birth? (mm/dd/yyy) ");
        String dateOfBirth = keyboard.nextLine();

        //Object
        Patient patient = new Patient(firstName, lastName, dateOfBirth, vaccineRecord);

        return patient;
    }

    // reportVaccinations method aPatient argument will display the patients name along with their
    // individual vaccination record. 
    public static void reportVaccinations(Patient aPatient){
        System.out.println("Here is the vaccination record for " + aPatient.getFirstName() + " " +
                aPatient.getLastName() + ":");
        System.out.println(aPatient);
    }
}
