package api.v1.Services;

import net.minidev.json.JSONObject;

import java.util.List;

/**
 * Created by cristi on 5/5/17.
 */
public interface StepsService {
    List<JSONObject> getStepsByUuid(String uuid);
}
