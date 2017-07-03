package common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Suresh kumar on 06-05-2017.
 */
public abstract class BaseController<T extends Completable> {
    @Autowired
    private HttpServletRequest request;

    private final String path;
    private final String template;
    private final String title;

    public BaseController(String template, String path, String title) {
        this.template = template;
        this.path = path;
        this.title = title;
    }

    protected abstract T get(FormData formData);

    protected abstract void set(FormData formData, T data);


    protected ModelAndView renderForm() {
        FormData formData = loadFormData();
        T t = get(formData);
        ModelAndView view = new ModelAndView(template);
        view.addObject(t);
        return view;
    }

    private FormData loadFormData() {
        return new FormData();
    }


    public ModelAndView onPostForm() {
        // Do some business logic whenever they submit the form.
        return onPostSuccess();
    }

    private ModelAndView onPostSuccess() {
        return new ModelAndView(this.template);
    }

}
