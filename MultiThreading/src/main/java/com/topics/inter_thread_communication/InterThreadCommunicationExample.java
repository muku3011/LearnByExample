package com.topics.inter_thread_communication;

/**
 *  Wait and Notify()
 */
class InterThreadCommunicationExample {
    private int amount = 10000;

    synchronized void withdraw(int amount) {
        System.out.println("going to withdraw...");

        if (this.amount < amount) {
            System.out.println("Less balance; waiting for deposit...");
            try {
                wait();
            } catch (Exception e) {
                System.out.println(e.getLocalizedMessage());
            }
        }
        this.amount -= amount;
        System.out.println("withdraw completed...");
    }

    synchronized void deposit(int amount) {
        System.out.println("going to deposit...");
        this.amount += amount;
        System.out.println("deposit completed... ");
        notify();
    }
}

class RunInterThreadCommunication {
    public static void main(String[] args) {
        final InterThreadCommunicationExample c = new InterThreadCommunicationExample();
        new Thread(() -> c.withdraw(15000)).start();
        new Thread(() -> c.deposit(10000)).start();

    }
}
