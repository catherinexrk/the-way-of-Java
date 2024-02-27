package homework;

import java.util.ArrayList;

public class hm1 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new News("确诊435345345355345","担忧"));
        arrayList.add(new News("aa","bb"));

        int size = arrayList.size();
        for (int i = size-1; i >= 0 ; i--) {
            News news = (News)arrayList.get(i);
            System.out.println(processTitle((news.getTitle())));
        }
    }

    public static String processTitle(String title){
        if (title.isEmpty()){
            return "";
        }

        if (title.length() > 15){
            return title.substring(0,15) + "...";//截取前15个字符
        } else {
            return title;
        }
    }
}

class News{
    private String title;
    private String content;

    public News(String title, String content) {
        this.title = title;
        this.content = content;
    }

    @Override
    public String toString() {
        return "News{" +
                "title='" + title + '\'' ;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
