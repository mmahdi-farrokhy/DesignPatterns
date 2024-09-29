package FlyWeight.Faker;

public class UserProfile {
    private String gender;
    private int age;
    private String province;

    public UserProfile(String gender, int age, String province) {
        this.gender = gender;
        this.age = age;
        this.province = province;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getProvince() {
        return province;
    }
}
