import java.util.ArrayList;
import java.util.List;

public class Blog implements Subject{

    private List<Observer> subscribers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer){
        subscribers.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer){
        subscribers.remove(observer);
    }

    @Override
    public void notifyObserver(String message){
        for (Observer observer : subscribers){
            observer.update(message);
        }
    }

    public void postEntrance(String title){
        String message = "New entrance: '" + title + "' has been published";
        notifyObserver(message);
    }
}
