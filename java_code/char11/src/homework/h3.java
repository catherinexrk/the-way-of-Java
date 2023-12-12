package homework;

import javax.xml.parsers.SAXParser;

/**
 * @author 陶笛
 */
public class h3 {
    public static void main(String[] args) {
        String name = "han shun ping"

    }

    public static void printName(String str){
        if (str == null){
            System.out.println("字符串不能为空");
            return;
        }
        String[] names = str.split(" ");
        if (names.length != 3){
            System.out.println("输入字符串格式不正确");
            return;
        }

        String.format("%s,%s.%c",names[2],names[0],names[1].toUpperCase().charAt(0));
    }
}
