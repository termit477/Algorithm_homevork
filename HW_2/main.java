package HW_2;

// Необходимо реализовать метод разворота связного списка (двухсвязного или односвязного на выбор).

public class main {
    public static void main(String[] args) {
        TwoWayList<Integer> intList = new TwoWayList<>();

        intList.add(34);
        intList.add(54);
        intList.add(12);
        intList.add(75);
        intList.add(11);
        
        
        TwoWayList.print();
        System.out.println("Размернутый список: ");
        TwoWayList.revert();
        TwoWayList.print();
    }
}