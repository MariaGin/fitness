package service;

import service.Worker;

public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker("Гинтовт Мария Сергеевна", 20, 120);
        Worker worker1 = new Worker("Моховиков Иван Ильич", 20, 100);
        Worker worker2 = new Worker("Шапневская Полина Сергеевна", 20, 80);

        Count count = new Count();
        count.countWage(worker);
        count.countWage(worker1);
        count.countWage(worker2);

    }
}