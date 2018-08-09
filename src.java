package cn.itcast.day09.demo06;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Demo08 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("practise-code\\src\\whatever\\b.txt");

        Map<Character, Integer> map = new HashMap<>();
        int len;
        while((len = fr.read()) != -1) {
            if (map.containsKey((char)len)) {
                int count = map.get((char)len);
                count++;
                map.put((char)len, count);
            }else {
                map.put((char)len, 1);
            }
        }
        fr.close();
        System.out.println(map.get('a'));
    }
}
