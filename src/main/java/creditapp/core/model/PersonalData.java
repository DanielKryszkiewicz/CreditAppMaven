package creditapp.core.model;

import creditapp.client.ConsoleReader;

public class PersonalData {
    private final String name;
    private final String lastName;
    private final String mothersMaidenName;
    private final double income;
    private final MartialStatus martialStatus;
    private final int numOfFamilyDependants;
    private final Education education;

    public PersonalData(String name, String lastName, String mothersMaidenName, double income, MartialStatus martialStatus, int numOfFamilyDependants, Education education) {
        this.name = name;
        this.lastName = lastName;
        this.mothersMaidenName = mothersMaidenName;
        this.income = income;
        this.martialStatus = martialStatus;
        this.numOfFamilyDependants = numOfFamilyDependants;
        this.education = education;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMothersMaidenName() {
        return mothersMaidenName;
    }

    public double getIncome() {
        return income;
    }

    public MartialStatus getMartialStatus() {
        return martialStatus;
    }

    public int getNumOfFamilyDependants() {
        return numOfFamilyDependants;
    }

    public Education getEducation() {
        return education;
    }
}

