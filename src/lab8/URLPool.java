package lab8;

import lab7.URLDepthPair;

import java.util.LinkedList;

public class URLPool {
    LinkedList<URLDepthPair> unchecked = new LinkedList<>();
    LinkedList<URLDepthPair> checked = new LinkedList<>();
    int mDepth;
    int waitThread;

    public URLPool(int maxDepth) {
        this.mDepth = maxDepth;
        waitThread = 0;
    }


    public synchronized URLDepthPair getPair() {
        while (unchecked.size() == 0) {
            waitThread++;
            try {
                wait();
            }
            catch (InterruptedException e) {
                System.out.println("Ignoring InterruptedException");
            }
            waitThread--;
        }
        return unchecked.removeFirst();
    }

    public synchronized void addPair(URLDepthPair pair) {
        if (!(checked.contains(pair))){
            checked.add(pair);
            if (pair.getDepth() < mDepth) {
                unchecked.add(pair);
                notify();
            }
        }
    }

    public synchronized int getWait() {
        return waitThread;
    }

    public LinkedList<URLDepthPair> getChecked() {
        return checked;
    }
}