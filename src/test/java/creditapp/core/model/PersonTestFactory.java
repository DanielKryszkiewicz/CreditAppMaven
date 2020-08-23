package creditapp.core.model;

public class PersonTestFactory {


    public static Person create(double income, int numOfDependants) {
        PersonalData personalData = new PersonalData("Ddd", "ddd", "ddd", income, MartialStatus.DIVORCED, numOfDependants, Education.TERTIARY);
        return new Person(personalData, null);
    }

    public static Person create(Education education) {
        PersonalData personalData = new PersonalData("Ddd", "ddd", "ddd", 5000, MartialStatus.DIVORCED, 2, education);
        return new Person(personalData, null);
    }

    public static Person create(MartialStatus martialStatus) {
        PersonalData personalData = new PersonalData("Ddd", "ddd", "ddd", 5000, martialStatus, 2, Education.TERTIARY);
        return new Person(personalData, null);
    }

    public static Person create(double income, int numOfDependants, Education education, MartialStatus martialStatus) {
        PersonalData personalData = new PersonalData("test", "test", "test", income, martialStatus, numOfDependants, education);
        return new Person(personalData, null);
    }
}






