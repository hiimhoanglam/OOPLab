package week9.phonebook;

import java.util.ArrayList;

public class PhoneBookList implements PhoneBook{
    ArrayList<Student> phoneBook;

    public PhoneBookList() {
        this.phoneBook = new ArrayList<>();
    }

    @Override
    public Student searchByLastname(String lastName) {
        for (Student student: phoneBook) {
            if (student.lastName.equals(lastName)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public Student searchByNumber(String phone) {
        for (Student student: phoneBook) {
            if (student.phone.equals(phone)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public void addPerson(Student p) {
        if (p == null) {
            return;
        }
        this.phoneBook.add(p);
    }

    @Override
    public void deleteByNumber(String phone) {
        phoneBook.remove(searchByNumber(phone));
    }
}
