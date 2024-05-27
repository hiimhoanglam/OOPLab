package week9.phonebook;

public interface PhoneBook {
    Student searchByLastname(String lastName);
    Student searchByNumber(String phone);
    void addPerson(Student p);
    void deleteByNumber(String phone);
}
