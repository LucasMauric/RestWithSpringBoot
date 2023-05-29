package br.com.erudito;

public class Greeting{
    private final long Id;
    private final String Content;

    public Greeting(String content,long id){
        this.Id = id;
        this.Content = content;
    }
    
    public long getId(){
        return Id;
    }
    public String getContent(){
        return Content;
    }
    
    
}
