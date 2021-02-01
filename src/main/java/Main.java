import java.util.Locale;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Доктор: Добрий день, що вас турбує?");
        while (true) {
            String message = scanner.nextLine();
            if (message.length()<5) {
                System.out.println("Доктор: Bи так багатословні.");
                continue;
            }else if (message.toLowerCase(Locale.ROOT).contains("може")) {
                System.out.println("Доктор: Bи в цьому впевнені?");
                continue;
            } else if (message.toLowerCase(Locale.ROOT).contains("хворію")) {
                System.out.println("Доктор: Давайте подивимость що з цим можно зробити. Що вас турбує?");
                continue;
            } else if (message.toLowerCase(Locale.ROOT).contains("болит")) {
                if (message.toLowerCase(Locale.ROOT).contains("горло")) {
                    System.out.println("Доктор: Вам потрібен спрей від горла.");
                } else if (message.toLowerCase(Locale.ROOT).contains("очі")) {
                    System.out.println("Доктор: Вам потрібен каплі для очей.");
                } else if (message.toLowerCase(Locale.ROOT).contains("серце")) {
                    System.out.println("Доктор: Йдіть на кардіограму.");
                } else if (message.toLowerCase(Locale.ROOT).contains("печінка")) {
                    System.out.println("Доктор: Вам потрібно менше пити.");
                } else {
                    System.out.println("Доктор: це дуже погано. Роскажіть детальніше.");
                }
                continue;
            } else if (message.toLowerCase(Locale.ROOT).contains("зломав")) {
                if (message.toLowerCase(Locale.ROOT).contains("руку")) {
                    System.out.println("Доктор: Давайте накладемо вам гіпс.");
                } else if (message.toLowerCase(Locale.ROOT).contains("ногу")) {
                    System.out.println("Доктор: Давайте накладемо вам гіпс и вам потрібні будуть костилі.");
                } else if (message.toLowerCase(Locale.ROOT).contains("ребр")) {
                    System.out.println("Доктор: Давайте зробимо вам пов'язку.");
                } else if (message.toLowerCase(Locale.ROOT).contains("коліно")) {
                    System.out.println("Доктор: колись і мене вела дорога пригод а потім мені прострелили коліно.");
                } else {
                    System.out.println("Доктор: це дуже погано. Роскажіть детальніше.");
                }
                continue;
            } else if (message.toLowerCase(Locale.ROOT).contains("люблю")) {
                if (message.toLowerCase(Locale.ROOT).contains("яблука")){
                    System.out.println("Доктор: Я теж люблю фрукти.");
                } else if (message.toLowerCase(Locale.ROOT).contains("ком'ютери")){
                    System.out.println("Доктор: Ви маєте здібності до техніки.");
                } else {
                    System.out.println("Доктор: Що ще ви любите?");
                }
            } else {
                int generationNumber = (int) (1 + Math.random() * 5);
                switch (generationNumber){
                    case 1:
                        System.out.println("Доктор: Я Вас не дуже розумію.");
                        break;
                    case 2:
                        System.out.println("Доктор: Давайте поговоримо про щось інше.");
                        break;
                    case 3:
                        System.out.println("Доктор: Сумнівно.");
                        break;
                    case 4:
                        System.out.println("Доктор: Треба подумати.");
                        break;
                    case 5:
                        System.out.println("Доктор: Дуже цікаво. Роскажіть детальніше.");
                        break;
                }
            }
        }
    }
}
