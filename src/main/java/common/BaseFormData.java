package common;

/**
 * Created by Suresh kumar on 06-05-2017.
 */
public class BaseFormData implements Completable{
    private boolean complete;

    @Override
    public boolean isComplete() {
        return false;
    }

    @Override
    public void setComplete(boolean complete) {
        this.complete = complete;
    }
}
