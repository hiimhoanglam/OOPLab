package week9.phonebook;

import java.util.HashMap;

public class PhoneBookMap implements PhoneBook{
    HashMap<String, Student> phoneBook;

    public PhoneBookMap() {
        this.phoneBook = new HashMap<>();
    }

    @Override
    public Student searchByLastname(String lastName) {
        for (Student student: phoneBook.values()) {
            if (student.lastName.equals(lastName)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public Student searchByNumber(String phone) {
        return phoneBook.get(phone);
    }

    @Override
    public void addPerson(Student p) {
        if (p == null) {
            return;
        }
        phoneBook.put(p.phone, p);
    }

    @Override
    public void deleteByNumber(String phone) {
        if (phone == null) {
            return;
        }
        phoneBook.remove(phone);
    }
}
