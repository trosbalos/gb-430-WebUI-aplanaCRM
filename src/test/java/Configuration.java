import com.github.javafaker.Faker;

public class Configuration {
    Faker faker = new Faker();
    public String BASE_URL = "https://crm.geekbrains.space/";
    public String USER_LOGIN = "Applanatest";
    public String USER_PASSWORD = "Student2020!";
    public String RANDOM_NAME = faker.artist().name() ;
    public String RANDOM_JOB = faker.company().name();
    public String RANDOM_NAME_COMPANY = RANDOM_NAME + " " + RANDOM_JOB;
    public String TEST_ORGANISATION = "Test Organisation_100";
    public String CONTACT_PERSON = "Антонов Семен";


}
