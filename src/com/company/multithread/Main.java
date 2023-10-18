package com.company.multithread;

public class Main {
    static boolean cycle = true;

    public static void main(String[] args) {
        int random = (int) (Math.random() * 1_000_000_000);
        Thread timer = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                try {
                    while (cycle) {
                        System.out.println(i++);
                        Thread.sleep(1000);
                    }
                } catch (InterruptedException e) {
                    System.out.println("Wrong");
                }
            }
        });
        timer.start();
        while (cycle) {
            int randomFind = (int) (Math.random() * 1_000_000_000);
            if (random == randomFind) {
                cycle = false;
                System.out.println(random);

            }
        }
    }
}
