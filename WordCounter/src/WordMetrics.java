public class WordMetrics
{
    public WordMetrics(String word, Integer usage){
        this.word = word;
        this.usage = usage;
    }


    public String word;
    public Integer usage;

    public void increment() {
        usage++;
    }

    public String Print() {
        StringBuilder sb = new StringBuilder();
        sb.append(word);

        for (int i = word.length();i< 30;i++){
            sb.append(" ");
        }

        sb.append(":");
        sb.append(usage);
        return sb.toString();
    }
}
