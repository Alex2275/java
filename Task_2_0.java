
// Task_0
// public class Task {

// // Посчитайте сколько драгоценных камней в куче обычных камней
// // Пример:
// // jewels = “aB”, stones = “aaaAbbbB”
// // Результат в консоль ”a3B1”
// public static void main(String[] args) {

// }

// public String findJewelsInStones(String jewels, String stones) {

//     return "";
// }
// }
package WorkHome;

public class Task_2_0 {
  public static void main(String[] args) {
    String jewels = "aB";
    String stones = "aaaAbbbB";
    String result = "";
    for (int i = 0; i < jewels.length(); i++) {
      int count = 0;
      for (int j = 0; j < stones.length(); j++) {
        if (jewels.charAt(i) == stones.charAt(j)) {
          count++;
          stones = stones.substring(0, j) + stones.substring(j + 1);
          j--;
        }
      }
      result += jewels.charAt(i) + "" + count;
    }
    System.out.println(result);
  }
}