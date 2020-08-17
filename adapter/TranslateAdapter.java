package design.adapter;

public class TranslateAdapter extends Chinese implements English {

    @Override
    public void speakEnglish() {
        String s = speakChinese();
        System.out.println("适配器正在翻译{"+s+"}...");
        System.out.println("Hello,where is the library?");
    }
}
