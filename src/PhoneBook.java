import java.util.HashMap;

public class PhoneBook {
    HashMap<String, String> phones = new HashMap<>();

    public void putPhone(String fullName, String phoneNumber){
        phones.put(fullName, phoneNumber);
    }

    public HashMap<String, String> getPhones() {
        return phones;
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "phones=" + phones +
                '}';
    }
}
