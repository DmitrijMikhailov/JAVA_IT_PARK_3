package com.company;

import java.util.Deque;
import java.util.LinkedList;

public class ThreadPool {
    private PoolWorker[] threads;
    private Deque<Runnable> tasks;
    // флаг останова
    private boolean isStopped = false;

    public ThreadPool(int threadCount) {
        threads = new PoolWorker[threadCount];
        tasks = new LinkedList<>();
        for (int i = 0; i < threadCount; i++) {
            threads[i] = new PoolWorker();
            threads[i].start();
        }
    }

    public void submitTask(Runnable task) {
        if (!isStopped) {
            synchronized (tasks) {
                tasks.addLast(task);
                tasks.notify();
            }
        }
    }

    // метод останова
    public void shutdown() {
        isStopped = true;
    }

    private class PoolWorker extends Thread{

        public void run() {
            System.out.println(Thread.currentThread().getName() + " запущен");
            Runnable task;
            while (!isStopped) {
                synchronized (tasks) {
                    while (tasks.isEmpty()) {
                        try {
                            tasks.wait();
                        } catch (InterruptedException e) {
                            throw new IllegalArgumentException(e);
                        }
                    }
                    task = tasks.removeFirst();
                }
                task.run();
            }
        }
    }
}