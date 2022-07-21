package ru.skillfactory.qajava.maven;
//должен возвращать true, если в метод передаётся значение
//соответствующее возрасту тинейджеров — тех, кому от 13 до 19 лет
// (thirteen и nineteen).
public class Person {
    public static boolean isTeenager(int age)
    {
        boolean result;
        if (age < 19) {
            result = true;
        }
        else {
            result = false;
        }
        return result;
    }
}