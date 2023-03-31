/*
Введите с клавиатуры строку. Найти в строке не только запятые, но и другие знаки препинания.
Подсчитать общее их количество.
 */
public class Main {
    public static void main(String[] args) {
        String str = "!?,.!";
        char[] c = str.toCharArray();
        int num = 0;
        for (char value : c) {
            if (value == '!' || value == '?' || value == ',' || value == '.') {
                num++;
            }
        }
        System.out.println(num);
    }
}