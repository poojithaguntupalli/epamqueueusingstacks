import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        LinkedList<Integer> l = new LinkedList<>();
        int t = s.nextInt();
        while (t-->0) {
            int type = s.nextInt();
            if (type == 1) {
                l.add(s.nextInt());
            }
            else if (type == 2) {
                if (!l.isEmpty()) {
                    l.pollFirst();
                }
            }
            else {
                System.out.println(l.getFirst());
            }
        }
    }
}
