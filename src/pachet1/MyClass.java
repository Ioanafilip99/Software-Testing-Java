package pachet1;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class MyClass {

    static class Interval {
        int a,b;

        public Interval(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }

    static class Compare implements Comparator<Interval> {
        @Override
        public int compare(Interval i1, Interval i2) {
            return i1.a - i2.a;
        }
    }

    public static void licenta(String inputFile) throws IOException {

        List<Interval> intervals1 = new ArrayList<Interval>();
        List<Interval> intervals2 = new ArrayList<Interval>();
        Interval finalI = new Interval(0,0);
        int k, m, n, i, j, x, y, m1, m2, p1, p2;
        boolean gasit = false;

        Scanner scanner = new Scanner(new File(inputFile));
        k = scanner.nextInt();
        if (k > 60) {
            throw new IllegalArgumentException("K trebuie sa fie mai mic decat 61!");
        }
        else if (k < 1) {
            throw new IllegalArgumentException("K trebuie sa fie mai mare decat 0!");
        }
        else {
            n = scanner.nextInt();
            if (n > 6) {
                throw new IllegalArgumentException("N trebuie sa fie mai mic decat 7!");
            }
            else if (n < 1) {
                throw new IllegalArgumentException("N trebuie sa fie mai mare decat 0!");
            }
            else {
               for(i = 0; i < n; i++) {
                    x = scanner.nextInt();
                    y = scanner.nextInt();
                    intervals1.add(new Interval(x, y));
                }
                m = scanner.nextInt();

                if (m > 6) {
                    throw new IllegalArgumentException("M trebuie sa fie mai mic decat 7!");
                }
                else if (m < 1) {
                    throw new IllegalArgumentException("M trebuie sa fie mai mare decat 0!");
                }
                else {
                    for(i = 0; i < m; i++) {
                        x = scanner.nextInt();
                        y = scanner.nextInt();
                        intervals2.add(new Interval(x, y));
                    }

                    scanner.close();

                    Collections.sort(intervals1, new Compare());
                    Collections.sort(intervals2, new Compare());

                    for(i = 0; i < n && gasit == false; i++) {

                        m1 = intervals1.get(i).a;
                        m2 = intervals1.get(i).b;

                        for(j = 0; j < m && gasit == false; j++) {

                            p1 = intervals2.get(j).a;
                            p2 = intervals2.get(j).b;

                            if((m1 >= p1 && m2 <= p2) && (m2 - m1 >= k)) {
                                finalI.a = m1;
                                gasit = true;
                            }
                            else if((m1 < p1 && m2 > p1 && m2 < p2) && (m2 - p1 >= k)) {
                                finalI.a = p1;
                                gasit = true;
                            }
                            else if((m1 > p1 && m1 < p2 && m2 > p2) && (p2 - m1 >= k)) {
                                finalI.a = m1;
                                gasit = true;
                            }
                            else if((m1 <= p1 && m2 >= p2) && (p2 - p1 >= k)) {
                                finalI.a = p1;
                                gasit = true;
                            }
                        }
                    }

                    finalI.b = finalI.a + k;

                    FileWriter writer = new FileWriter("licenta.out");
                    if(gasit == false) {
                        writer.write("-1");
                    } else {
                        writer.write(finalI.a + " " + finalI.b);
                    }
                    writer.close();

                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        licenta("src/pachet1/PartitionareClaseEchivalenta/1.1.in");
    }
}
