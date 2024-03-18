package writer;

//做成处理流
public class BufferReader_ extends Reader_{
    private Reader_ reader_;

    public BufferReader_(Reader_ reader_){
        this.reader_ = reader_;
    }
}
