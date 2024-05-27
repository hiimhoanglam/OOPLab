package week11.iterator.example;

public class EmployeeRepository implements EmployeeIterable{
    public String[] employees;

    public EmployeeRepository() {
        this.employees = new String[]{"David" , " Scott " , "Rhett " , "Andrew" , " Jessica"};
    }

    @Override
    public Iterator getIterator() {
        return new EmployeeIterator();
    }
    private class EmployeeIterator implements Iterator {
        int position;

        public EmployeeIterator() {
            this.position = 0;
        }

        @Override
        public boolean hasNext() {
            return position < employees.length && employees[position] != null;
        }

        @Override
        public Object next() {
            Object nextObject = employees[position];
            position++;
            return nextObject;
        }

        @Override
        public void reset() {
            position = 0;
        }
    }
}
