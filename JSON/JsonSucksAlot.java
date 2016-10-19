package JSONTesting;

import org.json.simple.JSONObject;

public class JsonSucksAlot {
    // 0 is equal to false
    private int answer = 0;
    // Method
    private void run() {
        JSONObject result = jsonToObj();
        System.out.println("JSON: " + result.toJSONString());

        System.out.println("\nParts of JSON: ");
        System.out.println("value1: " + result.get("value1"));
        System.out.println("value2: " + result.get("value2"));
        System.out.println("value3: " + result.get("value3"));
        System.out.println("value4: " + result.get("value4"));
        System.out.println("value5: " + result.get("value5"));
        System.out.println("value6: " + result.get("value6"));
        System.out.println("answer: " + result.get("answer"));
}

    private JSONObject jsonToObj() {
        JSONObject obj = new JSONObject();

        obj.put("value1", "Is ");
        obj.put("value2", "this ");
        obj.put("value3", "supposed ");
        obj.put("value4", "to ");
        obj.put("value5", "be ");
        obj.put("value6", "easy? ");
        obj.put("answer", this.answer);
        return obj;
    }

    public static void main(String[] args) {
        new JsonSucksAlot().run();
    }
}
