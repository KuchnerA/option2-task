public class Main {

    public static void main(String[] args) {
        String text = "XYBY. BY/+ X";

        if (isPalindrome(text)) {
            System.out.print("Palindrome");
        }
        else {
            System.out.print("Not Palindrome");
        }
    }

    public static boolean isPalindrome(String text) {
        text = text.replaceAll("\\W","");//удаляем все ненужное
        StringBuilder sb = new StringBuilder(text);
        sb.reverse(); //переворачиваем строку
        String sbResult = sb.toString();//присваиваем перевернутую строку

        return text.equalsIgnoreCase(sbResult) ;//возвращаем сравнение двух строк вне зависимости от регистра

    }
}
