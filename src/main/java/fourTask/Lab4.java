package fourTask;

// var. 21984
public class Lab4 {
    public static void main(String[] args) {
        E a = new E();
        E b = new H();
        H c = new H();
        a.t38();
        c.t24();
        c.t16();
        b.t43();
        c.t13();
        b.t6();
        a.t15();
        b.t37();
        c.t14();
        a.t5();
        a.t46(a);
        b.t46(b);
        a.t46(c);
        c.t21();
        c.t44();
        c.t17();
        Thread t = new Thread(new Runnable() {
            public void run() {
                while(true) {
                    try {
                        H d = new H();
                        d.t35();
                        Thread.sleep(9);
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
}
class E {
    int t9;
    int t47;
    int t30;
    int t36;
    int t1;
    long t40;
    long t45;
    long t42;
    java.io.ObjectOutputStream fileStrm;
    java.io.ObjectOutputStream printWrtr;
    java.io.ObjectOutputStream fileWriter;
    int[] t31 = {3, -2, 3, -2, 2};
    int[] t8 = {3, 0, -2, 3};
    int[] t33 = {3, 0, 1, 3, 0};
    static java.util.Map<java.net.URI,byte[]> cache = new java.util.HashMap<>();
    static int t20;
    static int t41;
    static int t3;
    static int t39;
    static int t12;
    static java.util.List<String> t4 = new java.util.ArrayList<>();
    static java.util.List<String> t11 = new java.util.ArrayList<>();
    static java.util.List<String> t49 = new java.util.ArrayList<>();
    public E() {
        t9 = 9;
        t47 = 9;
        t30 = 1;
        t36 = 2;
        t1 = 5;
        t40 = 2L;
        t45 = 7L;
        t42 = 3L;
        try {
            fileStrm = new java.io.ObjectOutputStream(new java.io.FileOutputStream("fileStrm.txt"));
            printWrtr = new java.io.ObjectOutputStream(new java.io.FileOutputStream("printWrtr.txt"));
            fileWriter = new java.io.ObjectOutputStream(new java.io.FileOutputStream("fileWriter.txt"));
        } catch (java.lang.Exception e) {
            // Do nothing
        }
    }
    public void init() {
        try {
            if (fileStrm == null) fileStrm = new java.io.ObjectOutputStream(new java.io.FileOutputStream("fileStrm.txt"));
            System.out.println("Thread : " + Thread.currentThread() + ", fileStrm = " + fileStrm);
        } catch(Exception e) {
            // Ignore it
        }
        try {
            if (printWrtr == null) printWrtr = new java.io.ObjectOutputStream(new java.io.FileOutputStream("printWrtr.txt"));
            System.out.println("Thread : " + Thread.currentThread() + ", printWrtr = " + printWrtr);
        } catch(Exception e) {
            // Ignore it
        }
        try {
            if (fileWriter == null) fileWriter = new java.io.ObjectOutputStream(new java.io.FileOutputStream("fileWriter.txt"));
            System.out.println("Thread : " + Thread.currentThread() + ", fileWriter = " + fileWriter);
        } catch(Exception e) {
            // Ignore it
        }
    }
    public byte[] getValueFromCache(String s) {
        try {
            java.net.URI url = new java.net.URI(s);
            if(!cache.containsKey(url)) {
                cache.put(url, new byte[786432]);
            }
            return cache.get(url);
        } catch (Exception e) {
            System.out.println("Error: invalid URL!");
            return null;
        }
    }
    public void t38() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                init();
                int i = 0;
                while(true) {
                    i++;
                    try {
                        synchronized(printWrtr) {
                            printWrtr.writeObject("метод t38 в классе E (#" + String.valueOf(i) + ")");
                            Thread.sleep(6);
                            printWrtr.flush();
                            printWrtr.reset();
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public void t24() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                init();
                int i = 0;
                while(true) {
                    i++;
                    try {
                        synchronized(printWrtr) {
                            printWrtr.writeObject("метод t24 в классе E (#" + String.valueOf(i) + ")");
                            Thread.sleep(5);
                            printWrtr.reset();
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public void t16() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                init();
                int i = 0;
                while(true) {
                    i++;
                    try {
                        synchronized(fileStrm) {
                            fileStrm.writeObject("метод t16 в классе E (#" + String.valueOf(i) + ")");
                            Thread.sleep(6);
                            fileStrm.reset();
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public void t43() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                init();
                int i = 0;
                while(true) {
                    i++;
                    try {
                        synchronized(fileWriter) {
                            fileWriter.writeObject("метод t43 в классе E (#" + String.valueOf(i) + ")");
                            Thread.sleep(6);
                            fileWriter.flush();
                            fileWriter.reset();
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public void t13() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                init();
                int i = 0;
                while(true) {
                    i++;
                    try {
                        synchronized(fileStrm) {
                            fileStrm.writeObject("метод t13 в классе E (#" + String.valueOf(i) + ")");
                            Thread.sleep(5);
                            fileStrm.reset();
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public void t6() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                init();
                int i = 0;
                while(true) {
                    i++;
                    try {
                        synchronized(printWrtr) {
                            printWrtr.writeObject("метод t6 в классе E (#" + String.valueOf(i) + ")");
                            Thread.sleep(5);
                            printWrtr.flush();
                            printWrtr.reset();
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public static void t15() {
        System.out.println("метод t15 в классе E");
        System.out.println(t20);
    }
    public static void t37() {
        System.out.println("метод t37 в классе E");
        System.out.println((t20 - 5));
    }
    public static void t14() {
        System.out.println("метод t14 в классе E");
        System.out.println(t41);
    }
    public static void t5() {
        System.out.println("метод t5 в классе E");
        System.out.println((t41 - 4));
    }
    public void t46(E r) {
        r.t38();
    }
    public void t46(H r) {
        r.t24();
    }
}
class H extends E {
    public H() {
        t9 = 9;
        t47 = 9;
        t36 = 7;
        t1 = 1;
        t45 = 6L;
        t42 = 8L;
    }
    public void t24() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                init();
                int i = 0;
                while(true) {
                    i++;
                    try {
                        synchronized(fileWriter) {
                            fileWriter.writeObject("метод t24 в классе H (#" + String.valueOf(i) + ")");
                            Thread.sleep(5);
                            fileWriter.flush();
                            fileWriter.reset();
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public void t43() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                init();
                int i = 0;
                while(true) {
                    i++;
                    try {
                        synchronized(printWrtr) {
                            printWrtr.writeObject("метод t43 в классе H (#" + String.valueOf(i) + ")");
                            Thread.sleep(12);
                            printWrtr.reset();
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public void t13() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                init();
                int i = 0;
                while(true) {
                    i++;
                    try {
                        synchronized(fileWriter) {
                            fileWriter.writeObject("метод t13 в классе H (#" + String.valueOf(i) + ")");
                            Thread.sleep(13);
                            fileWriter.reset();
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public void t6() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                init();
                int i = 0;
                while(true) {
                    i++;
                    try {
                        synchronized(fileStrm) {
                            fileStrm.writeObject("метод t6 в классе H (#" + String.valueOf(i) + ")");
                            Thread.sleep(12);
                            fileStrm.flush();
                            fileStrm.reset();
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public void t21() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                while(true) {
                    try {
                        synchronized(cache) {
                            getValueFromCache("https://www.google.com");
                            Thread.sleep(11);
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public void t44() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                while(true) {
                    try {
                        synchronized(cache) {
                            getValueFromCache("https://www.google.com");
                            Thread.sleep(11);
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public void t17() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                while(true) {
                    try {
                        synchronized(cache) {
                            getValueFromCache("https://www.google.com");
                            Thread.sleep(11);
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public static void t15() {
        System.out.println("метод t15 в классе H");
        System.out.println(--t20);
    }
    public static void t37() {
        System.out.println("метод t37 в классе H");
        System.out.println(t41);
    }
    public static void t14() {
        System.out.println("метод t14 в классе H");
        System.out.println((t41 - 2));
    }
    public static void t5() {
        System.out.println("метод t5 в классе H");
        System.out.println(t41);
    }
    public void t10() {
        for(int i = 0; i < 8; i++) {
            this.t49.add(String.valueOf(System.nanoTime()));
            // System.out.println(this.t49.size());
        }
    }
    public void t32() {
        for(int i = 0; i < 9; i++) {
            this.t4.add(String.valueOf(System.nanoTime()));
            // System.out.println(this.t4.size());
        }
    }
    public void t35() {
        for(int i = 0; i < 6; i++) {
            this.t11.add(String.valueOf(System.nanoTime()));
            // System.out.println(this.t11.size());
        }
    }
    public void t22() {
        for(int i = 0; i < 5; i++) {
            this.t11.add(String.valueOf(System.nanoTime()));
            // System.out.println(this.t11.size());
        }
    }
    public void t46(E r) {
        r.t16();
    }
    public void t46(H r) {
        r.t43();
    }
}