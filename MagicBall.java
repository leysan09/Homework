package Homework;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        String qu = sc.nextLine();
        String [] answers = {"Бесспорно", "Предрешено", "Никаких сомнений", "Определенно да", "Можешь быть уверен в этом",
                "Вероятнее всего", "Хорошие перспективы", "Пока не ясно, попробуй снова", "Спроси позже", "Лучше не рассказывать",
        "Даже не думай", "Перспективы не очень хорошие", "Весьма сомнтиельно"       };
        int n = random.nextInt(answers.length - 1);

        System.out.println("Задайте вопрос:");
        System.out.println(qu);
        System.out.println("Мой ответ: " + answers[n] + "!");
    }}

