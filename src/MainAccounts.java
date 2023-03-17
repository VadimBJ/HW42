import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainAccounts {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    List<Account> list1 = readAccountList(br);
    for (Account account : list1) {
      account.increaseReputation(10);
    }
    List<Account> list2 = readAccountList(br);
    for (Account account : list2) {
      account.decreaseReputation(10);
    }

    Set<Account> accounts = new HashSet<>();
    accounts.addAll(list1);
    accounts.addAll(list2);

    System.out.println("Найдено всего " + accounts.size() + " уникальных записей:");
    for (Account account : accounts) {
      System.out.println("- " + account);
    }
  }

  public static List<Account> readAccountList(BufferedReader br) throws IOException {
    System.out.print("Введите количество учётных записей в списке: ");
    int n = Integer.parseInt(br.readLine());
    List<Account> result = new ArrayList<>(n);
    for (int k = 1; k <= n; ++k) {
      System.out.println("Введите данные учётной записи №" + k + ":");
      result.add(readAccount(br));
    }
    return result;
  }

  public static Account readAccount(BufferedReader br) throws IOException {
    Account tmpAcc = null;
    try {
      System.out.print("Введите имя: ");
      String name = br.readLine();
      System.out.print("Введите e-mail: ");
      String email = br.readLine();
      tmpAcc = new Account(name, email);
    } catch (InvalidEmail e) {
      System.err.println(e.getMessage());
      System.exit(0);
    }
    return tmpAcc;
  }
}