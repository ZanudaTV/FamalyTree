import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        FamilyTree test = new FamilyTree();
        Service service = new Service(test);

        service.addHuman("Андрей", "Ломов", LocalDate.of(1976, 11, 21), Sex.male);
        service.addHuman("Лера", "Пробоева", LocalDate.of(1978, 6, 15), Sex.female);
        service.addHuman("Артур", "Ломов", LocalDate.of(2001, 3, 8),
                Sex.male, service.getFamilyGroup().familyTree.get(0), service.getFamilyGroup().familyTree.get(1));
        service.addHuman("Крис", "Вскрывакина", LocalDate.of(2003, 1, 27), Sex.female);
        service.addHuman("Алина", "Ломова", LocalDate.of(2022, 8, 18),
                Sex.female, service.getFamilyGroup().familyTree.get(2),service.getFamilyGroup().familyTree.get(3));

        service.sortByLastName();
        for (Human item: test) {
            System.out.println(item);

        }
    }
}