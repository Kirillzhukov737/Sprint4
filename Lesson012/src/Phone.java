public abstract class Phone {
public final String number;

public Phone(String number) {
        this.number = number;
        }

public final void makeCall(String targetNumber) {
        System.out.println("Звоним с номера " + number);
        System.out.println("Набираем номер " + targetNumber + " и звоним по сотовой связи");
        System.out.println("Привет!");
        }

        public abstract void makeCall(String targetNumber, String appName);
}