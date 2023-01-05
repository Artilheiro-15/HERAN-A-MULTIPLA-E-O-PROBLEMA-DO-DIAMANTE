import services.ComboDevice;
import services.ConcretePrinter;
import services.ConcreteScanner;

public class App {

  public static void main(String[] args) {
    System.out.println("====================================");

    System.out.println("Aki eu tenho o comportamento da impresora ");
    ConcretePrinter p = new ConcretePrinter("1080");
    p.processDoc("My Letter");
    p.print("My Letter");
    System.out.println("====================================");
    System.out.println("Aki eu tenho o comportamento do Scanner  ");
    ConcreteScanner s = new ConcreteScanner("2003");
    s.processDoc("My Email");
    System.out.println("Scan result: " + s.scan());
    System.out.println("====================================");
    System.out.println("Aki eu tenho o comportamento do combo Device  ");
    ComboDevice c = new ComboDevice("2081");
    c.processDoc("My dissertation");
    c.print("My dissertation");
    System.out.println("Scan result: " + c.scan());
    System.out.println("=================FIM===================");
  }
}
