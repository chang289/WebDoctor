package webdoctor.service;

import com.google.gson.Gson;
import org.springframework.stereotype.Service;
import webdoctor.jooq.tables.pojos.Symptom;


/**
 * Created by IAN on 2016/10/10.
 */


@Service
public class Search {
    Gson gson = new Gson();
    public void searchByName(String name) {
        return;
    }

    public void searchByTags(String Json) {
        Symptom[] symptoms = gson.fromJson(Json, Symptom[].class);
        return;
    }
}
