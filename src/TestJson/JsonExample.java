package TestJson;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.Optional;


public class JsonExample {
    public static void main(String[] args) {
        String json = "{\"exchangeRate\":\"1650\"," + "\"externalPaymentDetails\":\"{"
                      + "subscriberId=12054" + "smartCardId=0212458" +
                      "providerName=StarTimes" + "tvPackage=StarTimes" +
                      "expirationDate=14/03/2023}\"}";
        JsonObject jsObject = new JsonParser().parse(json).getAsJsonObject();

        Optional<JsonElement> jsonElement = Optional.ofNullable(jsObject.get("exchangeRate"));

        if (jsonElement.isPresent()) {
            System.out.println(jsonElement.get().getAsString());
        } else {
            System.out.println();
        }

        JsonElement el = jsObject.get("externalPaymentDetails");
        System.out.println(el.getAsString());
//        JsonElement ell = jsObject.get("test");
//        System.out.println(ell.getAsString());


    }
}
