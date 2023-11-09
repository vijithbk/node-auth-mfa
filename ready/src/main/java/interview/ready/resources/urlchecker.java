package interview.ready.resources;

import interview.ready.model.UrlObject;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/checkurl")
public class urlchecker {
    @RequestMapping("/{url}")
    public UrlObject checkUrl(@PathVariable("url") String url) {
        return new UrlObject(url);
    }
}
